package Lesson7_Abstract_Class;

public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int index = 0;

    public void add(Animal a) {
        if (index < animals.length) {
            animals[index] = a;
            System.out.println("Added animal at " + index);
            index++;
        }
    }

    public void makeAllNoise(){
        for (int i = 0; i < index; i++) {
            animals[i].makeNoise(); // đa hình
        }
    }
}
