package sheet07;

public class LTEConnection extends WirelessConnection {
	
	public LTEConnection(int distanceFromSource) { 
		super(distanceFromSource);
	}
	
	public int getThreshold () { 
		return 10;
	}
}
