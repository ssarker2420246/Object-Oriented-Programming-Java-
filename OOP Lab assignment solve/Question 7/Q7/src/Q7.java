import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

    static ArrayList<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {

        Scanner SCAN = new Scanner(System.in);
        int GRADE;

        while (true){

            System.out.print("Enter a student's grade: ");
            GRADE = SCAN.nextInt();


            if (GRADE == -1){
                break;
            } else if (GRADE >-1 && GRADE <=100) {
                addGrade(GRADE);
            }else {
                System.out.println("Please Enter valid grade!!");
            }

        }

        System.out.println();
        System.out.printf("Average grade: %.2f\n", calculateAverage());
        System.out.println("Highest grade: " + HighestGrade());
        System.out.println("Passing students: ");
        listPassingStudents();

    }

    static void addGrade(int grade){
        grades.add(grade);
    }

    static double calculateAverage(){
        int Sum = 0;
        for(int grade : grades){
            Sum += grade;
        }
        return (double) Sum /grades.size();
    }

    static  int HighestGrade(){
        int maximum = 0;
        for (int Grade : grades){
            if (Grade > maximum){
                maximum = Grade;
            }
        }
        return maximum;
    }
    
    static void listPassingStudents(){
        for (int grade : grades){
            if (grade>= 50){
                System.out.println(grade);
            }
        }
    }
}
