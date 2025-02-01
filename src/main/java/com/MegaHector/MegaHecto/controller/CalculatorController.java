package com.MegaHector.MegaHecto.controller;

import com.MegaHector.MegaHecto.Dto.DadosDto;
import com.MegaHector.MegaHecto.Dto.RespostaDto;
import com.MegaHector.MegaHecto.service.CalculatorService;
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
