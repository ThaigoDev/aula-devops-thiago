package com.thai.finance.api.finance.api.respository;

import com.thai.finance.api.finance.api.domain.entities.ClienteSeguranca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryClienteSeguranca extends JpaRepository<ClienteSeguranca, UUID> {
}
