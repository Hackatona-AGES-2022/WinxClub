package com.WinxClub.Imclusion.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import com.WinxClub.Imclusion.dtos.DtoImigrante;
import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoImigrante;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cadastro")
public class ControladorImigrante {

    final ServicoImigrante servicoImigrante;

    public ControladorImigrante(ServicoImigrante servicoImigrante){
        this.servicoImigrante = servicoImigrante;
    }

    @PostMapping
    public ResponseEntity<Object> saveImigrante(@RequestBody @Valid DtoImigrante dtoImigrante){
        var modeloImigrante = new ModeloImigrante();
        BeanUtils.copyProperties(dtoImigrante, modeloImigrante);
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoImigrante.save(modeloImigrante));
    }
}
