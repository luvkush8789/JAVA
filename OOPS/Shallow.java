package OOPS;

public class Shallow {
    public  static void main(String[] args){
        ShallowCopy s1 = new ShallowCopy();

        ShallowCopy s2 = s1;
        s2.x=6;
        System.out.println("The value is  : " + s1.x);


    }
}

class ShallowCopy{
    int x = 30;
}