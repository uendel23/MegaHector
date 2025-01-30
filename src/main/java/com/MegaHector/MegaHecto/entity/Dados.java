package com.MegaHector.MegaHecto.entity;

import org.springframework.stereotype.Component;

@Component
public class Dados {

    private Double embalegem;
    private Double hectorlitro;
    private Double quantEmbalagem;
    private Double mlEmbalagem;
    private Double quantidade;
    private final int Hl = 100000;


    public Dados(Double embalegem, Double hectorlitro, Double quantEmbalagem) {
        this.embalegem = embalegem;
        this.hectorlitro = hectorlitro;
        this.quantEmbalagem = quantEmbalagem;
    }

    public Dados() {
    }

    public Double getMlEmbalagem() {
        return mlEmbalagem;
    }

    public void setMlEmbalagem(Double mlEmbalagem) {
        this.mlEmbalagem = mlEmbalagem;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getEmbalegem() {
        return embalegem;
    }

    public void setEmbalegem(Double embalegem) {
        this.embalegem = embalegem;
    }

    public int getHl() {
        return Hl;
    }

    public Double getQuantEmbalagem() {
        return quantEmbalagem;
    }

    public void setQuantEmbalagem(Double quantEmbalagem) {
        this.quantEmbalagem = quantEmbalagem;
    }

    public Double getHectorlitro() {
        return hectorlitro;
    }

    public void setHectorlitro(Double hectorlitro) {
        this.hectorlitro = hectorlitro;
    }
}
