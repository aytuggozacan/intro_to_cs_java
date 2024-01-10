package sheet07;

public class Computer {
	
	public void connect(WirelessConnection connection) { if (connection.isSignalStrong()) {
		System.out.println("Computer connected to the internet!"); } else {
		System.out.println("Wireless signal too weak. Please get closer");
		}
	}
	
		public void connect(CabledConnection connection) { if (connection.isCablePlugged()) {
		System.out.println("Computer connected to the internet!"); } else {
		System.out.println("Ethernet cable unplugged. Please plug cable"); 
		}

}
	}
