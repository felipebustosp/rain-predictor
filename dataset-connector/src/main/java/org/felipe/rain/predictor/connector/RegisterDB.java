package org.felipe.rain.predictor.connector;

public class RegisterDB {
	
	private Integer id ; 
	private String name ; 
	private String altitude ; 
	private String year ; 
	private String month ; 
	private String day ;
	private String water ;
	
	public RegisterDB(Integer id, 
					  String name,
					  String altitude,
					  String year, 
					  String month, 
					  String day, 
					  String water) {
		this.id = id;
		this.name = name;
		this.altitude = altitude;
		this.year = year;
		this.month = month;
		this.day = day;
		this.water = water;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the altitude
	 */
	public String getAltitude() {
		return altitude;
	}
	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public String getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}
	/**
	 * @return the water
	 */
	public String getWater() {
		return water;
	}
	/**
	 * @param water the water to set
	 */
	public void setWater(String water) {
		this.water = water;
	}
	
	

}
