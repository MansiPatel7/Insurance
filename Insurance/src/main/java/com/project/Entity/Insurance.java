package com.project.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insurance {

	@Id
    @GeneratedValue
    private Long id;


    private String policyNumber;


    private String type;


    private BigDecimal coverageAmount;


    private BigDecimal premium;



    private LocalDate startDate;


    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Client client;

    @OneToMany(mappedBy = "insurancePolicy", cascade = CascadeType.ALL)
    private Set<Claim> claims = new HashSet<>();
}
