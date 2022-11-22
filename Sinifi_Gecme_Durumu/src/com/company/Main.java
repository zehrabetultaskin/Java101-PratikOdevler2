package com.company;
import java.util.*;

public class Main {
   public static int noteMath, noteChemistry, noteTurkish, noteMusic, notePhysics, average;
    public static void control(int x) {
        if (x < 0 && x > 100) {
            x = 0;
        }
    }
      public static void main(String[] args) {
	// Girilen not bilgilerine göre geçeme kalma durumunu belirleyen program
        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        noteMath=input.nextInt();
          control(noteMath);
        System.out.println("Kimya notunuzu giriniz: ");
        noteChemistry=input.nextInt();
          control(noteChemistry);
        System.out.println("Fizik notunuzu giriniz: ");
        notePhysics=input.nextInt();
          control(notePhysics);
        System.out.println("Türkçe notunuzu giriniz: ");
        noteTurkish=input.nextInt();
          control(noteTurkish);
        System.out.println("Müzik notunuzu giriniz: ");
        noteMusic=input.nextInt();
          control(noteMusic);
        average=(noteChemistry+noteMath+noteMusic+notePhysics+noteTurkish)/5;
        System.out.println("Ortalama: "+average);
        if(average<55){
            System.out.println("Kaldı");
        }
        else if (average>=55){
            System.out.println("Geçti");
        }
    }
}
