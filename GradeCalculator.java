/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akanye
 */
import java.util.Scanner;

public class GradeCalculator {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to the Grade Calculator!");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Hello, " + name + "!");
        
        System.out.print("Enter Programming mark: ");
        double programming = input.nextDouble();
        
        System.out.print("Enter Business mark: ");
        double business = input.nextDouble();
        
        System.out.print("Enter Logic mark: ");
        double logic = input.nextDouble();
        
        double average = (programming + business + logic)/3;
        
        System.out.println("Your average is: " + average);
        
        if (average >= 50) {
            System.out.println("Congratulations! You PASSED.");
        } else {
            System.out.println("Unfortunately, you FAILED.");
        }
    }
    
}
