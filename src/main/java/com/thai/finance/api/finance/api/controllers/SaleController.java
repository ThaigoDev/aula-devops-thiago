package com.thai.finance.api.finance.api.controllers;

import com.thai.finance.api.finance.api.domain.entities.Sale;
import com.thai.finance.api.finance.api.domain.services.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @PostMapping
    public ResponseEntity<Sale> create(@RequestBody Sale sale) {
        Sale createdSale = saleService.create(sale);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSale);
    }

    @GetMapping
    public ResponseEntity<List<Sale>> findAll() {
        List<Sale> sales = saleService.findAll();
        return ResponseEntity.ok(sales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> findById(@PathVariable Long id) {
        Sale sale = saleService.findById(id);
        return ResponseEntity.ok(sale);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sale> update(@PathVariable Long id, @RequestBody Sale sale) {
        Sale updatedSale = saleService.update(id, sale);
        return ResponseEntity.ok(updatedSale);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        saleService.delete(id);
        return ResponseEntity.noContent().build();
    }
}