package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        List arraylist=new ArrayList();
        for(int i=0; i<=5; i++) {
            System.out.println("Sayı giriniz: ");
            int num = input.nextInt();
            arraylist.add(num);
        }
        Collections.sort(arraylist, Collections.reverseOrder());

        for(Object array: arraylist){
            System.out.println(array);
        }
    }
}
