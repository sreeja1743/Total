package com.capg.jpa.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
	@Embeddable
	public class Address {

		@Column(name = "buildingAddress")
		private int houseNumber;
		private String cityName;
		private String state;
		
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public int getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(int houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		
}
