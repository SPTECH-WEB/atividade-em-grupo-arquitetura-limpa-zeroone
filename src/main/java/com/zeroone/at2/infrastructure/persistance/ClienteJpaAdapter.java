package com.zeroone.at2.infrastructure.persistance;

import com.zeroone.at2.application.port.ClienteRepository;
import com.zeroone.at2.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class ClienteJpaAdapter implements ClienteRepository {
    @Autowired
    private ClienteRepositoryImpl repository;

    @Override
    public Cliente salvar(Cliente cliente) {
        ClienteEntity entity = ClienteMapper.toEntity(cliente);
        ClienteEntity saved = repository.save(entity);
        return ClienteMapper.toRawCliente(saved);
    }

    @Override
    public Optional<Cliente> buscarPorId(UUID id) {
        return repository.findById(id).map(ClienteMapper::toRawCliente);
    }

    @Override
    public boolean existsByCpf(String cpf) {
        return false;
    }
}
