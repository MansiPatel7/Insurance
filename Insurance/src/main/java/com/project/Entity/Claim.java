package com.project.Entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Claim {

	    @Id
	    @GeneratedValue
	    private Long id;


	    private String claimNumber;


	    private String description;


	    private LocalDate claimDate;


	    private String claimStatus;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "insurance_policy_id")
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    private Insurance insurancePolicy;
}
