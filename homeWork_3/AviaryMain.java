package homeWork_3;

import homeWork_3.animals.*;
import homeWork_3.food.Flower;
import homeWork_3.food.SizeOfAviary;

public class AviaryMain {
    public static void main(String[] args) throws WrongFoodException {
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(SizeOfAviary.LARGE);
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(SizeOfAviary.ULTRA_SMALL);

        herbivoreAviary.addAnimal(new Hipopotam());

        carnivorousAviary.addAnimal(new Lion());
        carnivorousAviary.addAnimal(new Wolf());
        carnivorousAviary.addAnimal(new Crocodile());

        System.out.println("___________________________________________");

        carnivorousAviary.printAviary();

        System.out.println("___________________________________________");

        //  удалим животное из вольера
        carnivorousAviary.deleteAnimal("Lion");
        System.out.println("After deleting:");
        carnivorousAviary.printAviary();

        System.out.println("___________________________________________");

        // получим ссылку на животное в вольере по его кличке и распечатаем имя
        System.out.println(carnivorousAviary.getAnimal("Wolf").getNameOfAnimal());

        // исключение если еда не подходит животному
        System.out.println(new Crocodile().eat(new Flower()));

    }
}
