package Linearsearch;

public class LinearSearch {
   
    //for search index of given element
    static int serachIndex(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(target==element){
                return i;
            }
        }
        return -1;
    }
    //for search index and also element
     static int serachIndexnElement(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(target==element){
                System.out.println("index is :" + i);
                return element;
                
            }
        }
        return -1;
    }
     //retrurn if found elese false
     static  boolean serachIndexB(int[] arr,int target){
        if(arr.length ==0){
            return false;
        }
        for(int i =0;i<arr.length;i++){
            int element = arr[i];
            if(target==element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,456,21,78};
        int ans = serachIndex(arr, 78);
        System.out.println("your element find at index : "+ans);
        
        int ans1  =serachIndexnElement(arr, 21);
        System.out.println("your element is: " + ans1);
        
        boolean ans2 = serachIndexB(arr, 291);
        System.out.println("your element present in array: " +ans2 );
    }
}
