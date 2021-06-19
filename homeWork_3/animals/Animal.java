package homeWork_3.animals;

import homeWork_3.WrongFoodException;
import homeWork_3.food.Food;
import homeWork_3.food.SizeOfAviary;

public abstract class Animal implements Fly, Run, Swim, Voice {
    private int energy;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public abstract String eat(Food food) throws WrongFoodException;
    public abstract String getNameOfAnimal();
    public abstract SizeOfAviary getSizeOfAviary();

    @Override
    public int hashCode() {
        // идею кода взял с habr
        final int prime = 31;
        int result = 1;
        result = prime * result + energy;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Animal etc = (Animal) obj;
        if (energy != etc.energy)
            return false;
        return true;
    }
}
