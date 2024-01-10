package sheet07;

public class WirelessConnection {
	
	private int distanceFromSource;
	public WirelessConnection(int distanceFromSource) {
	this.distanceFromSource = distanceFromSource; 
	}
	public void getCloser () {
	if (distanceFromSource > 0) {
	distanceFromSource -= 1;
	System.out.println("Got closer to the source"); } else {
	System.out.println("Can’t get any closer to the source"); }
}
	public void moveAway () {
		distanceFromSource += 1; System.out.println("Moved away from the source");
		}
		public boolean isSignalStrong() {
		if (distanceFromSource >= getThreshold()) {
		return false; } else {
		return true; }
		}
		public int getThreshold () { return 0;
		}
}
	