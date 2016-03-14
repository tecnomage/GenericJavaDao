/**
 * 
 */
package br.com.caelum.empresa.DAOs;

import java.awt.List;

import br.com.caelum.empresa.modelo.Gasto;
/**
 * @author viniciusbraga
 *
 */
public class GastoDAO  implements DAO<Gasto>{
	
	private DAO<Gasto> gastoDao = new DAO<Gasto>;


	public void adiciona(Gasto dado) {
		gastoDao.adiciona(dado);	
	}

	public void remove(Gasto dado) {
		gastoDao.remove(dado);
	}

	public Object buscaPorId(Long id) {
		return gastoDao.buscaPorId(id);
	}

	public List buscaTodos() {
		return gastoDao.buscaTodos();
	}}
