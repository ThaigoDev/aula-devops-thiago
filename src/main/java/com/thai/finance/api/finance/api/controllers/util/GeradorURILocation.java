package com.thai.finance.api.finance.api.controllers.util;

import jakarta.servlet.ServletContext;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

public interface GeradorURILocation {

    default URI gerar(UUID id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }
}
