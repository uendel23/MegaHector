package com.MegaHector.MegaHecto.controller;

import com.MegaHector.MegaHecto.Dto.DadosDto;
import com.MegaHector.MegaHecto.Dto.RespostaDto;
import com.MegaHector.MegaHecto.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin("*")
@RequestMapping("/dados")
public class CalculatorController {

    @Autowired
    CalculatorService calculator = new CalculatorService();


    @PostMapping("/calculo")
    public ResponseEntity<RespostaDto> dados(@RequestBody DadosDto dto) {
        RespostaDto resposta = calculator.receberDados(dto);
        return ResponseEntity.ok(resposta);
    }
}
