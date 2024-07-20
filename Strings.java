import java.util.*;

public class Strings {
    public static  void printLetters(String str){
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public  static  void main(String[] args){
//        Inout / Output
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a name : ");
//        String name;
////      name = sc.next(); /* this print only the single word  before the space */
//        name = sc.nextLine();    /* this print the whole line of string */
//        System.out.println(name);

//        Concataination

//        System.out.print("Enter your first name : ");
//        String firstName = sc.nextLine();
//        System.out.print("Enter your last name : ");
//        String lastName = sc.nextLine();
//        System.out.print("your name is : ");
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

//     Strings CharAt Method

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        printLetters(fullName);


    }
}
