package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.ProdutoDTO.ProdutoRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.ProdutoDTO.ProdutoRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Categoria;
import com.thai.finance.api.finance.api.domain.entities.Fornecedor;
import com.thai.finance.api.finance.api.domain.entities.Produto;
import java.math.BigInteger;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T19:32:29-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (JetBrains s.r.o.)"
)
@Component
public class MapperProdutoImpl implements MapperProduto {

    @Override
    public Produto paraEntidade(ProdutoRequisicaoDTO produtoRequisicaoDTO) {
        if ( produtoRequisicaoDTO == null ) {
            return null;
        }

        Produto produto = new Produto();

        produto.setCategoria( produtoRequisicaoDTOToCategoria( produtoRequisicaoDTO ) );
        produto.setFornecedor( produtoRequisicaoDTOToFornecedor( produtoRequisicaoDTO ) );
        produto.setNome( produtoRequisicaoDTO.nome() );
        produto.setSku( produtoRequisicaoDTO.sku() );
        produto.setEstoque_minimo( produtoRequisicaoDTO.estoque_minimo() );
        produto.setPreco( produtoRequisicaoDTO.preco() );
        if ( produtoRequisicaoDTO.ativo() != null ) {
            produto.setAtivo( produtoRequisicaoDTO.ativo() );
        }

        return produto;
    }

    @Override
    public ProdutoRespostaDTO paraDTO(Produto produto) {
        if ( produto == null ) {
            return null;
        }

        UUID categoria_id = null;
        UUID fornecedor_id = null;
        UUID id = null;
        String nome = null;
        String sku = null;
        Integer estoque_minimo = null;
        BigInteger preco = null;
        Boolean ativo = null;

        categoria_id = produtoCategoriaId( produto );
        fornecedor_id = produtoFornecedorId( produto );
        id = produto.getId();
        nome = produto.getNome();
        sku = produto.getSku();
        estoque_minimo = produto.getEstoque_minimo();
        preco = produto.getPreco();
        ativo = produto.isAtivo();

        ProdutoRespostaDTO produtoRespostaDTO = new ProdutoRespostaDTO( id, nome, sku, estoque_minimo, categoria_id, preco, fornecedor_id, ativo );

        return produtoRespostaDTO;
    }

    protected Categoria produtoRequisicaoDTOToCategoria(ProdutoRequisicaoDTO produtoRequisicaoDTO) {
        if ( produtoRequisicaoDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( produtoRequisicaoDTO.categoria_id() );

        return categoria;
    }

    protected Fornecedor produtoRequisicaoDTOToFornecedor(ProdutoRequisicaoDTO produtoRequisicaoDTO) {
        if ( produtoRequisicaoDTO == null ) {
            return null;
        }

        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setId( produtoRequisicaoDTO.fornecedor_id() );

        return fornecedor;
    }

    private UUID produtoCategoriaId(Produto produto) {
        Categoria categoria = produto.getCategoria();
        if ( categoria == null ) {
            return null;
        }
        return categoria.getId();
    }

    private UUID produtoFornecedorId(Produto produto) {
        Fornecedor fornecedor = produto.getFornecedor();
        if ( fornecedor == null ) {
            return null;
        }
        return fornecedor.getId();
    }
}
