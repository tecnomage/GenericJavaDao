package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		
		String conteudo = "CARTAO010120110000100000123Joao da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970\r\n"
                + "CARTAO010120110000100000124Jose da Silva                 25012970";
		
		
		
		GregorianCalendar dataNascimento = new GregorianCalendar(1984, 11, 11);	
				
		Funcionario funcionario = new Funcionario("vinicius", 53421, dataNascimento);
		
		System.out.println(funcionario);
		
		
		
	}
	
	
}
