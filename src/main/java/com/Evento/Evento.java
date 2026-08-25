package com.Evento;


import java.time.LocalDateTime;

public class Evento{
    private String nome;
    private LocalDateTime dataHora;
    private DiaDaSemana semanaDia;



    public Evento(String nome, LocalDateTime dataHora, DiaDaSemana SemanaDia) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.semanaDia = semanaDia;
    }


    public void exibirEvento(){
        System.out.print("Nome do evento: " + nome);
        System.out.println("Data do evento: " + dataHora);
        System.out.println("Semana do evento: " + semanaDia);
    }
}