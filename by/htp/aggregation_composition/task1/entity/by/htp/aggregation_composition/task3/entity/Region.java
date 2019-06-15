package by.htp.aggregation_composition.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String name;
	private int square;
	private String center;
	private List<City> cities = new ArrayList<City>();

	public Region() {

	}

	public Region(String name, int area, String center) {
		this.square = area;
		this.name = name;
		this.center = center;
	}

	public void addCity(City c) {
		cities.add(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + square;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", square=" + square + ", center=" + center + ", cities=" + cities + "]";
	}

}
