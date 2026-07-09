import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3 {

    public static void main (String[] args) {

        String filePath = "C:\\Users\\YourName\\Desktop\\PERSON.txt";

        String ID = findMaximumAge(filePath);

        if (ID == null){
            System.out.println("ERROR Occurred!");
        }
        else {
            System.out.println(ID);
        }

    }

    public static String findMaximumAge (String filePath)

    {
        BufferedReader BR = null;
        int maximumAge = 0;
        String maximumAgeID = null;

        try {

            String LINES;
            BR = new BufferedReader(new FileReader(filePath));

            while ((LINES = BR.readLine()) != null){

                LINES = LINES.trim();

                String[] info = LINES.split("/");



                String ID = info[0].trim();
                int AGE = Integer.parseInt(info[1].trim());

                if (AGE >maximumAge){
                    maximumAge = AGE;
                    maximumAgeID = ID;
                }
            }

        }catch (IOException i)
        {
            System.out.println("ERROR CODE: " + i);
        }

        finally {

            try {
                if (BR != null){
                    BR.close();
                }
            }catch (IOException f){
                System.out.println("ERROR CODE: " + f);
            }
        }

        return maximumAgeID;
    }
}
