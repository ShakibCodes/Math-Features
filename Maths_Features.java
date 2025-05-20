import java.math.BigInteger;
import java.util.Scanner;

public class Maths_Features {
// arithmatic starts
    static void arithmatic(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("\nChoose one: ");
        int choose_arithmatic = input.nextInt();
        

        if (choose_arithmatic==1) {
            Adiition();

            }
        else if (choose_arithmatic==2) {
            Subtraction();
        }
        else if (choose_arithmatic==3) {
            Multiplication();
        }
        else if (choose_arithmatic==4) {
            Division();
        }
        else if (choose_arithmatic>4) {
            System.out.println("\nChoose between (1-4)");
        }
        input.close();
    }

    
// Addition
    static void Adiition(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nAddition of: ");
        System.out.println("\n1. two numbers");
        System.out.println("2. Three numbers");
        System.out.println("3. four numbers");
        System.out.print("\nChoose one: ");
        int choose_addition = input.nextInt();

        if (choose_addition==1) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            int total = first+second;
            System.out.println("\nThe total is "+total);
        }
        else if (choose_addition==2) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            System.out.print("\nEnter third number: ");
            int third = input.nextInt();

            int total = first+second+third;
            System.out.print("\nThe total is "+total);
        }
        else if (choose_addition==3) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            System.out.print("\nEnter third number: ");
            int third = input.nextInt();
            
            System.out.print("\nEnter Fourth number: ");
            int fourth = input.nextInt();

            int total = first+second+third+fourth;
            System.out.print("\nThe total is "+total);
        }
        else if (choose_addition>3) {
            System.out.println("\n choose between (1-3)");
        }
        input.close();
    }

    // Subtraction
    static void Subtraction(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nSubtraction of: ");
        System.out.println("\n1. two numbers");
        System.out.println("2. Three numbers");
        System.out.println("3. four numbers");
        System.out.print("\nChoose one: ");
        int choose_subtraction = input.nextInt();

        if (choose_subtraction==1) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            int total = first-second;
            System.out.println("\nThe total is "+total);
        }
        else if (choose_subtraction==2) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            System.out.print("\nEnter third number: ");
            int third = input.nextInt();

            int total = first-second-third;
            System.out.print("\nThe total is "+total);
        }
        else if (choose_subtraction==3) {
            System.out.print("\nEnter first number: ");
            int first = input.nextInt();

            System.out.print("\nEnter second number: ");
            int second = input.nextInt();

            System.out.print("\nEnter third number: ");
            int third = input.nextInt();
            
            System.out.print("\nEnter Fourth number: ");
            int fourth = input.nextInt();

            int total = first-second-third-fourth;
            System.out.print("\nThe total is "+total);
        }
        else if (choose_subtraction>3) {
            System.out.println("\n choose between (1-3)");
        }
        input.close();
    }

// Multiplication
    static void Multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int first = input.nextInt();

        System.out.print("\nEnter second number: ");
        int second = input.nextInt();

        int total = first*second;
        System.out.println("\nThe total is "+total);
        input.close();

    }
// Division
    static void Division(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter first number: ");
        int first = input.nextInt();

        System.out.print("\nEnter second number: ");
        int second = input.nextInt();

        if (second==0) {
            System.out.println("\ncannot divide beacuse of "+second);
        }
        else{
        int total = first/second;
        System.out.println("\nThe total is "+total);
        
        }
        input.close();
    }


    // arithmatic ends

    //Multiplication starts
    static void multi(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the base number: ");
        int bnumber = input.nextInt();

        System.out.print("\nEnter the starting multiplier: ");
        int start = input.nextInt();

        System.out.print("\nEnter the limitting number: ");
        int limit = input.nextInt();

        if (start>limit) {
            System.out.println("\nThe starting multiplier '"+start+"' cannot be greater than limitting number '"+limit+"'");
        }
        else{
            while(start<=limit){
                System.out.println(bnumber+" x "+start+" = "+start*bnumber);
                start++;
            }
        }
        input.close();
    }
    // Multiplication ends


    // area starts
    static void areas(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nArea of: ");
        System.out.println("\n1. Circle ");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        System.out.print("\nChoose one: ");
        int choose_area = input.nextInt();

        if (choose_area==1) {
            System.out.print("\nEnter the radius of the circle: ");
            double rad = input.nextDouble();

            double area = 3.1416*rad*rad;
            System.out.println("\nThe area is "+area);
        }
        else if (choose_area==2) {
            System.out.print("\nEnter the base of the triangle: ");
            double base_t = input.nextDouble();

            System.out.print("\nEnter the height of the triangle: ");
            double height_t = input.nextDouble();

            double area = 0.5*base_t*height_t;
            System.out.println("\nThe area is "+area);
        }
        else if (choose_area==3) {
            System.out.print("\nEnter the side of the square: ");
            double side = input.nextDouble();

            double area = side*side;
            System.out.print("\nThe area is "+area);

        }
        else if (choose_area==4) {
            System.out.print("\nEnter the length of the rectangle: ");
            double length = input.nextDouble();

            System.out.print("\nEnter the width of the rectangle: ");
            double width = input.nextDouble();

            double area = length*width;
            System.out.println("\nThe area is "+area);
        }
        else if (choose_area>4) {
            System.out.println("\nChoose between (1-4)");
        }
        input.close();
    }
    //area ends

    // facxtorials starts
     public static BigInteger factorial(BigInteger k){

      if (k.equals(BigInteger.ZERO)) {
        return BigInteger.ONE;
      }
      else{
        return k.multiply(factorial(k.subtract(BigInteger.ONE)));
      }
     }

     // factorial ends



      public static void main(String[] args){
          Scanner input = new Scanner(System.in);
       
          
          System.out.println("\n===== Main Menu =====");
          System.out.println("1. Basic arithmatic operations");
          System.out.println("2. Multiplication table");
          System.out.println("3. Areas");
          System.out.println("4. Factorials");
          System.out.print("\nChoose one (1-4): ");
          int choose = input.nextInt();

          if (choose==1) {
              arithmatic();
          }
          else if (choose==2) {
              multi();
          }
          else if (choose==3) {
              areas();
          }
          else if (choose==4) {
            System.out.print("\nEnter a number to find factorial: ");
            int num = input.nextInt();
            
            if (num<0) {
              System.out.print("\nfactorial is not defined for negative number.");
            }
            else{
              BigInteger result = factorial(BigInteger.valueOf(num));
              System.out.print("\n"+num+"! = "+result);
            }
          }
          else if(choose>4){
            System.out.println("\nchoose between (1-4)");
        }
      
          input.close();
      }
}
  