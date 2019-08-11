/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

/**
 *
 * @author AviralJanveja
 */
import java.util.Scanner;
public class LinearSearch {

    public static int Linear_Search(int x, int y[]){
        for(int i=0; i<y.length; i++){
            if (y[i] == x)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number that you want to search : ");
        int num = input.nextInt();
        int result = Linear_Search(num, arr);
        
        if (result == -1)
            System.out.println("Not Found!");
        else 
            System.out.println("Found at " + result);
        
        
    }
    
}
