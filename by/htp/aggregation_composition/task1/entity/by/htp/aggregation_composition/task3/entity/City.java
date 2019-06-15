package by.htp.aggregation_composition.task3.entity;

public class City {

	private String name;
	private int population;
	private Area ar;

	public City() {

	}

	public City(String name, int population, Area ar) {
		this.name = name;
		this.population = population;
		this.ar = ar;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Area getAr() {
		return ar;
	}

	public void setAr(Area ar) {
		this.ar = ar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ar == null) ? 0 : ar.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		City other = (City) obj;
		if (ar == null) {
			if (other.ar != null)
				return false;
		} else if (!ar.equals(other.ar))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", ar=" + ar + "]";
	}

}
