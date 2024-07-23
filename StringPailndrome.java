import java.util.*;

public class StringPailndrome {
    public static boolean ispalindrome(String str) {
    for (int i = 0; i<str.length();i++){
        int n= str.length();
        if (str.charAt(i) != str.charAt(n-1-i)){
//            Not a palindrome
            return false;
        }
    }
    return true;

    }

//    Shortest Path

    public  static  float shortestPath(String path){
        int x=0 ,y=0;

        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);
//            south
            if (dir == 'S'){
                y--;
            }
//            North
            else if (dir == 'N') {
                y++;
            }
//            West 
            else if (dir == 'W') {
                x--;
            }
//            East
            else{
                x++;
            }

        }

        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

//    SubString
    public  static String substring(String str, int si , int ei){
        String substr = "";
        for (int i=si; i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

//    String toUpeerCase
    public static  String touppercase(String str){
        StringBuilder sb = new StringBuilder("");

        Character ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i=1;i<str.length();i++){
            if (str.charAt(i)== ' ' && i<str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return  sb.toString();
    }

//    String Compression

    public static  String compress(String str){
        String newStr = "";
        for (int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;

            }
            newStr+=str.charAt(i);
            if (count>1){
                newStr+=count.toString();
            }
        }
        return  newStr;
    }

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String str = "racecar";
//        System.out.println(ispalindrome(str));



//        Shortest Path

//        String path = "NSEWNNSSEEWWNESE";
//        System.out.println(shortestPath(path));

//        Strings function compare

//        String s1 = "tony";
//        String s2 = "tony";
//        String s3 = new String("tony");
////        equals function is the function to compare the strings
//        if (s1.equals(s3)){
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }

//        SubString

//        String str = "HelloWorld";
//        System.out.println(str.substring(1,5)); /* inbuilt function of substring */
//        System.out.println(substring(str, 0,5));

//        Largest String
//        String fruits[] = {"mango", "apple", "banana", "litchi", "papaya"};
//        String largest = fruits[0];
//
//        for (int i=1;i< fruits.length;i++){
//            if (largest.compareTo(fruits[i]) <0){
//                largest = fruits[i];
//            }
//        }
//        System.out.println(largest);

//        String Builder

//        StringBuilder sb = new StringBuilder("");
//
//        for (char ch = 'a' ; ch<='z';ch++){
//            sb.append(ch);
//        }
//
//        System.out.println(sb);

//        String upperCase

//        String str = "hi i am luvkush kumar";
//        System.out.println(touppercase(str));

//        String compression

        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        System.out.println(compress(str));


    }
}
