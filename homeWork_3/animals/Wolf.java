package homeWork_3.animals;

import homeWork_3.food.SizeOfAviary;

public class Wolf extends Carnivorous {
    private final String name = "Wolf";
    private final SizeOfAviary sizeOfAviary = SizeOfAviary.SMALL;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    @Override
    public void run() {
        System.out.println("Wolf running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String voice() {
        return "Khrrrr!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}
