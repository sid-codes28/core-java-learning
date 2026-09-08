package basics;

public class Arithmetic {
    public static void main(String[] args){
        int num1 = 10 , num2 = 4;
        System.out.printf(
                        "Sum        : %d%n" +
                        "Difference : %d%n" +
                        "Product    : %d%n" +
                        "Division   : %d%n" +
                        "Remainder  : %d%n",
                num1 + num2 , num1 - num2 , num1 * num2 , num1 / num2 , num1 % num2
        );
    }
}
