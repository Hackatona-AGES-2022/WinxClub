package com.WinxClub.Imclusion.services;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ServicoArquivo {
     static int id = 0;
     
     public int escreveImg(MultipartFile file){
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
}
