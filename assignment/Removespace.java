package assignment;

public class Removespace {

 public static void main(String args[]) {
 String str = " SEA college of Science commerce and arts ";
 str = str.replaceAll("\\s", "");
System.out.println(str);
 }
}