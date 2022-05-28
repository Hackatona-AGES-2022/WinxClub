package com.WinxClub.Imclusion.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;

import javax.validation.Valid;

import com.WinxClub.Imclusion.dtos.DtoImigrante;
import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoArquivo;
import com.WinxClub.Imclusion.services.ServicoImigrante;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cadastro")
public class ControladorImigrante {

    final ServicoImigrante servicoImigrante;
    final ServicoArquivo servicoArquivo;

    public ControladorImigrante(ServicoImigrante servicoImigrante, ServicoArquivo servicoArquivo){
        this.servicoImigrante = servicoImigrante;
        this.servicoArquivo = servicoArquivo;
    }

    @PostMapping
    public ResponseEntity<Object> saveImigrante(@RequestBody @Valid DtoImigrante dtoImigrante){
        var modeloImigrante = new ModeloImigrante();
        BeanUtils.copyProperties(dtoImigrante, modeloImigrante);
        return ResponseEntity.status(HttpStatus.CREATED).body(servicoImigrante.save(modeloImigrante));
    }

    @PostMapping("/file")
    public ResponseEntity<Object> uploadFile(@RequestBody MultipartFile file, @RequestParam int id){
        int idd = servicoArquivo.escreveImg(file, id);
        return ResponseEntity.ok().body(idd);
    }

    @GetMapping("/file/{id}")
    public ResponseEntity<FileInputStream> getImigrante(@PathVariable int id){
        FileInputStream img = servicoArquivo.leImagem(id);
        return ResponseEntity.ok().header("Content-type", "image/png").body(img);
    }
}
