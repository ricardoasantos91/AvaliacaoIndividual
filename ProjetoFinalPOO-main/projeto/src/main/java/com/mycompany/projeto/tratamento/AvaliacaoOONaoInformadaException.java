/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.tratamento;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Sala
 */
public class AvaliacaoOONaoInformadaException extends Exception{
    ObjectOutputStream fos;
    FileOutputStream foo;
    public AvaliacaoOONaoInformadaException(String msg){
        super(msg);
        this.fos = fos;
        this.foo = foo;
    }
    
    public ObjectOutputStream getFos(){
        return this.fos;
    }
    
    public FileOutputStream getFoo(){
        return this.foo;
    }
}
