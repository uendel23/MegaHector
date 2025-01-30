package com.MegaHector.MegaHecto.Dto;
import org.springframework.stereotype.Component;

@Component
public class DadosDto {

    private String embalagem ="0";
    private Double hectorlitro =0d;
    private Double quantEmbalagem=0d;

    public DadosDto(String embalagem, Double hectorlitro, Double quantEmbalagem) {
        this.embalagem = embalagem;
        this.hectorlitro = hectorlitro;
        this.quantEmbalagem = quantEmbalagem;
    }

    public DadosDto() {
    }

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

    public Double getQuantEmbalagem() {
        return quantEmbalagem;
    }

    public void setQuantEmbalagem(Double quantEmbalagem) {
        this.quantEmbalagem = quantEmbalagem;
    }
}