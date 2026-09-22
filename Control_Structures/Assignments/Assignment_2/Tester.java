package Control_Structures.Assignments.Assignment_2;

/*Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a 

*/

public class Tester {
    public static void main(String[]args){
        int a=1;
        int b=4;
        int c=4;

        int discr=(b*b)-4*a*c;

        int root1=(-b + discr)/2*a;

        int root2=(-b - discr)/2*a;


        if(discr==0){
            System.out.println("discr==0, then values of both the roots will be same, means root1==root2: "+root1);
        }
        else if(discr>0){
            System.out.println("discr>0 then the roots will be unequal real roots!!!");
            System.out.println("First root: "+root1);
            System.out.println("root2: "+root2);
        }
        else if(discr<0){
            System.out.println("discr<0 then there will be np real roots: ");
            System.out.println("The equation has no real roots!!!");

        }
    }
    
}
