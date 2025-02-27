package com.ccsw.tutorial.client;

import com.ccsw.tutorial.client.model.Client;
import com.ccsw.tutorial.client.model.ClientDto;
import com.ccsw.tutorial.client.model.ClientSearchDto;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @client ccsw
 *
 */
public interface ClientService {

    /**
     * Recupera un {@link Client} a través de su ID
     *
     * @param id PK de la entidad
     * @return {@link Client}
     */
    Client get(Long id);

    /**
     * Método para recuperar un listado paginado de {@link Client}
     *
     * @param dto dto de búsqueda
     * @return {@link Page} de {@link Client}
     */
    Page<Client> findPage(ClientSearchDto dto);

    /**
     * Método para crear o actualizar un {@link Client}
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    void save(Long id, ClientDto dto);

    /**
     * Método para crear o actualizar un {@link Client}
     *
     * @param id PK de la entidad
     */
    void delete(Long id) throws Exception;

    /**
     * Recupera un listado de autores {@link Client}
     *
     * @return {@link List} de {@link Client}
     */
    List<Client> findAll();

    /**
     * Verifica si existe un cliente con el mismo nombre.
     *
     * @param name Nombre del cliente a verificar
     * @return true si existe, false en caso contrario
     */
    boolean existsByName(String name);
}