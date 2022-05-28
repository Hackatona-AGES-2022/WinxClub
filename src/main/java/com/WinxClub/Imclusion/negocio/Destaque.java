package com.WinxClub.Imclusion.negocio;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoImigrante;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/destaque")
public class Destaque {
    final ServicoImigrante s;
    List<ModeloImigrante> destaques;
    

    public Destaque(ServicoImigrante s) {
        this.s = s;
        destaques = s.findAll();
    }


    public List atualizaDestaques(List<ModeloImigrante> destaques){
        int lim = destaques.size();
        List<ModeloImigrante> l;
        if(lim-5>=0){
            System.out.println(destaques.subList(lim-5, lim));
            l= destaques.subList(lim-5, lim);
        }else{
            System.out.println(destaques.subList(0, lim));
            l= destaques.subList(0, lim);
        }
        return l;
    }

    @GetMapping("/lista")
    public List<ModeloImigrante> getDestaques(){
        return atualizaDestaques(destaques);
        
        
    }
}
