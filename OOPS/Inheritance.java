package OOPS;

public class Inheritance {
    public  static void main(String[] args){
//        Fish shark = new Fish();
//        shark.eat();
//        shark.breathe();
//        shark.color = "black";
//        System.out.println(shark.color);

//        Multilevel inheritance

//        dog d1 = new dog();
//        d1.name="labror";
//        System.out.println(d1.name);
//        d1.eat();
//        d1.breathe();
//        d1.legs= 4;
//        System.out.println(d1.legs);

//        Hybrid Inheritance

        fish f1 = new fish();
        f1.name();
        f1.name = "tuna";
        System.out.println(f1.name);
        f1.fins = 2;
        System.out.println(f1.fins);




    }
}
//  Base Class
//class Animal{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//
//    void breathe(){
//        System.out.println("breaths");
//    }
//}
//
//// Derived Class
//
//class Fish extends Animal{
//    int fins;
//    void swim(){
//        System.out.println("Swims in water");
//    }
//}

// MultiLevel Inheritance

//class Animal{
//    String color;
//    void eat(){
//        System.out.println("eats");
//    }
//
//    void breathe(){
//        System.out.println("breaths");
//    }
//}
//
//class dog extends Animal{
//    String name;
//    int legs;
//
//}
//
//class  bus extends dog{
//    String brands;
//    int wheels;
//}

// Hybrid Inheritance

class animal{
    void name (){
        System.out.println("There are many types of animal");
    }
}

class fish extends animal{
    String name;
    int fins;
}

class bird extends animal{
    void peacock(){
        System.out.println(" bird name is Peacock ");
    }
}

class mamal extends animal{
    int legs;
    void dog(){
        System.out.println("pet name is dog");
    }

    void cat(){
        System.out.println("pet name is cat");
    }

    void human(){
        System.out.println("pet name is dog");
    }

}

