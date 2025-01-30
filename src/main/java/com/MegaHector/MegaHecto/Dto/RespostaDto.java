package com.MegaHector.MegaHecto.Dto;

import org.springframework.stereotype.Component;

@Component
public class RespostaDto {

    private Double resultado;


    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
}
