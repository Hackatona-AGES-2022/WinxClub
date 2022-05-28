package com.WinxClub.Imclusion.negocio;

import java.util.ArrayList;
import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoImigrante;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Pesquisa {
    private ServicoImigrante s;
    List<ModeloImigrante> pesquisa;
    List<ModeloImigrante> todos;
    

    public Pesquisa(ServicoImigrante s) {
        this.s = s;
         pesquisa = s.findAll();
    }
    
    public void limpaLista(){
        pesquisa.clear();
    }

    public List buscaArea(String Area){

        for (ModeloImigrante i : pesquisa) {
            if(i.getAreaAtuacao().equals(Area))
                todos.add(i);
        }
        
        return  todos;
    }
    
    // public List buscaEspecializacao(String especializacao){
    //     for (ModeloImigrante i : pesquisa) {
    //         if(i.getEspecializacao().equals(especializacao))
    //             todos.add(i);
    //     }
    //     return  todos;
    // }

    public ModeloImigrante buscaEmail(String email){
        for (ModeloImigrante i : pesquisa) {
            if(i.getEmail().equals(email))
                return i;
        }
        return  null;
    }
    


}

