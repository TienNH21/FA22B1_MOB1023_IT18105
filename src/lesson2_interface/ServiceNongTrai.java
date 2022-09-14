package lesson2_interface;

import java.util.ArrayList;

public class ServiceNongTrai {
    private ArrayList<Animal> listAnimal = new ArrayList<>();
    public static int tongAnimal = 0;
    
    public void insert(Animal animal)
    {
        tongAnimal++;
        this.listAnimal.add(animal);
    }
    
    public void update(int viTri, Animal animal)
    {
        this.listAnimal.set(viTri, animal);
    }
    
    public void delete(int viTri)
    {
        this.listAnimal.remove(viTri);
    }

    public ArrayList<Animal> getListAnimal() {
        return listAnimal;
    }

    public void setListAnimal(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }
}
