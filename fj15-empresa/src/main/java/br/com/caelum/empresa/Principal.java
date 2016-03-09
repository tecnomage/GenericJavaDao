package br.com.caelum.empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.caelum.empresa.modelo.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		
		GregorianCalendar dataNascimento = new GregorianCalendar(1984, 11, 11);	
		
		
		Funcionario funcionario = new Funcionario("vinicius", 53421, dataNascimento);
		
		System.out.println(funcionario);
		
		
		
	}
	
	
}
