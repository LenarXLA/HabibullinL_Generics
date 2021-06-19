package homeWork_3;

import homeWork_3.animals.Animal;
import homeWork_3.food.SizeOfAviary;

import java.util.HashMap;
import java.util.Map;

public class Aviary <T extends Animal> {
    private SizeOfAviary sizeAviary;

    public Aviary(SizeOfAviary sizeAviary) {
        this.sizeAviary = sizeAviary;
    }

    private Map<String, T> animalInAviary = new HashMap<>();

    public void addAnimal(T t) {
        switch (t.getSizeOfAviary()) {
            case ULTRA_SMALL:
                switch (sizeAviary) {
                    case ULTRA_SMALL:
                        System.out.printf("The %s fit here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case SMALL:
                        System.out.printf("The %s comfort fit here%n", t.getSizeOfAviary());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case MEDIUM:
                        System.out.printf("The %s will be able running here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case LARGE:
                        System.out.printf("The %s like large space%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                }
                break;
            case SMALL:
                switch (sizeAviary) {
                    case ULTRA_SMALL:
                        System.out.printf("The %s dont fit here!%n", t.getNameOfAnimal());
                        break;
                    case SMALL:
                        System.out.printf("The %s comfort fit here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case MEDIUM:
                        System.out.printf("The %s will be able running here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case LARGE:
                        System.out.printf("The %s like large space%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                }
                break;
            case MEDIUM:
                switch (sizeAviary) {
                    case ULTRA_SMALL:
                        System.out.printf("The %s dont fit here never!%n", t.getNameOfAnimal());
                        break;
                    case SMALL:
                        System.out.printf("The %s dont fit here!%n", t.getNameOfAnimal());
                        break;
                    case MEDIUM:
                        System.out.printf("The %s comfort fit here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                    case LARGE:
                        System.out.printf("The %s like large space%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                }
                break;
            case LARGE:
                switch (sizeAviary) {
                    case ULTRA_SMALL:
                        System.out.printf("The %s dont fit here never-never!!%n", t.getNameOfAnimal());
                        break;
                    case SMALL:
                        System.out.printf("The %s dont fit here never!%n", t.getNameOfAnimal());
                        break;
                    case MEDIUM:
                        System.out.printf("The %s dont fit here!%n", t.getNameOfAnimal());
                        break;
                    case LARGE:
                        System.out.printf("The %s comfort fit here%n", t.getNameOfAnimal());
                        animalInAviary.put(t.getNameOfAnimal(), t);
                        break;
                }
                break;
        }
    }

    public void deleteAnimal(String key) {
        animalInAviary.remove(key);
    }

    public T getAnimal(String key) {
        return animalInAviary.get(key);
    }

    public void printAviary() {
        for (Map.Entry entry : animalInAviary.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
