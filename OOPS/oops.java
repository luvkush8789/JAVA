package OOPS;

public class oops {
public static  void main(String[] args){
//    For Pen Properties
    Pen p1= new Pen(); /* Created a pen object called p1 */
    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    System.out.println(".............................................");

//    For Student Properties
    Student s1 = new Student();
    s1.setName("luvkush");
    System.out.println(s1.name);
    s1.setAge(20);
    System.out.println(s1.age);
    s1.setRollno(229037);
    System.out.println(s1.rollno);
    s1.calPercentage(44,55,60);
    System.out.println(s1.percentage);

    System.out.println(".............................................");

//    Bank Account
    bankAccount myAcc= new bankAccount();
    myAcc.setUserName("Suman singh");
    System.out.println(myAcc.getUserName());
    myAcc.setPassword("helloworld");
    System.out.println(myAcc.getPassword());

    System.out.println(".............................................");



}
}

class Pen{
//    properties && Function
//    properties
    String color;
    int tip;

//    Function

void setColor(String newColor){
    color = newColor;

}

void  setTip(int newTip){
    tip=newTip;
}
}

class Student {
    String name;
    int age;
    int rollno;
    float percentage;

    void setName(String newName){
        name = newName;
    }
    void  setAge(int newAge){
        age = newAge;
    }
    void setRollno(int newRollno){
        rollno = newRollno;
    }

    void calPercentage(int phys, int chem, int maths){
        percentage = (phys + chem + maths) / 3;
    }
}

class bankAccount{
    private String userName;
    private String password;

    String getUserName(){
        return  this.userName;
    }

    String getPassword(){
        return this.password;
    }
    void  setUserName(String newUserName){
        userName = newUserName;
    }

    void setPassword(String newpwd){
        password = newpwd;
    }
}
