package com.WinxClub.Imclusion.web;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.negocio.Destaque;
import com.WinxClub.Imclusion.negocio.Perfil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/home")
public class Home {
    final Perfil p;
    final Destaque d;

    public Home(Perfil p, Destaque d) {
        this.p = p;
        this.d=d;
    }

    @PostMapping("/login")
    public ModeloImigrante login(@RequestBody String email) {
        if(p.logar(email)) return p.getPessoa();
        return null;
    }

    @GetMapping("/exDestaque")
    public List<ModeloImigrante> exibeDestaque(){
        return d.getDestaques();
        
    }

    @GetMapping("/exPerfil")
    public ModeloImigrante exibePerfil(){
        return p.getPessoa();
    }
    
}
