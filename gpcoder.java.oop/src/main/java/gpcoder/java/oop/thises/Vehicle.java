package gpcoder.java.oop.thises;

public class Vehicle {
	protected String name;
	protected int speed;

	public Vehicle(String name, int speed) {
		this();
		this.name = name;
		this.speed = speed;
		System.out.println("All Args Constructor");
	}

	public Vehicle() {
		super();
		System.out.println("No Agrs Constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
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
		Vehicle other = (Vehicle) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		System.out.println(this);
		return "Vehicle [name=" + name + ", speed=" + speed + "]";
	}

}
