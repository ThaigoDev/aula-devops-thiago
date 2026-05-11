package com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO;

public record ClienteSegurancaRequisicaoDTO(
        String clienteId,
        String clienteSenha,
        String urlRedirecionamento,
        String scopes
) {
}
