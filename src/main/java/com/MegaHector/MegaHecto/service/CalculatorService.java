package com.MegaHector.MegaHecto.service;


import com.MegaHector.MegaHecto.Dto.DadosDto;
import com.MegaHector.MegaHecto.Dto.RespostaDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {



    public RespostaDto receberDados(DadosDto dto) {
        //recebe a string das embalagem e retira as letras

       // String format = dto.getEmbalagem().replaceAll("\\D+", "");
        Double embalagem = Double.parseDouble(null);
        Double mlEmbalagem = embalagem * dto.getQuantEmbalagem();
        Double quantidade = (100000 * dto.getHectorlitro()) / mlEmbalagem;

        RespostaDto resposta = new RespostaDto();
        //set  quantidade de embalagem
        resposta.setResultado(Math.ceil(quantidade));


        return resposta;
    }


}
