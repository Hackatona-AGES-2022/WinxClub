package com.WinxClub.Imclusion.negocio;

public class Imigrante {
    private String paisOrigem;
    private String areaAtuacao;
    private String especializacao;
    private String escolaridade;
    private String cidadeDomicilio;
    private String email;
    private String telefone;
    private String historia;///
    private String bio;///
    //fotos
    //fotosPerfil
    //curriculo

    
    public Imigrante(String paisOrigem, String areaAtuacao, String especializacao, String escolaridade,
            String cidadeDomicilio, String email, String telefone, String historia, String bio) {
        this.paisOrigem = paisOrigem;
        this.areaAtuacao = areaAtuacao;
        this.especializacao = especializacao;
        this.escolaridade = escolaridade;
        this.cidadeDomicilio = cidadeDomicilio;
        this.email = email;
        this.telefone = telefone;
        this.historia = historia;
        this.bio = bio;
    }


    public String getPaisOrigem() {
        return paisOrigem;
    }


    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }


    public String getAreaAtuacao() {
        return areaAtuacao;
    }


    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }


    public String getEspecializacao() {
        return especializacao;
    }


    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }


    public String getEscolaridade() {
        return escolaridade;
    }


    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }


    public String getCidadeDomicilio() {
        return cidadeDomicilio;
    }


    public void setCidadeDomicilio(String cidadeDomicilio) {
        this.cidadeDomicilio = cidadeDomicilio;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getHistoria() {
        return historia;
    }


    public void setHistoria(String historia) {
        this.historia = historia;
    }


    public String getBio() {
        return bio;
    }


    public void setBio(String bio) {
        this.bio = bio;
    }

    
}
