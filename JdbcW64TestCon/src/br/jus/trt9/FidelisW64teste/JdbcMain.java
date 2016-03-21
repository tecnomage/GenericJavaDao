package br.jus.trt9.FidelisW64teste;

import java.beans.FeatureDescriptor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.*;

/**
 * @author viniciusbraga
 *
 */
public class JdbcMain {
	// configuraçao da conexao
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:ojdbc6:@localhost:1521";

	// username e pass
	static final String USER = "sys";
	static final String PASS = "trt";
	private static Driver driver;

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("onde está o driver ORACLE?");
			e.printStackTrace();
		}

		try {
			System.out.println("tentanto conectar");
			driver = DriverManager.getDriver(DB_URL);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
						
			String sysdate = pegaTempo(conn);
			System.out.println(sysdate);

		} catch (SQLException | IOException e) {
			System.out.println("nao conectou");
			e.printStackTrace();
		}

	}

	public static String pegaTempo(Connection conn) throws SQLException, IOException {

		String pegaTempo = null;
		ResultSet rst= fetch("Select SYSDATE from dual", conn);
		System.out.println("entrou no pegaTempo");
			while (rst.next()) {
				pegaTempo = rst.getString(1);
				}
			rst.close();
			return pegaTempo;
	}

	public static ResultSet fetch(String sql, Connection conn) {
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			ps.close();
			
			return rs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
			
	}

}
