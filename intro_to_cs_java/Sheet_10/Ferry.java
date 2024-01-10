package exercise;

import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class Ferry {
	
	
	private Queue<String> lowerDeck = new ArrayDeque<String>();
	private Stack<String> upperDeck = new Stack<String>();
	private Stack<String> maneuverDeck = new Stack<String>();
	
	public void embarkCar(String car) {
		
		lowerDeck.add(car);
		System.out.println("Car " + car + " is parked in the lower deck");
		
	}
	
	public void embarkMotorbikes(String motorbike) {
		
		upperDeck.add(motorbike);
		System.out.println("Motorbike " + motorbike + " is parked in the upper deck");
		
	}
	

	public void disembarkCar(String car) {
		
		
		
		if(lowerDeck.contains(car) == true  ){
			
			int l = lowerDeck.size();
			for(int i= 0; i<l; i++) {
				String firstcar = lowerDeck.poll();
				if(firstcar != car) {
					
					lowerDeck.add(firstcar);
					System.out.println("Car " + firstcar + " left and reentered the lower deck");
				}
				else {
					System.out.println("Car " + firstcar + " disembarked");
					break;
					
				}	
				
			}

			}

		
		else if(lowerDeck.contains(car) == false) {
			System.out.println("Car " + car + " not on board");
		}
	}
		
	public void disembarkMotorbike(String motorbike) {
		
		if(upperDeck.contains(motorbike)) {
			
			int l = upperDeck.size();
			for(int i=0; i<l; i++) {
				String firstmotorbike = upperDeck.pop();
				if(firstmotorbike != motorbike) {
					maneuverDeck.add(firstmotorbike);
					System.out.println("Motorbike " + firstmotorbike + " went to the manouver deck");

				}
				else if(firstmotorbike == motorbike) {
					System.out.println("Motorbike " + firstmotorbike + " disembarked");
					break;
					
				}
			}	
		}
		else{
			System.out.println("Motorbike " + motorbike + " not on board");
		}
		int k = maneuverDeck.size();
		for(int j=0; j<k; j++) {
			
			String a = maneuverDeck.pop();
			upperDeck.add(a);
			System.out.println("Motorbike "+ a +" went back to the upper deck");
	
		}

	}
	
}
