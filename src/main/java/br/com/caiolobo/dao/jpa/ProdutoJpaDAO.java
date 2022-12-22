/**
 * 
 */
package br.com.caiolobo.dao.jpa;

import br.com.caiolobo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.caiolobo.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
