package lab7_201620932;

public class Laptop extends Product implements Networked, DataStorage {

	double totalCapacity;
	double usedCapacity;
	
	Laptop() {}

	@Override
	public double getFreeCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void format() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double maxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
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
