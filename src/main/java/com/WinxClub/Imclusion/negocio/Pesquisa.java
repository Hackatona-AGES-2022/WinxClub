package com.WinxClub.Imclusion.negocio;

import java.util.ArrayList;
import java.util.List;

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
}
