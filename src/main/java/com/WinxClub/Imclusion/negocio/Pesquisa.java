package com.WinxClub.Imclusion.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pesquisa")
public class Pesquisa {
    
    List<Imigrante> imigrantes = new ArrayList<>();

    @GetMapping("/limpa")
    public void limpaLista(){
        imigrantes.clear();
    }

    @GetMapping("/area")
    public List buscaArea(String Area, List<Imigrante> todos){

        for (Imigrante i : todos) {
            if(i.getAreaAtuacao().equals(Area))
                imigrantes.add(i);
        }
        
        return imigrantes;
    }
    
    @GetMapping("/especializacao")
    public List buscaEspecializacao(String especializacao, List<Imigrante> todos){

        for (Imigrante i : todos) {
            if(i.getEspecializacao().equals(especializacao))
                imigrantes.add(i);
        }
        return  imigrantes;
    }
    
    /*
    //cidade
    public List buscaCidade(String cidade, List<Imigrante> todos){

        for (Imigrante i : todos) {
            if(i.getCidadeDomicilio().equals(cidade))
                imigrantes.add(i);
        }
        return  imigrantes;
    }

    //uf
    public List buscaUf(String uf, List<Imigrante> todos){

        for (Imigrante i : todos) {
            if(i.getUf().equals(uf))
                imigrantes.add(i);
        }
        return  imigrantes;
    }
    */

}

/*
public class Pesquisa {
    
    List<Imigrante> imigrantes = new ArrayList<>();

    public List<Imigrante> buscaArea(String Area, List<Imigrante> todos){
        imigrantes.clear();

        for (Imigrante i : todos) {
            if(i.getAreaAtuacao().equals(Area))
                imigrantes.add(i);
        }
        
        return imigrantes;
    }
    
    public List<Imigrante> buscaEspecializacao(String especializacao, List<Imigrante> todos){
        imigrantes.clear();

        for (Imigrante i : todos) {
            if(i.getEspecializacao().equals(especializacao))
                imigrantes.add(i);
        }
        return  imigrantes;
    }
}*/
