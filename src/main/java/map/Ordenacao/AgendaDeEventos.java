package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaDeEventos() { this.eventoMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data,new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }

    public static void main(String[] args) {
        AgendaDeEventos agendaDeEventos = new AgendaDeEventos();
        agendaDeEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL,19),"Evento 1", "Atracao 1");
        agendaDeEventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER,29),"Evento 2", "Atracao 2");

        agendaDeEventos.exibirAgenda();
        agendaDeEventos.obterProximoEvento();

    }
}
