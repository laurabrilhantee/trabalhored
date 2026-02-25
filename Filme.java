package com.sgp.model;

public class Filme{

    private String Titulo;
    private int diretor;

    //Construtor da classe
     public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    //Construtor padrao
    public Filme() {
        this.titulo = "Teste";
        this.diretor = "Teste";
        this.ano = 2009;
    }

    public void resultado() {
        System.out.println("Filme: " + titulo + "  Diretor: " + diretor + "  Ano: " + ano);
    }

    //Gatters e Setters

    //GET para alterar o atributo privado
      public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAno() {
        return ano;
    }
    //Set para alterar o  atributo privado
      public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override //sobrescrita do toString para representacao textual
    public String toString(){

    }
         return "Filme{" + "titulo='" + titulo + '\'' + ", diretor='" + diretor + '\'' + ", ano=" + ano + '}';
    
}