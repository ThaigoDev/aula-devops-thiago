package com.thai.finance.api.finance.api.mapper;

import com.thai.finance.api.finance.api.domain.dtos.CategoriaDTO.CategoriaRequisicaoDTO;
import com.thai.finance.api.finance.api.domain.dtos.CategoriaDTO.CategoriaRespostaDTO;
import com.thai.finance.api.finance.api.domain.entities.Categoria;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-05-11T19:32:28-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (JetBrains s.r.o.)"
)
@Component
public class MapperCategoriaImpl implements MapperCategoria {

    @Override
    public Categoria paraEntidade(CategoriaRequisicaoDTO categoriaRequisicaoDTO) {
        if ( categoriaRequisicaoDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setNome( categoriaRequisicaoDTO.nome() );
        categoria.setDescricao( categoriaRequisicaoDTO.descricao() );

        return categoria;
    }

    @Override
    public CategoriaRespostaDTO paraDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        UUID id = null;
        String nome = null;

        id = categoria.getId();
        nome = categoria.getNome();

        CategoriaRespostaDTO categoriaRespostaDTO = new CategoriaRespostaDTO( id, nome );

        return categoriaRespostaDTO;
    }
}
