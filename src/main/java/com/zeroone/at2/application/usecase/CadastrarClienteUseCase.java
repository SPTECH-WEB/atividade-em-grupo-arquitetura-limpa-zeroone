package com.zeroone.at2.application.usecase;

import com.zeroone.at2.application.port.ClienteRepository;
import com.zeroone.at2.domain.Cliente;
import java.util.UUID;
import com.zeroone.at2.domain.valueobject.*;

public class CadastrarClienteUseCase {

    private final ClienteRepository clienteRepository;

    public CadastrarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente executar(Cliente cliente) {
        return clienteRepository.salvar(cliente);
    }
}

