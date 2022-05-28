package com.WinxClub.Imclusion.models;

import javax.persistence.*;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_IMIGRANTES")
public class ModeloImigrante {
    
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private UUID id;
     @Column(nullable = false)
     private String nome;
     @Column(nullable = false)
     private String data_nascimento;
     @Column(nullable = false)
     private String pais;
     @Column(nullable = false)
     private String area_atuacao;
     @Column(nullable = false)
     private String endereco;
     @Column(nullable = false, unique = true)
     private String telefone;
     @Column(nullable = false, unique = true)
     private String email;
     @Column(nullable = false)
     private String bio;
     @Column(nullable = false)
     private String historia;

     public UUID getId() {
          return id;
     }

     public void setId(UUID id) {
          this.id = id;
     }

     public String getNome() {
          return nome;
     }
     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getDataNascimento() {
          return data_nascimento;
     }

     public void setData_nascimento(String data_nascimento) {
          this.data_nascimento = data_nascimento;
     }


     public String getAreaAtuacao() {
          return area_atuacao;
     }

     public void setArea_atuacao(String area_atuacao) {
          this.area_atuacao = area_atuacao;
     }

     public String getPais() {
          return pais;
     }

     public void setPais(String pais) {
          this.pais = pais;
     }
     
     public String getEndereco() {
          return endereco;
     }

     public void setEndereco(String endereco) {
          this.endereco = endereco;
     }

     public String getTelefone() {
          return telefone;
     }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getBio() {
          return bio;
     }

     public void setBio(String bio) {
          this.bio = bio;
     }

     public String getHistoria() {
          return historia;
     }

     public void setHistoria(String historia) {
          this.historia = historia;
     }
}
