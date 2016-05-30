/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.state;

/**
 *
 * @author jederson
 */
public class Livro {
    
    private LivroState stateCurrent;
    
    public Livro(){
        this.stateCurrent = LivroStateEnum.DISPONIVEL;
    }
    
    public void emprestar(){
        this.stateCurrent = stateCurrent.emprestar();
    }
    
    public void reservar(){
       this.stateCurrent = stateCurrent.reservar();
    }
    
    public void devolver(){
       this.stateCurrent = stateCurrent.devolver();
    }
}
