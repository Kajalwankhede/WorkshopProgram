package com.hotelmanagemet;

import javafx.print.Collation;
import java.util.*;

public class HotelManagementMain {
    public static void main(String[] args) {
        System.out.printf("Welcome to Hotel management system");
        Collection<HotelManagement> hotel= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n1.Add Rooms:");
            System.out.println("2.Display Record:");
            System.out.println("Enter Your Choice: ");
            ch=sc.nextInt();

            switch (ch){
                case 1:
                System.out.println("Enter the type of Ac:");
                String typeAc=sc1.nextLine();
                System.out.println("Enter the type of Non Ac:");
                String typeOfNonAc=sc1.nextLine();
                System.out.println("Enter the Price");
                int price=sc.nextInt();
                System.out.println("Enter the Number of beds:");
                int bed=sc.nextInt();
                System.out.println("Enter the city: ");
                String city=sc1.nextLine();
                hotel.add(new HotelManagement(typeAc,typeOfNonAc,price,bed,city));
                break;

                case 2:
                    System.out.println("-----------------------------------");
                    Iterator<HotelManagement> i= hotel.iterator();
                    while (i.hasNext()){
                        HotelManagement h=i.next();
                        System.out.println(h);
                    }
                    System.out.println("----------------------------------------");
                    break;
            }

        }while(ch!=0);
    }
}
