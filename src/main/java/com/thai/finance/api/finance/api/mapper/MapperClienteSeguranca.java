package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.ClienteSegurancaDTO.ClienteSegurancaRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.ClienteSeguranca;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface MapperClienteSeguranca {

    ClienteSeguranca paraEntidade(ClienteSegurancaRequisicaoDTO clienteSegurancaRequisicaoDTO);
    ClienteSegurancaRespostaDTO paraDTO(ClienteSeguranca clienteSeguranca);
}
