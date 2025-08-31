package com.zeroone.at2.application.port;

import com.zeroone.at2.domain.Cliente;
import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository {

    Cliente salvar(Cliente cliente);

    Optional<Cliente> buscarPorId(UUID id);

    boolean existsByCpf(String cpf);
}


