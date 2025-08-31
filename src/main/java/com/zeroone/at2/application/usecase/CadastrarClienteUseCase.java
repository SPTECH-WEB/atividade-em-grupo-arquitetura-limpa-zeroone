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

    public Cliente executar(Nome nome,
                            Email email,
                            Telefone telefone,
                            String cpf,
                            RendaMensal rendaMensal,
                            Idade idade,
                            String profissao) {
        Cliente cliente = new Cliente(
                UUID.randomUUID(),
                nome,
                email,
                telefone,
                cpf,
                rendaMensal,
                idade,
                profissao
        );

        clienteRepository.salvar(cliente);
        return cliente;
    }
}

