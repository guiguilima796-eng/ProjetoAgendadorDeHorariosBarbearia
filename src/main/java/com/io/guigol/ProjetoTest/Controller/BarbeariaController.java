package com.io.guigol.ProjetoTest.Controller;

import com.io.guigol.ProjetoTest.Service.BarbariaService;
import com.io.guigol.ProjetoTest.dto.AgendamentoRequest;
import com.io.guigol.ProjetoTest.models.Agendamento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/barbearia")
public class BarbeariaController {
    private final BarbariaService barbeariaService;

    public BarbeariaController(BarbariaService barbeariaService) {
        this.barbeariaService = barbeariaService;
    }

    @PostMapping("/agendar")
    public Agendamento marcarHorario(@RequestBody AgendamentoRequest request) {
        try {
            return barbeariaService.marcarHorario(request.data(), request.horario());
        } catch (IllegalArgumentException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @GetMapping("/agendamentos")
    public List<Agendamento> listarAgendamentos() {
        return barbeariaService.listarAgendamentos();
    }
}
