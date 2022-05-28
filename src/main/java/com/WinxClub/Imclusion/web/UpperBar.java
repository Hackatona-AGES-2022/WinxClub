package com.WinxClub.Imclusion.web;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.negocio.Perfil;
import com.WinxClub.Imclusion.negocio.Pesquisa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upBar")
public class UpperBar {
    private Pesquisa p;
    private Perfil perf;
    
    
    public UpperBar(Pesquisa p, Perfil perf) {
        this.p = p;
        this.perf = perf;
    }

    @GetMapping("/pesquisa")
    public List<ModeloImigrante> pesquisa(@RequestParam("pesquisa") String pesquisa){
       return p.buscaArea(pesquisa);
       // return p.buscaEspecializacao(pesquisa);
        
    }

    @GetMapping("/sair")
    public void sair(){
        perf.deslogar();
    }
}
