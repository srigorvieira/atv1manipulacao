package com.mycompany.atv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Atv1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File arquivo = new File("D:\\Faculdade\\Programação Desktop\\atv1\\arquivo.txt");
        
        if(arquivo.exists()){
            System.out.println("O arquivo eh valido e existe!");
        }else {
            System.out.println("O arquivo não existe!");
        }
        
        try(FileReader leitor = new FileReader("D:\\Faculdade\\Programação Desktop\\atv1\\arquivo.txt");
                BufferedReader buffer = new BufferedReader(leitor)){
            
            String linha;
            
            while ((linha = buffer.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        if(arquivo.delete()){
            System.out.println("O arquivo foi eliminado!");
        } else{
            System.out.println("Não foi possível eliminar o arquivo!");
        }
    }
}
