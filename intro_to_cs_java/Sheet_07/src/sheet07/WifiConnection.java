package sheet07;

public class WifiConnection extends WirelessConnection {
	
	public WifiConnection(int distanceFromSource) { super(distanceFromSource);
	}
	public int getThreshold () { return 2;
	}
	
}
