package com.io.guigol.ProjetoTest.Repository;

import com.io.guigol.ProjetoTest.models.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public interface AgendamentoRepository extends JpaRepository<Agendamento,Long> {
    boolean existsByDataAndHorario(
            LocalDate data,
            LocalTime horario
    );
}
