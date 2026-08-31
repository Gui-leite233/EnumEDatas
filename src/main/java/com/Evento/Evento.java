package com.Evento;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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


    public void adicionarDias(int dias){
        this.dataHora = this.dataHora.plusDays(dias);

        this.semanaDia = converterParaDiaSemana(this.dataHora.getDayOfWeek().toString());
    }

    public void exibirFuso(String fuso){
        ZoneId zona = ZoneId.of(fuso);
        ZonedDateTime dataConvert = this.dataHora.atZone(ZoneId.systemDefault()).withZoneSameInstant(zona);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
        System.out.println("Data em " + fuso + ": " + dataConvert.format(formatter));
    }


    private DiaDaSemana converterParaDiaSemana(String diaIngles) {
           switch (diaIngles) {
               case "MONDAY": return DiaDaSemana.SEGUNDA;
               case "TUESDAY": return DiaDaSemana.TERÇA;
               case "WEDNESDAY": return DiaDaSemana.QUARTA;
               case "THURSDAY": return DiaDaSemana.QUINTA;
               case "FRIDAY": return DiaDaSemana.SEXTA;
               case "SATURDAY": return DiaDaSemana.SÁBADO;
               case "SUNDAY": return DiaDaSemana.DOMINGO;
               default: return null;
           }
       }
}
