package com.WinxClub.Imclusion.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ServicoArquivo {
     public int escreveImg(MultipartFile file, int id){
          // System.out.println(id +".png");
          File arquivo = new File(id + ".png");
          try (FileOutputStream fout = new FileOutputStream(arquivo)){
               fout.write(file.getBytes());
               id++;
           } catch (Exception e) {
               e.printStackTrace();
           }

          return id;
     }

     public FileInputStream leImagem(int id){
          File arq = new File(id + ".png");
          try (FileInputStream read = new FileInputStream(arq);) {
               return read;    
          } catch (Exception e) {
          }
          


          return null;
     }
}
