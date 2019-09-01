
package com.company;


        import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal(3);
        Animal animal2 = new Animal(3);
        System.out.println(animal1.equals(animal2));
    }
}
class Animal{
    private int  id;
    public  Animal(int id){
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal otheanimal = (Animal) obj;
        return this.id == otheanimal.id;
    }
}
