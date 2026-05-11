package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Estoque;
import com.thai.finance.api.finance.api.domain.entities.Produto;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T19:32:29-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (JetBrains s.r.o.)"
)
@Component
public class MapperEstoqueImpl implements MapperEstoque {

    @Override
    public Estoque paraEntidade(EstoqueRequisicaoDTO estoqueRequisicaoDTO) {
        if ( estoqueRequisicaoDTO == null ) {
            return null;
        }

        Estoque estoque = new Estoque();

        estoque.setQuantidade( estoqueRequisicaoDTO.quantidade() );

        return estoque;
    }

    @Override
    public EstoqueRespostaDTO paraDTO(Estoque estoque) {
        if ( estoque == null ) {
            return null;
        }

        UUID produto_id = null;
        UUID id = null;
        Integer quantidade = null;
        LocalDateTime ultima_atualizacao = null;

        produto_id = estoqueProdutoId( estoque );
        id = estoque.getId();
        quantidade = estoque.getQuantidade();
        ultima_atualizacao = estoque.getUltima_atualizacao();

        EstoqueRespostaDTO estoqueRespostaDTO = new EstoqueRespostaDTO( id, produto_id, quantidade, ultima_atualizacao );

        return estoqueRespostaDTO;
    }

    private UUID estoqueProdutoId(Estoque estoque) {
        Produto produto = estoque.getProduto();
        if ( produto == null ) {
            return null;
        }
        return produto.getId();
    }
}
