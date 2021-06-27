package com.hibernate.orm.entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="horoscope")
public class Horoscope {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String horoscopeName;
	private String description;
	private String birthTime;
	private String cityId;
	private String logitude;
	private String lattitude;
	private int rashi;
	private int nakshatra;
	private int charan;
	private int nadi;
	private int gan;
	private int mangal;
	private String devak;
	
	@JsonManagedReference(value="candidate-horoscope")
    @OneToOne(targetEntity = Candidate.class, mappedBy = "horoscope")
    private Candidate candidate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHoroscopeName() {
		return horoscopeName;
	}

	public void setHoroscopeName(String horoscopeName) {
		this.horoscopeName = horoscopeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getLogitude() {
		return logitude;
	}

	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}

	public int getRashi() {
		return rashi;
	}

	public void setRashi(int rashi) {
		this.rashi = rashi;
	}

	public int getNakshatra() {
		return nakshatra;
	}

	public void setNakshatra(int nakshatra) {
		this.nakshatra = nakshatra;
	}

	public int getCharan() {
		return charan;
	}

	public void setCharan(int charan) {
		this.charan = charan;
	}

	public int getNadi() {
		return nadi;
	}

	public void setNadi(int nadi) {
		this.nadi = nadi;
	}

	public int getGan() {
		return gan;
	}

	public void setGan(int gan) {
		this.gan = gan;
	}

	public int getMangal() {
		return mangal;
	}

	public void setMangal(int mangal) {
		this.mangal = mangal;
	}

	public String getDevak() {
		return devak;
	}

	public void setDevak(String devak) {
		this.devak = devak;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	
}
