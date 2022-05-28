package com.WinxClub.Imclusion.web;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.negocio.Destaque;
import com.WinxClub.Imclusion.negocio.Perfil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/home")
public class Home {
    private Perfil p;
    private Destaque d;

    public Home(Perfil p, Destaque d) {
       this.p = p;
       this.d=d;
    }

    @GetMapping("/login")
    public ModeloImigrante login(@RequestParam("email") String email) {
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
