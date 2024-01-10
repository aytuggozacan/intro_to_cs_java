package bwl2018_VectorAndIterators;

import java.util.Iterator;
import java.util.Vector;

public class VectorAndIterators {

	public static void main(String[] args){
		//----------------
		//without Generics
		//----------------
		Vector dynamicArray = new Vector();
		LittleBee maja = new LittleBee();
		maja.collectedPollen = 200;
		Bicycle bike = new Bicycle();
		bike.gear = 17;
		LittleBee someLittleBee;
		Bicycle someBicycle;
		dynamicArray.add(maja);
		dynamicArray.add(bike);
		//use enhanced for loop:
		for(Object object : dynamicArray){ 
		//we could also express this enhanced for loop by the following statements
		//Iterator iterator = dynamicArray.iterator();
		//Object object = null;
		//while(iterator.hasNext()){
		//	object = iterator.next();
			if(object instanceof LittleBee){ //lots of boilerplate code
				someLittleBee = (LittleBee)object;
				System.out.println(someLittleBee.collectedPollen);
			} else if (object instanceof Bicycle){ //lots of boilerplate code
				someBicycle = (Bicycle)object;
				System.out.println(someBicycle.gear);
			}
		}
		//----------------
		//with Generics
		//----------------
		Vector<Bicycle> genericDynArray = new Vector<Bicycle>();
		Bicycle bike2 = new Bicycle();
		bike2.gear=23;
		genericDynArray.add(bike);
		genericDynArray.add(bike2);
		for(Bicycle theBike: genericDynArray){ //much less boilerplate code
			System.out.println(theBike.gear);
		}
	}
}
