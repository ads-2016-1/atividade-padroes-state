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
public enum LivroStateEnum implements LivroState{
    
    DISPONIVEL{
        @Override
        public LivroState emprestar() {
            System.out.println("Livro Emprestado!");
            return EMPRESTADO;
        }

        @Override
        public LivroState reservar() {
            System.out.println("Livro Reservado");
            return RESERVADO;
        }

        @Override
        public LivroState devolver() {
            System.out.println("Livro Disponivel");
            return this;
        }
    },
    EMPRESTADO{
        @Override
        public LivroState emprestar() {
            System.out.println("Livro encontra-se emprestado!");
            return this;
        }

        @Override
        public LivroState reservar() {
            System.out.println("Livro encontra-se emprestado");
            return this;
        }

        @Override
        public LivroState devolver() {
            System.out.println("Livro devolvido");
            return DISPONIVEL;
        }
    },
    RESERVADO{
        @Override
        public LivroState emprestar() {
            System.out.println("Livro encontra-se reservado");
            return this;
        }

        @Override
        public LivroState reservar() {
            System.out.println("Livro encontra-se reservado");
            return this;
        }

        @Override
        public LivroState devolver() {
            System.out.println("Livro encontra-se reservado");
            return this;
        }
    }
    
}
