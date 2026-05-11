package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.ClienteSeguranca;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T19:32:29-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (JetBrains s.r.o.)"
)
@Component
public class MapperClienteSegurancaImpl implements MapperClienteSeguranca {

    @Override
    public ClienteSeguranca paraEntidade(ClienteSegurancaRequisicaoDTO clienteSegurancaRequisicaoDTO) {
        if ( clienteSegurancaRequisicaoDTO == null ) {
            return null;
        }

        ClienteSeguranca clienteSeguranca = new ClienteSeguranca();

        clienteSeguranca.setClienteId( clienteSegurancaRequisicaoDTO.clienteId() );
        clienteSeguranca.setClienteSenha( clienteSegurancaRequisicaoDTO.clienteSenha() );
        clienteSeguranca.setUrlRedirecionamento( clienteSegurancaRequisicaoDTO.urlRedirecionamento() );
        clienteSeguranca.setScopes( clienteSegurancaRequisicaoDTO.scopes() );

        return clienteSeguranca;
    }

    @Override
    public ClienteSegurancaRespostaDTO paraDTO(ClienteSeguranca clienteSeguranca) {
        if ( clienteSeguranca == null ) {
            return null;
        }

        UUID id = null;
        String clienteId = null;
        String clienteSenha = null;
        String urlRedirecionamento = null;
        String scopes = null;

        id = clienteSeguranca.getId();
        clienteId = clienteSeguranca.getClienteId();
        clienteSenha = clienteSeguranca.getClienteSenha();
        urlRedirecionamento = clienteSeguranca.getUrlRedirecionamento();
        scopes = clienteSeguranca.getScopes();

        ClienteSegurancaRespostaDTO clienteSegurancaRespostaDTO = new ClienteSegurancaRespostaDTO( id, clienteId, clienteSenha, urlRedirecionamento, scopes );

        return clienteSegurancaRespostaDTO;
    }
}
