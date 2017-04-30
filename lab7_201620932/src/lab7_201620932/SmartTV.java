package lab7_201620932;

public class SmartTV extends Product implements Networked {

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
		return SmartTV.class.getSimpleName();
	}
	
	int channel;
	
	SmartTV() {}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	};
	

}
