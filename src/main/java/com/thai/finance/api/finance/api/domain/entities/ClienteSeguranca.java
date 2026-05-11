package com.thai.finance.api.finance.api.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table
@Data
public class ClienteSeguranca {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column( name = "cliente_id")
    private String clienteId;
    @Column( name = "cliente_senha")
    private String clienteSenha;
    @Column( name = "url_redirecionamento")
    private String urlRedirecionamento;
    @Column( name = "scopes")
    private String scopes;

}
