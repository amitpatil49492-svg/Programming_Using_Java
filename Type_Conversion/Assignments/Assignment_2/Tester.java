package Type_Conversion.Assignments.Assignment_2;

//Program to convert temperature from Fahrenheit to Celsius degree

public class Tester {
    public static void main(String[]args){
        double fahr=50;

        double cel=((fahr-32)/9)*5;

        System.out.println("Temperature in Fahrenheit: "+fahr);
        System.out.println("Temperature in Celsius: "+cel);
    }
    
}
