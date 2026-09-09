package basics;

public class Variables {
    public static void main(String[] args){
        String name = "Siddharth";
        int age = 19 , height = 177;
        char grade = 'A';
        boolean isStudent = true;

        System.out.printf(
                "Name    : %s%n" +
                "Age     : %d%n" +
                "Height  : %d%n" +
                "Grade   : %c%n" +
                "Student : %b%n"
                        ,name,age,height,grade,isStudent);


    }
}
