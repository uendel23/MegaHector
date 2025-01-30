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
    Dados elements;
    @Autowired
    RespostaDto resposta;
    @Autowired


    public RespostaDto receberDados(DadosDto dto) {
        //set os atributos de elementsDto em emlements
        String format = dto.getEmbalagem().replaceAll("\\D+", "");
        elements.setEmbalegem(Double.parseDouble(format));
        elements.setHectorlitro(dto.getHectorlitro());
        elements.setQuantEmbalagem(dto.getQuantEmbalagem());

        //calcula a quantodade de embalagem de acordo com os hectorlitros
        elements.setMlEmbalagem(elements.getEmbalegem() * elements.getQuantEmbalagem());
        elements.setQuantidade((double) ((elements.getHl() * elements.getHectorlitro()) / elements.getMlEmbalagem()));

        //set  quantidade de embalagem
        resposta.setQuantidade(Math.ceil(elements.getQuantidade()));

        return resposta;
    }


}
