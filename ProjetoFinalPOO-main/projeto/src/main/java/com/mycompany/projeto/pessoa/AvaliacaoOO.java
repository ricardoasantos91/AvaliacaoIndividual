/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.pessoa;

import java.io.Serializable;

/**
 *
 * @author Sala
 */
public class AvaliacaoOO implements Serializable {
    private String matricula;
    private String nome;
    
    public AvaliacaoOO(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public AvaliacaoOO(){
        
    }
}
