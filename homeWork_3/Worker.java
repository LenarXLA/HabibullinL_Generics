package homeWork_3;


import homeWork_3.animals.Animal;
import homeWork_3.food.Food;

public class Worker {
    public void feed(Animal animal, Food food) throws WrongFoodException {
        System.out.println(animal.eat(food));
    }

    public void getVoice(Animal animal) {
        if (animal.voice() == null) {
            new Exception().printStackTrace();
            System.exit(1);
        }
        System.out.println(animal.getNameOfAnimal() + " says: " + animal.voice());
    }
}
