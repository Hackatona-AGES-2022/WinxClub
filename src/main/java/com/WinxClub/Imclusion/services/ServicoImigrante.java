package com.WinxClub.Imclusion.services;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.repositories.IRepositorioImigrante;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class ServicoImigrante {

    final IRepositorioImigrante irepositorioImigrante;

    public ServicoImigrante(IRepositorioImigrante iRepositorioImigrante){
        this.irepositorioImigrante = iRepositorioImigrante;
    }

    @Transactional
    public ModeloImigrante save(ModeloImigrante modeloImigrante){
        return irepositorioImigrante.save(modeloImigrante);
    }

    public List<ModeloImigrante> findAll() {
        return irepositorioImigrante.findAll();
    }

}
