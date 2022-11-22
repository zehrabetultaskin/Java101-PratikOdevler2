package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    String userName, password;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName=input.next();
        System.out.print("Şifrenizi giriniz: ");
        password=input.next();
        if(userName=="patika" && password=="1234patika"){
            System.out.println("Giriş Yaptınız");
        }
        else {
            System.out.println("Hatalı bilgi!!!");
        }
        System.out.println("Şifrenizi sıfırlamak ister misiniz(E/H): ");
        String option= input.next();
        if(option=="E"){
            System.out.println("Yeni şifrenizi giriniz: ");
            String newPassword=input.next();
            if(newPassword==password){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
            else{
                System.out.println("Şifre oluşturuldu.");
            }
        }
        else if(option=="H") {
            System.exit(0);
        }

    }
}
