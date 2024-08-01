package OOPS;

public class Deep {
    public  static void  main(String[] args){
        DeepCopy s1 = new DeepCopy();

        DeepCopy s2 = new DeepCopy();
        s2.x=6;
        System.out.println("the value is : " + s1.x);
    }
}

class DeepCopy {
    int x = 30;

}
