package com.io.guigol.ProjetoTest.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private LocalTime horario;

//    @ManyToOne
//    private Barbeiro barbeiro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

//    public Barbeiro getBarbeiro() {
//        return barbeiro;
//    }
//
//    public void setBarbeiro(Barbeiro barbeiro) {
//        this.barbeiro = barbeiro;
//    }

    // Cliente, serviço e status...
}
