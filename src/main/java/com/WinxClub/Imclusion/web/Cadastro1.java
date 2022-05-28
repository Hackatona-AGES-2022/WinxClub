package com.WinxClub.Imclusion.web;

import com.WinxClub.Imclusion.negocio.Perfil;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Cadastro1 {
    private Perfil p;

    @PostMapping("/cadastro")
    public void cadastro(@RequestBody String nome,@RequestBody  String data_nasc,@RequestBody  String pais,@RequestBody  String area,@RequestBody  String especializacao,@RequestBody  String endereco ,@RequestBody String email,@RequestBody  String telefone){
        p.criar(nome, data_nasc, pais, area, especializacao, endereco, email, telefone, null, null);
    }
}