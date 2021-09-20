package com.mycompany.projeto.arquivo;
import com.mycompany.projeto.cadastro.CadastroChamado;
import com.mycompany.projeto.tratamento.AvaliacaoOONaoInformadaException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChamadoArquivo{
  
  public static void escreverArquivo(CadastroChamado chamados) throws AvaliacaoOONaoInformadaException{
    File file = new File("ChamadoArquivo.bin");
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try{
      fos = new FileOutputStream(file);
      oos = new ObjectOutputStream(fos);
      chamados.verificarAvaliacaoOO();
      oos.writeObject(chamados);
            //oos.writeObject(funcionario2);
            //oos.writeObject(funcionario3);

      oos.close();
      fos.close();
    }catch (IOException e) {
      e.printStackTrace();
    }finally{
        try{
            if(chamados.numChamados() != 1){
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(chamados);
                oos.close();
                fos.close();
            }
        }catch(IOException ex2){
            ex2.printStackTrace();
        }
    }
  }

  public static CadastroChamado lerArquivo(File file){
    CadastroChamado chamados = new CadastroChamado();

    try{
        FileInputStream fileStream = new FileInputStream(file);
            // Creating an object input stream
            try{
                ObjectInputStream objStream = new ObjectInputStream(fileStream);
                try{
                    chamados = (CadastroChamado) objStream.readObject();
                    return chamados;
                }catch(Exception e){
                    e.printStackTrace();
                }
                    
                objStream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            
        
    }
    catch(FileNotFoundException e){
      return chamados;
    }
    catch(IOException e){
      e.printStackTrace();
    }
    return chamados;
  }
  

    
}