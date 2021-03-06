package com.sklep.entity.utwor;

import java.io.Serializable;
import com.sklep.entity.album.Album;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "utwor")
public class Utwor implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Utwor_ID;

	@Column(name = "UtworNazwa")
	private String utworNazwa;

	@Column(name = "Dlugosc")
	private String dlugosc;

	@ManyToOne()
	@JoinColumn(name = "Album_ID")
	private Album Album;

	public Utwor() {
	};

	public int getId() {
		return Utwor_ID;
	}
	
	public void setId(int Utwor_ID){
		this.Utwor_ID = Utwor_ID;
	}
	
	public Album getAlbum()
	{
		return this.Album;
	}
	
	public void setAlbum(Album album) {
		this.Album = album;
	}

	public String getUtworNazwa() {
		return utworNazwa;
	}

	public void setUtworNazwa(String utworNazwa) {
		this.utworNazwa = utworNazwa;
	}

	public String getDlugosc() {
		return dlugosc;
	}

	public void setDlugosc(String dlugosc) {
		this.dlugosc = dlugosc;
	}

}