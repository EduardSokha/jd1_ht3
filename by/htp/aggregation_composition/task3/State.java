package by.htp.aggregation_composition.task3;

import java.util.ArrayList;
import java.util.List;

import by.htp.aggregation_composition.task3.entity.Region;

public class State {
	private String name;
	private String capital = "Minsk";
	private List<Region> regions = new ArrayList<Region>();
	private int square;
	private String center = "";

	public State() {

	}

	public State(String name) {
		this.name = name;
	}

	public void addRegion(Region regn) {
		regions.add(regn);
	}

	public int numRegions() {
		int num = regions.size();
		return num;
	}

	public int square() {
		for (int i = 0; i < regions.size(); i++) {
			square += regions.get(i).getSquare();

//			System.out.println(fullSentense);
//			System.out.println(sentence.size());
		}
//		System.out.println(fullSentense);
		return square;
	}

	public String centers() {
		for (int i = 0; i < regions.size(); i++) {
			center += regions.get(i).getCenter() + " ";

//			System.out.println(fullSentense);
//			System.out.println(sentence.size());
		}
//		System.out.println(fullSentense);
		return center;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", capital=" + capital + ", regions=" + regions + ", square=" + square
				+ ", center=" + center + "]";
	}

}
