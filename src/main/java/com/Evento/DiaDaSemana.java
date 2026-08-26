package com.Evento;

public enum DiaDaSemana {
    SEGUNDA("Segunda"), 
    TERÇA("Terça"), 
    QUARTA("Quarta"), 
    QUINTA("Quinta"), 
    SEXTA("Sexta"), 
    SÁBADO("Sábado"), 
    DOMINGO("Domingo");
    
    private String descricao;  
    
    DiaDaSemana(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}