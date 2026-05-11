package com.thai.finance.api.finance.api.services;

import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Estoque;
import com.thai.finance.api.finance.api.mapper.MapperEstoque;
import com.thai.finance.api.finance.api.respository.RepositoryEstoque;
import com.thai.finance.api.finance.api.respository.RepositoryProduto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ServiceEstoque {
    private final RepositoryEstoque repositoryEstoque;
    private final RepositoryProduto repositoryProduto;
    private final MapperEstoque mapper;

    public EstoqueRespostaDTO salvar(EstoqueRequisicaoDTO estoqueRequisicaoDTO) {
        var produtoEncontrado = repositoryProduto.findById(estoqueRequisicaoDTO.produto_id()).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado"));
        Estoque estoqueEtidade =  mapper.paraEntidade(estoqueRequisicaoDTO);
        estoqueEtidade.setProduto(produtoEncontrado);
        return mapper.paraDTO(repositoryEstoque.save(estoqueEtidade));
    }

    public List<EstoqueRespostaDTO> obter() {
        return repositoryEstoque.findAll().stream().map(mapper::paraDTO).toList();
    }

    public EstoqueRespostaDTO obterPorId(UUID estoque_id) {
        return mapper.paraDTO(repositoryEstoque.findById(estoque_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estoque não encontrado")));
    }
}
