package com.WinxClub.Imclusion.web;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.negocio.Perfil;
import com.WinxClub.Imclusion.negocio.Pesquisa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upBar")
public class UpperBar {
    private Pesquisa p;
    private Perfil perf;
    
    @GetMapping("pesquisa")
    public List<ModeloImigrante> pesquisa(@RequestBody String pesquisa, @RequestBody boolean tipo){
        if(tipo) {//true = area
            return p.buscaArea(pesquisa);
        }else{
            return p.buscaEspecializacao(pesquisa);
        }
    }

    @GetMapping("/sair")
    public void sair(){
        perf.deslogar();
    }
}
