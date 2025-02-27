package com.ccsw.tutorial.client;

import com.ccsw.tutorial.client.model.Client;
import com.ccsw.tutorial.client.model.ClientDto;
import com.ccsw.tutorial.client.model.ClientSearchDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @client ccsw
 *
 */
@Tag(name = "Client", description = "API of Client")
@RequestMapping(value = "/client")
@RestController
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    ModelMapper mapper;

    /**
     * Método para recuperar un listado paginado de {@link Client}
     *
     * @param dto dto de búsqueda
     * @return {@link Page} de {@link ClientDto}
     */
    @Operation(summary = "Find Page", description = "Method that return a page of Clients")
    @RequestMapping(path = "/search", method = RequestMethod.POST)
    public Page<ClientDto> findPage(@RequestBody ClientSearchDto dto) {

        Page<Client> page = this.clientService.findPage(dto);

        return new PageImpl<>(page.getContent().stream().map(e -> mapper.map(e, ClientDto.class)).collect(Collectors.toList()), page.getPageable(), page.getTotalElements());
    }

    /**
     * Método para crear un {@link Client}
     *
     * @param dto datos de la entidad
     */
    @Operation(summary = "Save or Update", description = "Method that saves or updates a Client")
    @RequestMapping(path = "", method = RequestMethod.POST)
    public void save(@RequestBody ClientDto dto) {
        boolean exists = clientService.existsByName(dto.getName());
        if (exists) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un cliente con el mismo nombre");
        }

        this.clientService.save(null, dto);
    }

    /**
     * Método para actualizar un {@link Client}
     *
     * @param id PK de la entidad
     * @param dto datos de la entidad
     */
    @Operation(summary = "Update", description = "Method that updates a Client")
    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable(name = "id") Long id, @RequestBody ClientDto dto) {
        boolean exists = clientService.existsByName(dto.getName());
        if (exists) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ya existe un cliente con el mismo nombre");
        }

        this.clientService.save(id, dto);
    }

    /**
     * Método para crear o actualizar un {@link Client}
     *
     * @param id PK de la entidad
     */
    @Operation(summary = "Delete", description = "Method that deletes a Client")
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) throws Exception {

        this.clientService.delete(id);
    }

    /**
     * Recupera un listado de clientes {@link Client}
     *
     * @return {@link List} de {@link ClientDto}
     */
    @Operation(summary = "Find", description = "Method that return a list of Client")
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<ClientDto> findAll() {

        List<Client> clients = this.clientService.findAll();

        return clients.stream().map(e -> mapper.map(e, ClientDto.class)).collect(Collectors.toList());
    }
}
