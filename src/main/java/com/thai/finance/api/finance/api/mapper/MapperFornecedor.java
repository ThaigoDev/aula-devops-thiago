package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.FornecedorDTO.FornecedorRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.FornecedorDTO.FornecedorRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Fornecedor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperFornecedor {

    Fornecedor paraEntidade(FornecedorRequisicaoDTO fornecedorRequisicaoDTO);
    FornecedorRespostaDTO paraDTO(Fornecedor fornecedor);

}
