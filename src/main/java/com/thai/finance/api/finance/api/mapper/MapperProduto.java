package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.ProdutoDTO.ProdutoRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.ProdutoDTO.ProdutoRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapperProduto {

 @Mapping(target = "categoria.id" , source = "categoria_id")
 @Mapping(target = "fornecedor.id" , source = "fornecedor_id")
 Produto paraEntidade(ProdutoRequisicaoDTO produtoRequisicaoDTO);

 @Mapping(target = "categoria_id", source = "categoria.id")
 @Mapping(target = "fornecedor_id", source = "fornecedor.id")
 ProdutoRespostaDTO paraDTO(Produto produto);
}
