package com.zeroone.at2.infrastructure.persistance;

import com.zeroone.at2.adapters.dtos.ClienteEntityRequestDto;
import com.zeroone.at2.adapters.dtos.ClienteEntityResponseDto;
import com.zeroone.at2.domain.Cliente;

public class ClienteMapper {
    public static ClienteEntity toEntity (Cliente cliente){
        return new ClienteEntity(
                cliente.getId(),
                cliente.getNome().getValue(),
                cliente.getEmail().getValue(),
                cliente.getTelefone().getValue(),
                cliente.getCpf().getValue(),
                cliente.getRendaMensal().getValue(),
                cliente.getRendaMensal().getClassificacaoRisco().getEstrategia(),
                cliente.getIdade().getValue(),
                cliente.getProfissao()
        );
    }

    public static Cliente toRawCliente(ClienteEntity entity){
        return Cliente.existingClient(
                entity.getId().toString(),
                entity.getNome(),
                entity.getEmail(),
                entity.getTelefone(),
                entity.getCpf(),
                entity.getRendaMensal(),
                entity.getIdade(),
                entity.getProfissao()
        );
    }

    public static Cliente toRawCliente(ClienteEntityRequestDto dto){
        return Cliente.newCliente(
                dto.nome(),
                dto.email(),
                dto.telefone(),
                dto.cpf(),
                dto.rendaMensal(),
                dto.idade(),
                dto.profissao()
        );
    }

    public static ClienteEntityResponseDto toResponseDto(Cliente cliente){
        return new ClienteEntityResponseDto(
                cliente.getId(),
                cliente.getNome().getValue(),
                cliente.getEmail().getValue(),
                cliente.getRendaMensal().getValue(),
                cliente.getRendaMensal().getClassificacaoRisco().getEstrategia()
        );
    }
}
