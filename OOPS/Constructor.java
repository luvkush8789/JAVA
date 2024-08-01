package OOPS;

public class Constructor {
    public  static  void main(String[] args){
        Anime s1 = new Anime();
        s1.name = "luvkush";
        s1.roll = 123;
        s1.password = "abc";
//        s1.marks[0]= 100;
//        s1.marks[1]=90;
//        s1.marks[2] = 80;
          s1.marks = 100;


        Anime s2 = new Anime(s1);
        s1.password = "xyz";
        System.out.println("the new password is : " + s1.password);
        s1.marks = 90;
        System.out.println(s1.marks);
//        for(int i=0; i<3;i++){
//            System.out.println(s2.marks[i]);
//        }




    }
}

class Anime {
    String name;
    int roll;
    String password;
    int marks;

//    Copy constructor
    Anime (Anime s1){
//        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;



    }

//non parameterized constructor
    Anime() {
//        marks = new int[3];
        System.out.println("the constructor is called");
    }

    Anime (String name){
        this.name = name;
//        marks = new int[3];
    }

    Anime (int roll){
        this.roll = roll;
//        marks = new int[3];
    }
}


