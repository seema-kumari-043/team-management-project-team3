package com.seema.teammanagement.model;

import javax.persistence.Entity;

import lombok.Data;


@Data
public class TeamMember {
   
	 private Long team_id;
	 private Long member_id;
}
