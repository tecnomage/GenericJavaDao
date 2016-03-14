package br.com.caelum.empresa.DAOs;

import java.awt.List;

public interface DAO<T> {

	void adiciona(T dado);

	void remove(T dado);

	Object buscaPorId(Long id);

	List buscaTodos();

}