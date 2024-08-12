package com.iiht.bs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="LoginData")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	    @Id
	    private Long id;
	    private String name;

	    // Getters and setters (generated or manually implemented)

	    // Constructors (empty and parameterized) if needed

	    // Additional fields and methods as per your application requirements
	}


