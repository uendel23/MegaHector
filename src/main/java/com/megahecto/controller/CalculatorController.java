package com.megahecto.controller;

import com.megahecto.dto.DadosDto;
import com.megahecto.dto.RespostaDto;
import com.megahecto.service.CalculatorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/dados")
public class CalculatorController {

    @Autowired
    private CalculatorService calculator;

    @PostMapping("/calculo")
    public ResponseEntity<RespostaDto> dados(@Valid @RequestBody DadosDto dto) {
        RespostaDto resposta = calculator.receberDados(dto);
        return ResponseEntity.ok(resposta);
    }

}
