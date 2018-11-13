package _02.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples2 {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		
		addElement(animalList);
		
		List<Dog> dogList = new ArrayList<Dog>();
		
		//addElement(dogList); // compiler error , legal degildir.
		
		Dog[] dogs = new Dog[3];
		addElementArray(dogs); // Cat IS-A Dog degil bu nedenle runtime da exceptiona neden olur.
		
		//
		List<Object> objectList = new ArrayList<Object>();
		//addElementObject(dogList);// compiler error
		addElementObject(objectList);
		
		addElementObject2(dogList);
		addElementObject2(objectList);
	}
	
	public static void addElement(List<Animal> animaList){
		animaList.add(new Dog());
		animaList.add(new Cat());
		animaList.add(new Animal());
	}
	
	public static void addElementArray(Animal[] animals){
		animals[0]= new Cat();
	}
	
	// Buraya sadece List<Object>
	public static void addElementObject(List <Object> object) {
		
	}
	
	// ? extends Object -> ? ayni anlama gelir. 
	public static void addElementObject2(List <? extends Object> object) {
		
	}
}


class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {}