package com.WinxClub.Imclusion.dtos;

import javax.validation.constraints.NotBlank;

public class DtoImigrante {

     @NotBlank
     private String nome;
     @NotBlank
     private String data_nascimento;
     @NotBlank
     private String pais;
     @NotBlank
     private String area_atuacao;
     @NotBlank
     private String endereco;
     @NotBlank 
     private String telefone;
     @NotBlank 
     private String email;
     @NotBlank
     private String bio;
     @NotBlank
     private String historia;

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getNome() {
          return nome;
     }

     public void setData_nascimento(String data_nascimento) {
          this.data_nascimento = data_nascimento;
     }
     
     public String getData_nascimento() {
          return data_nascimento;
     }

     public void setPais(String pais) {
          this.pais = pais;
     }

     public String getPais() {
          return pais;
     }

     public void setArea_atuacao(String area_atuacao) {
          this.area_atuacao = area_atuacao;
     }

     public String getArea_atuacao() {
          return area_atuacao;
     }

     public void setEndereco(String endereco) {
          this.endereco = endereco;
     }

     public String getEndereco() {
          return endereco;
     }

     public void setTelefone(String telefone) {
          this.telefone = telefone;
     }

     public String getTelefone() {
          return telefone;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getEmail() {
          return email;
     }

     public void setBio(String bio) {
          this.bio = bio;
     }

     public String getBio() {
          return bio;
     }

     public void setHistoria(String historia) {
          this.historia = historia;
     }

     public String getHistoria() {
          return historia;
     }

}
