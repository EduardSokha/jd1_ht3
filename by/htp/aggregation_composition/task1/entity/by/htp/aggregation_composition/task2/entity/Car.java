package by.htp.aggregation_composition.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private int fuel = 0;
	private List<Tire> tires = new ArrayList<Tire>();
	private Engine eng;
	private String name = "geely";
	
	
	public Car() {
	}

	public Car(Engine eng) {
		this.eng = eng;
	}

	public void add(Tire t) {
		tires.add(t);
	}

	public int refuel(int fuel) {
		this.fuel += fuel;
		return this.fuel;
	}

	public String go() {
		eng.setTurnOn(true);
		String st = "Turnon=" + eng.isTurnOn();
		return st;
	}
	
	public void change(Tire tr, int ind) {
		tires.remove(ind);
		tires.add(ind, tr);		
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public int getFuel() {
		return fuel;
	}

	public List<Tire> getTires() {
		return tires;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eng == null) ? 0 : eng.hashCode());
		result = prime * result + fuel;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tires == null) ? 0 : tires.hashCode());
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
		Car other = (Car) obj;
		if (eng == null) {
			if (other.eng != null)
				return false;
		} else if (!eng.equals(other.eng))
			return false;
		if (fuel != other.fuel)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tires == null) {
			if (other.tires != null)
				return false;
		} else if (!tires.equals(other.tires))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", tires=" + tires + ", eng=" + eng + ", name=" + name + "]";
	}
	
	

}
