/**
 * 
 */
package br.com.caiolobo.dao.jpa;

import br.com.caiolobo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.caiolobo.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
