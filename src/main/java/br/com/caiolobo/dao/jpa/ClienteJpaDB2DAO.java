/**
 * 
 */
package br.com.caiolobo.dao.jpa;

import br.com.caiolobo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.caiolobo.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
