package com.javacourse.project.hibernateAndJpa.Entities;

import javax.persistence.*;


//Annotation: veri tabanı tablosu olduğunu bildirmemiz için aşağıdaki gibi Annotation veriyoruz.
//Mysql'de hangi tabloya karşılık gelecekse belirtilir.Ve yukardaki gibi manuel gelmese bile import olarak kütüphanesi yazılıe. Ona rağmen hata verirse pom.xml gelip ilgili dependence yazılır.

@Entity //Veri tabanı nesnesi olduğunu bildirdik.
@Table(name="city")
public class City {
	
	@Id
	@Column(name="ID") //Veritabanında hangi kolonlara karşılık geldiğini belirttik.
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Bu Id alanının bir identity olduğunu ve otomatik artacağını da bu annotation ile bu strateji üzerinden yapmaktayız.
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="countrycode")
	private String countryCode;
	
	@Column(name="district")
	private String district;
	
	@Column(name="population")
	private int population;
	
	public City(int id, String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	public City() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
}
