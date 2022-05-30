package com.tistory.jacobcloud.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude="movie")
@Data
public class MovieImage extends BaseEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long Inum;
	private String uuid;
	private String imgName;
	private String path;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Movie movie;
	

}
