package homeWork_3.animals;

import homeWork_3.food.SizeOfAviary;

public class Lion extends Carnivorous {
    private final String name = "Lion";
    private final SizeOfAviary sizeOfAviary = SizeOfAviary.MEDIUM;

    public SizeOfAviary getSizeOfAviary() {
        return sizeOfAviary;
    }

    @Override
    public void run() {
        System.out.println("Lion running!");
        super.setEnergy(getEnergy() - 1);
    }

    @Override
    public String voice() {
        return "Rrrrraaaaaa!";
    }

    @Override
    public String getNameOfAnimal() {
        return name;
    }
}
