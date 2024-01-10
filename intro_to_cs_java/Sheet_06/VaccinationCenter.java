package exercise;

public class VaccinationCenter {
// For this class, firstly I declared the variables and create the constructor.  
	private int lineSize;
	private Person[] line;
	private int count;
	
	public VaccinationCenter( int lineSize){
		
		this.lineSize = lineSize;
	    line = new Person[lineSize];
		count = 0;
		
	}
	/* For method vaccinate I create an if/else structure. As statement of 'if', if line is empty the method will print out 
	 *  "No one in the line!, and if the statement is false, the method will print out the name of the first person in the line is
	 *  vaccinated, and shift the other people in the line. For shifting the line I crate new one element less intermediate array,
	 *  and make it equal to original array but the first element is the second element of the original one. Then I increase the 
	 *  count by one, and decrease the lineSize by one. 
	*/
	public void vaccinate() {
		if(lineSize == 0) {
			System.out.println("No one in the line!");
		}
		else {
			
			System.out.println(line[0].getName() + " " + "gets the vaccine");
			Person[] vaccine = new Person[lineSize - 1];	
			for (int i = 0; i <line.length - 1; i++) {
				vaccine[i] = line[i + 1];	
				
			}
			count = count + 1;
			lineSize--;
			line = vaccine;
					
		}
	}
	/*For the method addToLine I defined an if structure. The if statement checks is enough space in the line, and if there is no space 
	 * state the line is full and rejection of the person with name. The else if statement checks the is there any space to new person and
	 * the new person has priority. If the statement is true locates the new person with to middle of the line. To do this, I defined a
	 * for loop to locate one by one, and I defined if structure to make the location for three parts. Firstly, I defined new intermediate 
	 * array which is one element greater than the original array. The if part locates the first elements of array as same as the origianal 
	 * array. Else if part locates the priority person to middle of the line, and else part shift the people after the middle of the 
	 * line. Finally, I increased lineSize by one and make equal the intermediate array to original array, and print out the name of the 
	 * priority person.
	 * */
	public void addToLine(Person p) {
		
		if (lineSize >= 4) {
			
			System.out.println("The line is full, " + p.getName() + " has been rejected");
			
		}
		else if (lineSize < 4 & p.hasPriority() == true) { 		
			
			Person[] prio = new  Person[lineSize + 1];
			
			 for (int i = 0; i < lineSize + 1; i++) {
				 
				 if (i < lineSize/2 +lineSize%2 - 1)
		                prio[i] = line[i];
				 
		            else if (i == lineSize/2 +lineSize%2 - 1)
		                prio[i] = p;
				 
		            else
		                prio[i] = line[i - 1];
				 
				 
			 }
		           	
		 	
		 	lineSize++;
		 	line = prio;
			System.out.println(p.getName() + " joined the line. Priority!");
			
			} 
		
		else {
			
			Person[] newbie = new  Person[lineSize + 1];
			for (int i = 0; i < lineSize; i++)
	            newbie[i] = line[i];
			newbie[lineSize] = p;
			lineSize++;
			line = newbie;
			System.out.println(p.getName() + " joined the line.");

		}
		
	}
	/*For the method visualizeLine, I create for loop to print out the name of the people in the line one by one. 
	 * */
	public void visualizeLine() {
		
		for(int i = 0; i < line.length;i++) {
			System.out.println(line[i].getName());
		
			
		}
		
	}
}

