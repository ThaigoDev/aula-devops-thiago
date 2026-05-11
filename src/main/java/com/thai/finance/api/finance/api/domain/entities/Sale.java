package com.thai.finance.api.finance.api.domain.entities;

import jakarta.persistence.*; // ou javax.persistence.* dependendo da versão do Spring Boot
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_sales") // É uma boa prática definir um nome explícito para a tabela
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // Facilita a criação de instâncias da classe
@EqualsAndHashCode(of = "id") // Boa prática para entidades JPA (comparar apenas pelo ID)
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sale_date", nullable = false)
    private LocalDateTime saleDate;

    @Column(name = "total_amount", nullable = false, precision = 19, scale = 2)
    private BigDecimal totalAmount;

    @PrePersist
    protected void onCreate() {
        if (this.saleDate == null) {
            this.saleDate = LocalDateTime.now();
        }
    }
}