package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.FornecedorDTO.FornecedorRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.FornecedorDTO.FornecedorRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Fornecedor;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T19:32:29-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (JetBrains s.r.o.)"
)
@Component
public class MapperFornecedorImpl implements MapperFornecedor {

    @Override
    public Fornecedor paraEntidade(FornecedorRequisicaoDTO fornecedorRequisicaoDTO) {
        if ( fornecedorRequisicaoDTO == null ) {
            return null;
        }

        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome( fornecedorRequisicaoDTO.nome() );
        fornecedor.setEmail( fornecedorRequisicaoDTO.email() );
        fornecedor.setTelefone( fornecedorRequisicaoDTO.telefone() );

        return fornecedor;
    }

    @Override
    public FornecedorRespostaDTO paraDTO(Fornecedor fornecedor) {
        if ( fornecedor == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;
        String email = null;
        String telefone = null;

        id = fornecedor.getId();
        nome = fornecedor.getNome();
        email = fornecedor.getEmail();
        telefone = fornecedor.getTelefone();

        FornecedorRespostaDTO fornecedorRespostaDTO = new FornecedorRespostaDTO( id, nome, email, telefone );

        return fornecedorRespostaDTO;
    }
}
