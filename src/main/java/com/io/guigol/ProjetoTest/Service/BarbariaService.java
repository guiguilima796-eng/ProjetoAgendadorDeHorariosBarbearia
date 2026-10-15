package com.io.guigol.ProjetoTest.Service;

import com.io.guigol.ProjetoTest.Repository.AgendamentoRepository;
import com.io.guigol.ProjetoTest.models.Agendamento;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class BarbariaService {
    private final AgendamentoRepository agendamentoRepository;

    public BarbariaService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public Agendamento marcarHorario(
            LocalDate data,
            LocalTime horario) {

        if (agendamentoRepository.existsByDataAndHorario(data, horario)) {
            throw new IllegalArgumentException("Já existe um agendamento para esta data e horário.");
        }

        Agendamento agendamento = new Agendamento();

        agendamento.setData(data);
        agendamento.setHorario(horario);

        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

}
