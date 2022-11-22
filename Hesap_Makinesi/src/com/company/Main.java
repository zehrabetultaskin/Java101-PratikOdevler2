package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args){
        //Girilen sayı değerlerine göre işlem yapan program
        int num1, num2, option;
        Scanner input=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        num1=input.nextInt();
        System.out.println("İkinci saıyyı giriniz: ");
        num2=input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi giriniz: ");
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        option=input.nextInt();
        switch (option){
            case 1:
                System.out.println("Toplama"+(num1+num2));break;
            case 2:
                System.out.println("Çıkarma: "+(num1-num2));break;
            case 3:
                System.out.println("Çarpma: "+(num1*num2));break;
            case 4:
                System.out.println("Bölme: "+(num1/num2));break;
            default:
                System.out.println("Hatalı İşlem Yaptınız!!!");
        }
    }
}
