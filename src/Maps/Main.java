package src.Maps;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise #1");

        Stock setFruits = new Stock();
        setFruits.addFruit("orange", 12, 1);
        setFruits.addFruit("banana", 25, 2);
        setFruits.addFruit("lemon", 8, 3);
        setFruits.addFruit("pineapple", 13, 4);
        setFruits.addFruit("grape", 9, 5);

        setFruits.printFruitsList();
        setFruits.addFruit("plume", 15, 3);
        setFruits.printFruitsList();

        //________________________________________
        System.out.println("Exercise #2");
        Registry productList = new Registry();
        productList.create();

        //_________________________________________
        System.out.println("Exercise #3");
        PersonRegistry addressBook = new PersonRegistry();
        addressBook.addOrUpdateContact("Tom", "tom@mail.com");
        addressBook.addOrUpdateContact("Lisa", "lisa@mail.com");
        addressBook.addOrUpdateContact("Alice", "alisa@mail.com");
        addressBook.addOrUpdateContact("Denis", "den@mail.com");

        addressBook.createContactList();
        addressBook.addOrUpdateContact("Tom", "tomasdev@glob.net");
        addressBook.createContactList();
    }
}




