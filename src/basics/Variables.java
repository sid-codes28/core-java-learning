package basics;

public class Variables {
    public static void main(String[] args){
        String name = "Siddharth";
        int age = 20;
        double percentage = 85.5;
        char grade = 'A';

        System.out.printf(
                "Name       : %s%n" +
                "Age        : %d%n" +
                "Percentage : %.1f%n" +
                "Grade      : %c%n",name,age,percentage,grade);
    }
}
