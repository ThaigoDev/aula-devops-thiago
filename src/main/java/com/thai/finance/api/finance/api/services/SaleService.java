package com.thai.finance.api.finance.api.domain.services;

import com.thai.finance.api.finance.api.domain.entities.Sale;
import com.thai.finance.api.finance.api.domain.repositories.SaleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleService {

    // O @RequiredArgsConstructor do Lombok injeta essa dependência automaticamente
    private final SaleRepository saleRepository;

    @Transactional
    public Sale create(Sale sale) {
        // Aqui você pode adicionar validações de negócio antes de salvar
        return saleRepository.save(sale);
    }

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    public Sale findById(Long id) {
        return saleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Venda não encontrada para o ID: " + id));
    }

    @Transactional
    public Sale update(Long id, Sale updatedSale) {
        Sale existingSale = findById(id);

        // Atualiza os campos necessários
        existingSale.setTotalAmount(updatedSale.getTotalAmount());
        existingSale.setStatus(updatedSale.getStatus());
        // A data da venda (saleDate) geralmente não é alterada após a criação

        return saleRepository.save(existingSale);
    }

    @Transactional
    public void delete(Long id) {
        Sale sale = findById(id);
        saleRepository.delete(sale);
    }
}