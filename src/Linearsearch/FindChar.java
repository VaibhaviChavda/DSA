/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linearsearch;

public class FindChar {
    static String searchChr(String arr,char target){
        if(arr.length()==0){
                return "not found";
            }
        for(int i=0;i<arr.length();i++){
            if(target==arr.charAt(i)){
                return "charcter found";
            }
        }
        return "not found";
    }
    public static void main(String[] args) {
        
        String name = "vaibhavi";
       String ans = searchChr(name, 'i');
        System.out.println("your cahr is : "+ans);
        
    }
}
