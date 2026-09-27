package Control_Structures.Assignments.Assignment_4;

import java.util.Scanner;

public class Tester {
    public static void main(String[]args){

        int costPerPlate=0;
        int distanceInKm=0;
        int quantityOrdered=0;
        int deliveryCharge=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of food: ");
        String foodType = sc.next();
        System.out.println();

        if(foodType.equals("N")){
            costPerPlate=15;
        }
        else if(foodType.equals("V")){
            costPerPlate=12;
        }

        System.out.println();
        System.out.print("Enter the distance: ");
        distanceInKm = sc.nextInt();
        if(distanceInKm>0 && distanceInKm<=3){
            deliveryCharge=0;
        }
        else if(distanceInKm>3 && distanceInKm<=6){
            deliveryCharge=(distanceInKm-3);
        }
        else if(distanceInKm>6){
            deliveryCharge=(distanceInKm-6)*2 + 3;
        }

        System.out.println();
        System.out.print("Enter quantity: ");
        quantityOrdered = sc.nextInt();

        if((!foodType.equals("N") && !foodType.equals("V")) || distanceInKm <0 || quantityOrdered < 0 ){
            System.out.println("Invalid input");
            System.out.println("Final bill amount is: -1");
        }
        else{
            System.out.println("Order Details: ");
            System.out.println("***************");
            System.out.println("You Have Ordered food type: "+foodType);
            System.out.println("Distance in km: "+distanceInKm);
            System.out.println("Quantity: "+quantityOrdered);
            System.out.println("Final bill amount is: "+((costPerPlate*quantityOrdered)+deliveryCharge));
        }

        sc.close();


    }
    
}
