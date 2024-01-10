package sheet07;

public class CabledConnection {
	
	private boolean cablePlugged = false;
	
	public void plugCable () { cablePlugged = true;
	}
	public void unplugCable () { cablePlugged = false;
	}
	public boolean isCablePlugged() { return cablePlugged;
	}
}
