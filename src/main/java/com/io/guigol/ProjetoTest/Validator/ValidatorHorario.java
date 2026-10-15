package com.io.guigol.ProjetoTest.Validator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ValidatorHorario {
    public void validateHorario(LocalDateTime horario) {
        LocalDateTime now = LocalDateTime.now();
        if (horario.isBefore(now)) {
            throw new IllegalArgumentException("O horário não pode ser anterior ao horário atual.");
        }
    }
}
