package com.WinxClub.Imclusion.web;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/home")
public class Home {

    @PostMapping("/login")
    public void login() {
        
    }

    @PostMapping("/cadastro")
    public void cadastro(){

    }

    @GetMapping("/exDestaque")
    public void exibeDestaque(){

    }

    @GetMapping("/exPerfil")
    public void exibePerfil(){

    }
    
}
