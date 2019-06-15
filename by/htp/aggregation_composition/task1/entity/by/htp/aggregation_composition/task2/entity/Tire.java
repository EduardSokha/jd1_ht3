package by.htp.aggregation_composition.task2.entity;

public class Tire {
	
	private boolean rotate;
	
	public Tire() {
		
	}

	public boolean isRotate() {
		return rotate;
	}

	public void setRotate(boolean rotate) {
		this.rotate = rotate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (rotate ? 1231 : 1237);
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
		Tire other = (Tire) obj;
		if (rotate != other.rotate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tire [rotate=" + rotate + "]";
	}
	
	

}
