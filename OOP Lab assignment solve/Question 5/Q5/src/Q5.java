import java.io.*;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner SCAN= new Scanner(System.in);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("E.txt"))){
            System.out.println("Please Enter 5 strings:");

            for (int i = 0 ; i < 5 ; i++){

                String contents = SCAN.nextLine();
                contents = contents.trim();
                writer.write(contents);
                writer.newLine();
            }

        }catch (IOException r){
            System.out.println("ERROR");
        }

        String[] content = new String[5];

        try(BufferedReader BF = new BufferedReader(new FileReader("E.txt"))){

            int i = 0;
            
            while (i<5){
                content[i++] = BF.readLine();
            }

        }catch (IOException e){
            System.out.println("ERROR");
        }

        String FULLString = content[0] + " " + content[1] + " "  + content[2] + " "  + content[3] + " "  + content[4];
        FULLString = FULLString.trim();


        try(BufferedWriter BMW = new BufferedWriter(new FileWriter("f.txt"))){
            BMW.write(FULLString);
            System.out.println("The FILE has been written successfully!");
        }
        catch (IOException e){
            System.out.println("ERROR");
        }

    }
}
