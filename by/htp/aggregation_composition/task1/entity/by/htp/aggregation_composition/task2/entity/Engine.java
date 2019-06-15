package by.htp.aggregation_composition.task2.entity;

public class Engine {
	
	private boolean turnOn = false;
	
	public Engine() {
		
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (turnOn ? 1231 : 1237);
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
		Engine other = (Engine) obj;
		if (turnOn != other.turnOn)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [turnOn=" + turnOn + "]";
	}
	
	

}
