package com.megahecto.dto;

import org.springframework.stereotype.Component;

@Component
public class DadosDto {

    private String embalagem ;
    private Double hectorlitro;
    private Integer quantEmbalagem;

    public String getEmbalagem() {
         return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public Double getHectorlitro() {
        return hectorlitro;
    }

    public void setHectorlitro(Double hectorlitro) {
        this.hectorlitro = hectorlitro;
    }

    public Integer getQuantEmbalagem() {
        return quantEmbalagem;
    }

    public void setQuantEmbalagem(Integer quantEmbalagem) {
        this.quantEmbalagem = quantEmbalagem;
    }

}