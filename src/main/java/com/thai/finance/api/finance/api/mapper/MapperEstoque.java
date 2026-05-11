package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.EstoqueDTO.EstoqueRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Estoque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperEstoque {
    @Mapping(target = "produto" , ignore = true )
    Estoque paraEntidade(EstoqueRequisicaoDTO estoqueRequisicaoDTO);

    @Mapping(target = "produto_id", source = "produto.id")
    EstoqueRespostaDTO paraDTO(Estoque estoque);
}
