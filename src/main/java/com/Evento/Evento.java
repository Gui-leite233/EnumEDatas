package com.Evento;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Evento{
    
    
    private String nome;
    private LocalDateTime dataHora;
    private DiaDaSemana semanaDia;



    public Evento(String nome, LocalDateTime dataHora, DiaDaSemana semanaDia) {
        this.nome = nome;
        this.dataHora = dataHora;
        this.semanaDia = semanaDia;
    }


    public void exibirEvento(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Nome do evento: " + nome);
        System.out.println("Data do evento: " + dataHora.format(formatter));
        System.out.println("Semana do evento: " + semanaDia);
    }
}