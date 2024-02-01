package Tester;
import java.util.Random;
import java.util.Scanner;

public class Tester{
public static void main(String[] args) {
	       while(true){
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the length of the Password");
	       int l=sc.nextInt();
	      System.out.print("The Random Generated Password is ");
	      System.out.println(generatePassword(l));
	      System.out.println("Enter 1 to continue or 0 to End");
	      int n=sc.nextInt();
	      if(n!=1){
	          System.out.println("The Process Terminated");
	          break;
	      }
	       }
	   }

	   private static char[] generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
}
