package com.WinxClub.Imclusion.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ServicoArquivo {
     
     public int escreveImg(MultipartFile file){
          try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("arq.png"), Charset.forName("base64")))) {
               System.out.println("AAAAAAAAAA");
               byte[] b = file.getBytes();
               System.out.println("BBBBBBBBB");
               
               for (byte  by: b) {
                    writer.print(by);
               }
               System.out.println("FFFFFFFFFF");
               writer.println();

           } catch (Exception e) {
               System.err.format("Erro de E/S", e);
           }

          return 1;
     }
}
