import java.io.*;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner SCAN = new Scanner(System.in);

        System.out.print("Enter the total Employee Numbers: ");

        int Employee = SCAN.nextInt();
        SCAN.nextLine();

        try(BufferedWriter BFF = new BufferedWriter(new FileWriter("Employee.txt"))){

            int Score;

            for (int i = 0; i < Employee; i++) {

                int totalScore = 0;
                double average = 0.00;

                if (i == 0) {
                    System.out.print("Enter the name of the Employee " + (i + 1) + ": ");
                    BFF.write("Employee" + (i + 1) + " " + SCAN.nextLine());
                } else {
                    System.out.print("Enter the name of the Employee " + (i + 1) + ": ");
                    BFF.write("\nEmployee" + (i + 1) + " " + SCAN.nextLine());
                }


                System.out.print("Enter the ID of the Employee " + (i + 1) + ": ");
                BFF.write("\nEmployee" + (i + 1) + " " + SCAN.nextLine());
                for (int j = 0; j < 6; j++) {
                    System.out.print("Enter the " + (j + 1) + " Score of the Employee " + (i + 1) + ": ");
                    Score = SCAN.nextInt();
                    totalScore += Score;

                }
                SCAN.nextLine();
                average = totalScore / 6.0;

                BFF.write("\nEmployee" + (i + 1) + " " + average);

            }

        }

        catch (IOException e) {
            System.out.println("ERROR!");
        }

        String[] Name = new String[Employee];
        String[] ID = new String[Employee];
        double[] Score = new double[Employee];

        try (BufferedReader reader = new BufferedReader(new FileReader("Employee.txt"))) {

            String contents;
            int i = 0;

            while ((contents = reader.readLine()) != null) {

                contents = contents.trim();
                String[] infoName = contents.split(" ");
                Name[i] = infoName[1];

                contents = reader.readLine();
                contents = contents.trim();
                String[] infoID = contents.split(" ");
                ID[i] = infoID[1];

                contents = reader.readLine();
                contents = contents.trim();
                String[] infoScore = contents.split(" ");
                Score[i] = Double.parseDouble(infoScore[1]);

                i++;

            }

        }

        catch (IOException e) {
            System.out.println("ERROR!");
        }


        try (BufferedWriter bff = new BufferedWriter (new FileWriter("increment.txt"))) {

            for (int i = 0; i < Employee; i++) {
                if (Score[i] > 75) {
                    bff.write(Name[i] + "\n");
                }
            }

        }

        catch (IOException e) {
            System.out.println("ERROR!");

        }

    }

}

