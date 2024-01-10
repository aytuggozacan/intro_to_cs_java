package exercise;

public class Main_Vaccination_Center {

	public static void main(String[] args) {
		// In main class, declared new variables as Person and create new Vaccination Center. Then, I use the methods I defined.
	
		Person Ann = new Person("Ann", false);
		Person Bob = new Person("Bob", false);
		Person David = new Person("David", true);
		Person Alice = new Person("Alice", false);
		Person Eve = new Person("Eve", true);
		
		VaccinationCenter Main = new VaccinationCenter(0);
		
		Main.vaccinate();
		
		Main.addToLine(Ann);
		Main.addToLine(Bob);
		Main.addToLine(Alice);
		
		Main.visualizeLine();
		
		Main.addToLine(David);
		
		Main.visualizeLine();
		
		Main.addToLine(Eve);
		
		Main.vaccinate();
		Main.visualizeLine();
		
		Main.addToLine(Eve);
		
		Main.visualizeLine();
		Main.vaccinate();
		Main.vaccinate();
		Main.visualizeLine();
		Main.vaccinate();
		Main.vaccinate();
	

	}

}
