package by.htp.aggregation_composition.task2.entity;

public class SpareWheel extends Tire {
	private boolean rotate;

	public SpareWheel() {

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
		int result = super.hashCode();
		result = prime * result + (rotate ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SpareWheel other = (SpareWheel) obj;
		if (rotate != other.rotate)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SpareWheel [rotate=" + rotate + "]";
	}

}
