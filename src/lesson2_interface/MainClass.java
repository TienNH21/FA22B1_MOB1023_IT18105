package lesson2_interface;

public class MainClass {
    public static void main(String[] args) {
        ServiceNongTrai serv = new ServiceNongTrai();
        Cat c = new Cat();
        c.an();
        c.diChuyen();
        c.tiengKeu();

        Dog d = new Dog();
        serv.insert(c);

        System.out.println(serv.tongAnimal);
        serv.insert(d);

        System.out.println(serv.tongAnimal);

        serv = new ServiceNongTrai();
        System.out.println(serv.tongAnimal);
    }
}
