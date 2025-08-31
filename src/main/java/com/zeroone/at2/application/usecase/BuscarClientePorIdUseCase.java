package com.zeroone.at2.application.usecase;

import com.zeroone.at2.application.port.ClienteRepository;
import com.zeroone.at2.domain.Cliente;
import jakarta.persistence.EntityNotFoundException;

import java.util.UUID;

public class BuscarClientePorIdUseCase {
    private final ClienteRepository clienteRepository;

    public BuscarClientePorIdUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public Cliente executa(String id){
        UUID idParaBuscar = UUID.fromString(id);
        return clienteRepository.buscarPorId(idParaBuscar).orElseThrow(
                () -> new EntityNotFoundException("Cliente não encontrado")
        );
    }
}
