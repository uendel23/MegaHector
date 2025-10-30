package com.megahecto.service;



import com.megahecto.dto.DadosDto;
import com.megahecto.dto.RespostaDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public RespostaDto receberDados(@NotNull DadosDto dto) {
        String soNumeros = dto.getEmbalagem().replaceAll("\\D+", "");
        Double embalagem = Double.parseDouble(soNumeros);
        Double mlEmbalagem = embalagem * dto.getUnidades();
        Double quantidade = (100000 * dto.getHectolitros()) / mlEmbalagem;

        RespostaDto resposta = new RespostaDto();
        resposta.setResultado(Math.ceil(quantidade));

        return resposta;
    }


}
