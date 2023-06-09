/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Juridica juridica = new Juridica("5456456", "123132", "Diogo", "7191232-1414", "Diogo@hotmail.com", 
                new Endereco("Rua", "7198585-8585", "casa", "456465", "salvador", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(20, LocalDate.of(2000, Month.MARCH, 19), Genero.FEMININO, "Marta", "7198484-8484", "Marta@hotmail.com",
                new Endereco("Rua", "20", "casa", "4050-550", "Salvador", UnidadeFederativa.BAHIA));
        
        Motoboy motoboy = new Motoboy("123123", "123.123.123.123-79", "123132", "1231321", Setor.OPERACOES, 1200, LocalDate.of(1985, Month.MARCH, 25), Genero.MASCULINO, "Breno", "7198584-5441", "Breno@hotmail.com", 
                new Endereco("Rua", "20", "casa", "4405-660", "Rio de janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Medico medico = new Medico("123132", "456.654.789-95", "465465", "132123", Setor.SAUDE, 5000, LocalDate.of(1994, Month.AUGUST, 8), Genero.FEMININO, "Gerusa", "71985445-4882", "Gerusa@hotmail.com",
                new Endereco("Rua", "50", "casa", "456-220", "São paulo", UnidadeFederativa.SAO_PAULO));
        
        
        Advogado advogado = new Advogado("123123", "789.123.456.789-12", "2132123", "1321321", Setor.JURIDICO, 20000, LocalDate.of(1985, Month.DECEMBER, 12), Genero.FEMININO, "Aline", "7198584-8222", "Aline@gmail.com", 
                new Endereco("Rua", "111", "casa", "520202-220", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("Juridica:");
        System.out.println(juridica.toString());
        System.out.println("");
        System.out.println("Cliente:");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println("Motoboy:");
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println("Medico:");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println("Advogado:");
        System.out.println(advogado.toString());
        
        
      
        
        
    }
    
    
}
