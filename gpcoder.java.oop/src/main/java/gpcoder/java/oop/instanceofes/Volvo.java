package gpcoder.java.oop.instanceofes;

public class Volvo extends Vehicle {
	private String model;

	public Volvo(String name, int speed, String model) {
		super(name, speed);
		this.model = model;
	}

	public Volvo() {
		super();
	}

	public Volvo(String name, int speed) {
		super(name, speed);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Volvo other = (Volvo) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Volvo [model=" + model + "]";
	}

	/*
	 * Cant override final method
	 * 
	 * @Override public void run() { super.run(); }
	 */

}
