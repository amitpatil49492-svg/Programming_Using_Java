package Control_Structures.Assignments.Assignment_3;

/*Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, 

consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.

 */

public class Tester {
    public static void main(String[]args){
        int num_1=7;
        int num_2=2;
        int num_3=9;

        if(num_1==7){
            System.out.println("As num_1 is equals to 7 consider only num_2 and num_3 for product: ");
            System.out.println("Product is: "+(num_2*num_3));
        }
        else if(num_2==7){
            System.out.println("If num_2=7 then only num_3 is the product: ");
            System.out.println("Product is num_3");
        }
        else if(num_3==7){
            System.out.println("As num_3 = 7 then: ");
            System.out.println("Product is: -1");
        }
        else{
            System.out.println("No 7 in all num's: ");
            System.out.println("Product is: "+(num_1*num_2*num_3));
        }
    }
    
}
