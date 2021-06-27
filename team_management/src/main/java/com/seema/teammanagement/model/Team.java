package com.seema.teammanagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(nullable = false, updatable = false )
	private Long id;
	 @Column(nullable = false, updatable = false )
	private String name;
      
	 
	 //hibernate mapping 
	 @ManyToOne
	 private Department department;
	
	 @OneToMany(mappedBy = "team")
	 private List<Member> members;
}
