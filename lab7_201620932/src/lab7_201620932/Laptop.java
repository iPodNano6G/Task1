package lab7_201620932;

public class Laptop extends Product implements Networked, DataStorage {

	double totalCapacity = 500;
	double usedCapacity = 300;
	
	Laptop() {}

	@Override
	public double getFreeCapacity() {
		return totalCapacity - usedCapacity;
	}

	@Override
	public void format() {
		usedCapacity = 0;
		System.out.println("Formatted. Free Capacity : " + this.getFreeCapacity());
	}

	@Override
	public boolean isConnected() {
		return true;
	}

	@Override
	public double maxSpeed() {
		return 2.5;
	}

	@Override
	public String getName() {
		return Laptop.class.getSimpleName();
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	};
}
