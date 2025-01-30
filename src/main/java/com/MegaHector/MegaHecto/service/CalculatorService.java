package com.MegaHector.MegaHecto.service;


import com.MegaHector.MegaHecto.Dto.DadosDto;
import com.MegaHector.MegaHecto.Dto.RespostaDto;
import com.MegaHector.MegaHecto.entity.Dados;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {


    @Autowired
    Dados dados;
    @Autowired
    RespostaDto resposta;
    @Autowired


    public RespostaDto receberDados(@NotNull DadosDto dto) {
        //recebe a string das embalagem e retira as letras
        String format = dto.getEmbalagem().replaceAll("\\D+", "");

        //set os atributos de elementsDto em emlements
        dados.setEmbalegem(Double.parseDouble(format));
        dados.setHectorlitro(dto.getHectorlitro());
        dados.setQuantEmbalagem(dto.getQuantEmbalagem());

        //calcula a quantodade de embalagem de acordo com os hectorlitros
        dados.setMlEmbalagem(dados.getEmbalegem() * dados.getQuantEmbalagem());
        dados.setQuantidade((dados.getHl() * dados.getHectorlitro()) / dados.getMlEmbalagem());

        //set  quantidade de embalagem
        resposta.setResultado(Math.ceil(dados.getQuantidade()));


        return resposta;
    }


}
