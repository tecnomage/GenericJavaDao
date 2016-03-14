package br.com.caelum.empresa.modelo;

import java.awt.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestaGasto {
	
	public static void main(String[] args) {		
		GregorianCalendar gregorianCalendar = new GregorianCalendar(1999, 11, 12);
		Funcionario funcionario = new Funcionario("vincius", 33444, gregorianCalendar);
		ArrayList<String> list =new ArrayList<String>();
		
		
		list.add("nome");
		list.add("teste");
		list.add("vinicius");
		
		GregorianCalendar hoje=new GregorianCalendar(2016,03,06);
		
		
		Gasto gasto = new Gasto(100, "taxi", funcionario, hoje );
		
		System.out.println(gasto);
		
		list.forEach((String s)->{
			System.out.println(s);
		});
		
	
	}
}
