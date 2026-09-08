package basics;

public class Variables {
    public static void main(String[] args){
        String name = "Siddharth";
        int age = 20 , height = 177;
        double percentage = 85.5;
        char grade = 'A';
        boolean isStudent = true;

        System.out.printf(
                "Name       : %s%n" +
                "Age        : %d%n" +
                "Height     : %dcm%n" +
                "Percentage : %.1f%n" +
                "Grade      : %c%n" +
                "Student    : %b",name,age,height,percentage,grade,isStudent);
    }
}
