package homeWork_3.animals;

import homeWork_3.WrongFoodException;
import homeWork_3.food.Food;
import homeWork_3.food.Meat;
import homeWork_3.food.SizeOfAviary;

public class Herbivore extends Animal {
    @Override
    public String eat(Food food) throws WrongFoodException {
        // Проверяем будет ли есть эту еду данное животное
        if (food instanceof Meat)
            throw new WrongFoodException(getNameOfAnimal() + " not eat this " + food.getName() + "!");

        // Добавляем энергии животному при подходящей еде
        super.setEnergy(food.getSatiety());

        return getNameOfAnimal() + " eat " + food.getName() + "!";
    }

    @Override
    public String getNameOfAnimal() {
        return null;
    }

    @Override
    public SizeOfAviary getSizeOfAviary() {
        return null;
    }

    @Override
    public void fly() {
    }

    @Override
    public void run() {
    }

    @Override
    public void swim() {
    }

    @Override
    public String voice() {
        return null;
    }
}
