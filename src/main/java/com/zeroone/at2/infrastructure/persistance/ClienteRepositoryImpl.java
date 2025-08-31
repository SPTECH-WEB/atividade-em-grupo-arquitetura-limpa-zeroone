package com.zeroone.at2.infrastructure.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepositoryImpl extends JpaRepository<ClienteEntity, UUID> {
}
