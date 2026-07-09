import java.io.*;

public class Q4 {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\YourName\\Desktop\\id.txt";

        try (BufferedWriter ODD = new BufferedWriter(new FileWriter("odd.txt"));
             BufferedWriter EVEN = new BufferedWriter(new FileWriter("even.txt"));
             BufferedReader RR = new BufferedReader(new FileReader(filePath))){

            String line;
            while ((line = RR.readLine()) != null){

                int id = Integer.parseInt(line);

                if (id%2 == 0){
                    EVEN.write(line + '\n');
                }
                else {
                    ODD.write(line + '\n');
                }
            }

        }catch (IOException e){
            System.out.println("ERROR!->" + e );
        }

    }
}
