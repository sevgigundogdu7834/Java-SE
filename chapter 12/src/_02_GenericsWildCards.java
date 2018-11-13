import java.util.ArrayList;
import java.util.List;

public class _02_GenericsWildCards {

        public static void main(String[] args) {
            List<Animal> animalList = new ArrayList<Animal>();

            addElementGenericRule(animalList);

            //
            List<Dog> dogList = new ArrayList<Dog>();
            List<Cat> catList = new ArrayList<Cat>();
            //
            addElementWildCard(dogList);
            addElementWildCard(catList);
            addElementWildCard(animalList);
            //

            List<Kangal> kangalList = new ArrayList<Kangal>();
            List<Object> objectList = new ArrayList <Object>();

            addElementWildCardSuper(dogList);
            //addElementWildCardSuper(catList); //compiler error
            addElementWildCardSuper(animalList);
            //addElementWildCardSuper(kangalList); //
            addElementWildCardSuper(objectList);

            //
            //dogList.add(new Animal()); // Animal IS-A Dog degildir! Dog IS-A Animal
            dogList.add(new Dog());
            dogList.add(new Kangal()); // Kangal IS-A Dog onermesi dogrudur.
        }

        public static void addElementGenericRule( List<Animal> animals ){

        }

        public static void addElementWildCard(List<? extends SuperAnimal> animals){
            // ? wildcardi ile extends kullanildiginda burada elaman EKLEMEYE IZIN VERMEZ!
            //animals.add(new Cat()); // e
            //animals.add(new Dog()); //
            animals.add(null);
        }

        // ? super Dog -> Dog ya da superi olmasi gerekli!
        public static void addElementWildCardSuper( List < ? super Dog> dogs){
            dogs.add(new Kangal());
            dogs.add(new Dog());
            //dogs.add(new Animal());
        }
    }

    interface SuperAnimal {}

    class Animal implements SuperAnimal{

    }

    class Dog extends Animal {

    }

    class Kangal extends Dog {

    }

    class Cat extends Animal {}