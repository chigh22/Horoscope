
import java.util.Scanner;
public class demoSwamiHigh
{
   public static void main (String[]args)
   {
   String repeat;
      //object1-passing in values
   
      Scanner keyboard = new Scanner (System.in);
      
      System.out.println("Enter your name");
      String n = keyboard.nextLine();
      
      System.out.println("Enter your birthday month");
      int m = keyboard.nextInt();
      
      System.out.println("Enter your day of birth");
      int d = keyboard.nextInt();
      
      SwamiHigh object1 = new SwamiHigh(n,m,d);
      System.out.println(object1.getName());
      System.out.println(object1.getMonth());
      System.out.println(object1.getDay());
      System.out.println(object1.getSign());
      System.out.println(object1.calcHoroscope());
     
      

      //object2
      SwamiHigh object2 = new SwamiHigh();
      
      System.out.println("Enter your name");
      keyboard.nextLine();
      n = keyboard.nextLine();
      object2.setName(n);
      System.out.println("Enter your birthday month");
      m = keyboard.nextInt();
      object2.setMonth(m);
      System.out.println("Enter your day of birth");
      d = keyboard.nextInt();
      object2.setDay(d);

      System.out.println("Name:"+ " " + object2.getName() + "\nBirth Month: " + object2.getMonth() + " " + "\nDay of Birth: " + object2.getDay());
      
      //change birthday
      object2.changeBirthday();
      System.out.println("\nName:"+ " " + object2.getName() + "\nBirth Month: " + object2.getMonth() + " " + "\nDay of Birth " + object2.getDay());
 
         
        
  }
}
