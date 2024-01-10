package exercise;

public class Person {
	// Firstly, I declared my variables, and create constructor of the class.  
	
private String name;
private Boolean priority;

Person(String name, Boolean priority){
	
	this.name = name;
	this.priority = priority;
	
}

    // I defined two methods which are return the value of the variables. 
public String getName() {
	
	return name;
	
}

public boolean hasPriority() {
	
	return priority;
	
}
}
