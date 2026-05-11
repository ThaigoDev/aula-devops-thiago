package com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO;

import java.util.UUID;

public record ClienteSegurancaRespostaDTO(
        UUID id,
        String clienteId,
        String clienteSenha,
        String urlRedirecionamento,
        String scopes
) {
}
