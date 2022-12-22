/**
 * 
 */
package br.com.caiolobo.dao.jpa;

import br.com.caiolobo.dao.generic.jpa.IGenericJapDAO;
import br.com.caiolobo.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
