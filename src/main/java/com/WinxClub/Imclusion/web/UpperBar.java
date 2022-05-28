package com.WinxClub.Imclusion.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upBar")
public class UpperBar {
    
    @GetMapping("pesquisa")
    public void pesquisa(){

    }

    @GetMapping("/home")
    public void home(){

    }

    @GetMapping("/sair")
    public void sair(){

    }
}
