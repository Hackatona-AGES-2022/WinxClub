package com.WinxClub.Imclusion.negocio;

import java.util.List;

import com.WinxClub.Imclusion.models.ModeloImigrante;
import com.WinxClub.Imclusion.services.ServicoImigrante;



public class Perfil {
    private ModeloImigrante i;
    private ModeloImigrante novo;
    final ServicoImigrante s;
    

    public Perfil(ServicoImigrante s) {
        this.s = s;
    }

    public boolean logar(String email){
        Pesquisa p = new Pesquisa(s);
        i = p.buscaEmail(email);
        if(i==null){return false;}
        return true;     
    }

    public ModeloImigrante criar(String nome, String data_nasc, String pais, String area, String especializacao, String endereco ,String email, String telefone, String bio, String historia){
        novo.setArea_atuacao(area);
        novo.setBio(bio);
        novo.setData_nascimento(data_nasc);
        novo.setEmail(email);
        novo.setEndereco(endereco);
        novo.setEspecializacao(especializacao);
        novo.setHistoria(historia);
        novo.setNome(nome);
        novo.setPais(pais);
        novo.setTelefone(telefone);
        i=novo;
        s.save(novo);

        logar(email);

        return i;
    }

    public void deslogar(){
        i =null;
    }

    public ModeloImigrante getPessoa(){
        return i;
    }

    public void setIBio(String b){
        i.setBio(b);
    }

    public void setIH(String h){
        i.setHistoria(h);
    }

}
