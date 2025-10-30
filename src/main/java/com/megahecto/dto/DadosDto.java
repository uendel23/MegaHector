package com.megahecto.dto;

import org.springframework.stereotype.Component;

@Component
public class DadosDto {

    private String embalagem ;
    private Double hectolitros;
    private Integer unidades;

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public Double getHectolitros() {
        return hectolitros;
    }

    public void setHectolitros(Double hectolitros) {
        this.hectolitros = hectolitros;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}