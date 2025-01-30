package com.MegaHector.MegaHecto.Dto;

import org.springframework.stereotype.Component;

@Component
public class RespostaDto {

    private Double quantidade;


    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
