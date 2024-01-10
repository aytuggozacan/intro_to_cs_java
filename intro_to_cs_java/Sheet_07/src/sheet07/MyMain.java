package sheet07;

public class MyMain {

	public static void main(String[] args) {
		Computer pc = new Computer ();
		CabledConnection eth = new CabledConnection (); pc.connect(eth);
		eth.plugCable();
		pc.connect(eth);
		LTEConnection lte = new LTEConnection(10); pc.connect(lte);
		WifiConnection wifi = new WifiConnection(2); pc.connect(wifi);
		wifi.getCloser();
		wifi.getCloser();
		wifi.getCloser();
		pc.connect(wifi);

	}

}
