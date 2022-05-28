package com.WinxClub.Imclusion.negocio;

import java.util.ArrayList;
import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoImigrante;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pesquisa")
public class Pesquisa {
    final ServicoImigrante s;
    List<ModeloImigrante> pesquisa;
    List<ModeloImigrante> todos;
    

    public Pesquisa(ServicoImigrante s) {
        this.s = s;
        List<ModeloImigrante> pesquisa = s.findAll();
    }
    
    @GetMapping("/limpa")
    public void limpaLista(){
        pesquisa.clear();
    }

    @GetMapping("/area")
    public List buscaArea(@RequestBody String Area){

        for (ModeloImigrante i : pesquisa) {
            if(i.getAreaAtuacao().equals(Area))
                todos.add(i);
        }
        
        return  todos;
    }
    
    @GetMapping("/especializacao")
    public List buscaEspecializacao(@RequestBody String especializacao){
        for (ModeloImigrante i : pesquisa) {
            if(i.getEspecializacao().equals(especializacao))
                todos.add(i);
        }
        return  todos;
    }
    


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
