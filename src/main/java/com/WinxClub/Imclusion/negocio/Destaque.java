package com.WinxClub.Imclusion.negocio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class Destaque {
    
    List<Imigrante> destaques = new ArrayList<>();

    
    public void atualizaDestaques(List<Imigrante> todos){
        int lim = todos.size();
        Random r = new Random();
        HashSet<Integer> numeros = new HashSet<>();
        int aux;
        for(int i=0;i<5;){
            aux = r.nextInt(lim);
            if(!numeros.contains(aux)){
                numeros.add(aux);
                i++;
            }
        }

    }

    public List<Imigrante> getDestaques(List<Imigrante> todos){
        atualizaDestaques(todos);
        return destaques;
        
    }
}
