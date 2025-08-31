package com.zeroone.at2.infrastructure.persistance;

import com.zeroone.at2.domain.valueobject.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {
    @Id
    private UUID id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Double rendaMensal;
    private String classificacaoDescricao;
    private Integer idade;
    private String profissao;
}
