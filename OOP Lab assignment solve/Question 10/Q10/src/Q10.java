import java.io.*;

public class Q10 {

    public static void main(String[] args) {

        try (BufferedReader s = new BufferedReader(new FileReader("student.txt"));
             BufferedReader R = new BufferedReader(new FileReader("result.txt"));
             BufferedWriter W = new BufferedWriter(new FileWriter("merged.txt"))){

            String LineS, LineR;

            while ((LineS = s.readLine()) != null &&
                    (LineR = R.readLine()) != null){

                LineS = LineS.trim();
                LineR = LineR.trim();

                String[] Sinfo = LineS.split(" ");
                String[] Rinfo = LineR.split(" ");

                W.write(Sinfo[0] + " " + Sinfo[1] + " " + Rinfo[1]);
                W.newLine();
            }

        }catch(FileNotFoundException e){
            System.out.println("FILE DOES NOT EXIST! ");
        }catch (IOException D){
            System.out.println("ERROR! -> " + D);
        }
    }
}

