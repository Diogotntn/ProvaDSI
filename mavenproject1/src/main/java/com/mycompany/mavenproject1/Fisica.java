/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa{
    private String cpf;
    private String rg;
    private String datadeNascimento;

    public Fisica(String cpf, String rg, String datadeNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.datadeNascimento = datadeNascimento;
    }

    
    
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    
    
    @Override
    public String toString() {
        return "Fisica{" + "cpf=" + cpf + ", rg=" + rg + ", datadeNascimento=" + datadeNascimento + '}';
    }
    
    
    
    
    
    
    
    
}
