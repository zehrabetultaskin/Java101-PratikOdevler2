package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        int heat=input.nextInt();
        if(heat <5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(heat >5 && heat<15){
            System.out.println("Sinamaya gidebilirsiniz");
        }
        else if(heat>15 && heat <25 ){
            System.out.println("Pikniğe gidebilirsiniz");
        }
        else if(heat>25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
