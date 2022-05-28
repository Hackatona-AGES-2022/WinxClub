package com.WinxClub.Imclusion.web;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.negocio.Perfil;

public class MostraPerfil {
    private Perfil p;
    
    public ModeloImigrante retorna(){
        return p.getPessoa();
    }
}
