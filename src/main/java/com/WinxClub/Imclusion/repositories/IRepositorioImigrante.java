package com.WinxClub.Imclusion.repositories;

import java.util.UUID;

import com.WinxClub.Imclusion.models.ModeloImigrante;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioImigrante extends JpaRepository<ModeloImigrante, UUID>{
    
}
