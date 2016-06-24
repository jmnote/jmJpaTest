package com.example.jpatest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	@Id private Integer id;
	@Column private String title;
	@Column private String image;
	@Column private Integer year;
	@Column private String plot;
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", image=" + image + ", year=" + year + ", plot=" + plot + "]";
	}
}
