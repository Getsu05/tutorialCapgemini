package com.ccsw.tutorial.client;

import com.ccsw.tutorial.client.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

/**
 * @client ccsw
 *
 */
public interface ClientRepository extends CrudRepository<Client, Long> {

    /**
     * Método para recuperar un listado paginado de {@link Client}
     *
     * @param pageable pageable
     * @return {@link Page} de {@link Client}
     */
    Page<Client> findAll(Pageable pageable);

    /**
     * Busca un cliente por su nombre.
     *
     * @param name Nombre del cliente
     * @return Cliente si existe, o null si no existe
     */
    boolean existsByName(String name);

}
