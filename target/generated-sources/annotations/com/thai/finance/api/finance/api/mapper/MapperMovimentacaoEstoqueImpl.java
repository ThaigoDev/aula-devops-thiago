package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.MovimentacaoEstoqueDTO.MovimentacaoEstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.MovimentacaoEstoqueDTO.MovimentacaoEstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.MovimentacaoEstoque;
import com.thai.finance.api.finance.api.domain.entities.Produto;
import com.thai.finance.api.finance.api.domain.enums.TipoMovimentacaoEstoque;
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
public class MapperMovimentacaoEstoqueImpl implements MapperMovimentacaoEstoque {

    @Override
    public MovimentacaoEstoque paraEntidade(MovimentacaoEstoqueRequisicaoDTO movimentacaoEstoqueRequisicaoDTO) {
        if ( movimentacaoEstoqueRequisicaoDTO == null ) {
            return null;
        }

        MovimentacaoEstoque movimentacaoEstoque = new MovimentacaoEstoque();

        movimentacaoEstoque.setTipo( movimentacaoEstoqueRequisicaoDTO.tipo() );
        movimentacaoEstoque.setQuantidade( movimentacaoEstoqueRequisicaoDTO.quantidade() );
        movimentacaoEstoque.setMotivo( movimentacaoEstoqueRequisicaoDTO.motivo() );

        return movimentacaoEstoque;
    }

    @Override
    public MovimentacaoEstoqueRespostaDTO paraDTO(MovimentacaoEstoque movimentacaoEstoque) {
        if ( movimentacaoEstoque == null ) {
            return null;
        }

        UUID produto_id = null;
        UUID id = null;
        TipoMovimentacaoEstoque tipo = null;
        Integer quantidade = null;
        String motivo = null;
        LocalDateTime data_movimentacao = null;

        produto_id = movimentacaoEstoqueProdutoId( movimentacaoEstoque );
        id = movimentacaoEstoque.getId();
        tipo = movimentacaoEstoque.getTipo();
        quantidade = movimentacaoEstoque.getQuantidade();
        motivo = movimentacaoEstoque.getMotivo();
        data_movimentacao = movimentacaoEstoque.getData_movimentacao();

        MovimentacaoEstoqueRespostaDTO movimentacaoEstoqueRespostaDTO = new MovimentacaoEstoqueRespostaDTO( id, produto_id, tipo, quantidade, motivo, data_movimentacao );

        return movimentacaoEstoqueRespostaDTO;
    }

    private UUID movimentacaoEstoqueProdutoId(MovimentacaoEstoque movimentacaoEstoque) {
        Produto produto = movimentacaoEstoque.getProduto();
        if ( produto == null ) {
            return null;
        }
        return produto.getId();
    }
}
