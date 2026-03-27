/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment2;
import java.util.*;
/**
 *
 * @author Vaibhavi
 */
public class CheckNoOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even number"); 
       }
        else{
            System.out.println(num + " is odd number");
        }
    }
}
