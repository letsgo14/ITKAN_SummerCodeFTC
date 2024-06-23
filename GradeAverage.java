class GradeAverage.java{

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for threee subjects (out of a hundred):");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();
        
        if (mark1 > 90){
            System.out.println("mark1 = A");
        }
        else if(mark1 > 80){
            System.out.println("mark1 = B");
        }
        else if(mark1 > 70){
            System.out.println("mark1 = C");
        }
        else {
            System.out.println("mark1 = Fail!!");
        }
         if (mark2 > 90){
            System.out.println("mark2 = A");
        }
        else if(mark2 > 80){
            System.out.println("mark2 = B");
        }
        else if(mark2 > 70){
            System.out.println("mark2 = C");
        }
        else {
            System.out.println("mark2 = Fail!!");
        }
         if (mark3 > 90){
            System.out.println("mark3 = A");
        }
        else if(mark3 > 80){
            System.out.println("mark3 = B");
        }
        else if(mark3 > 70){
            System.out.println("mark3 = C");
        }
        else {
            System.out.println("mark3 = Fail!!");
        }
        
        double average= (mark1+mark2+mark3)/3;
        
        if (average > 90){
            System.out.println("Average = A");
        }
        else if(average > 80){
            System.out.println("Average = B");
        }
        else if(average > 70){
            System.out.println("Average = C");
        }
        else {
            System.out.println("Average = Fail!!");
        }
    }
}
}
