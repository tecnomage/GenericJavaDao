package br.com.caelum.empresa.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestaGasto {
	
	public static void main(String[] args) {
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar(1999, 11, 12);
		Funcionario funcionario = new Funcionario("vincius", 33444, gregorianCalendar);
		
		GregorianCalendar hoje=new GregorianCalendar(2016,03,06);
		
		
		Gasto gasto = new Gasto(100, "taxi", funcionario, hoje );
		
		System.out.println(gasto);
		
		
	}

}
