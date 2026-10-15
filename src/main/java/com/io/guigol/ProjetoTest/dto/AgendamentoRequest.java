package com.io.guigol.ProjetoTest.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record AgendamentoRequest(LocalDate data, LocalTime horario) {
}
