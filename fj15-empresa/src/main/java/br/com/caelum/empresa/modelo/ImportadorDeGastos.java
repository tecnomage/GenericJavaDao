package br.com.caelum.empresa.modelo;

import java.awt.List;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ImportadorDeGastos {

	public Collection importa(InputStream entrada) throws ParseException {
		Scanner leitor = new Scanner(entrada);
		Collection<Gasto> gastos = new LinkedHashSet<Gasto>();

		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");

		while (leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			String tipoDeGasto = linha.substring(0, 6);
			String dataGastotxt = linha.substring(6, 14);
			String valorGastotxt = linha.substring(14, 23);
			String matriculatxt = linha.substring(23, 26);
			String nome = linha.substring(26, 56);
			String dataNascTxt = linha.substring(56);

			double valor = Double.parseDouble(valorGastotxt);
			int matricula = Integer.parseInt(matriculatxt);

			Calendar dataNascimento = converteTXTparaCalendar(df, dataNascTxt);

			Calendar dataDespesa = converteTXTparaCalendar(df, dataGastotxt);

			Funcionario funcionario = criaFuncionario(nome, matricula, dataNascimento);
			gastos.add(new Gasto(valor, tipoDeGasto, funcionario, dataDespesa));

		}

		return gastos;

	}

	public Funcionario criaFuncionario(String nome, int matricula, Calendar dataNascimento) {
		Funcionario funcionario = new Funcionario(nome, matricula, dataNascimento);
		return funcionario;
	}

	public Calendar converteTXTparaCalendar(SimpleDateFormat df, String dataNascTxt) throws ParseException {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(df.parse(dataNascTxt));
		return dataNascimento;
	}
}
