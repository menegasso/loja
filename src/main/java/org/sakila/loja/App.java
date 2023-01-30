package org.sakila.loja;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.sakila.loja.model.Produto;

public class App {

	public static void main(String[] args) {

		Produto celular = new Produto();
		celular.setNome("Samsung M30");
		celular.setDescricao("Muito bom.");
		celular.setPreco(new BigDecimal("800"));

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(celular);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
}
