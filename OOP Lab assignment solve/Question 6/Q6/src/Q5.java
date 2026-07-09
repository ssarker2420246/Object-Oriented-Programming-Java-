import java.io.*;

class InvalidPriceException extends Exception{
    InvalidPriceException(String text){
        super(text);
    }
}

class UnitSoldMinBoundException extends Exception{
    UnitSoldMinBoundException(String text){
        super(text);
    }
}

class UnitSoldMaxBoundException extends Exception{
    UnitSoldMaxBoundException(String text){
        super(text);
    }
}


public class Q5 {
    public static void main(String[] args) {

        double Profit = 0;
        String maximumProfitItem = "";
        double maximumProfit = Double.MIN_VALUE;

        try (
                BufferedWriter w = new BufferedWriter(new FileWriter("Profit.txt"));
                BufferedReader r = new BufferedReader(new FileReader("AnnualSell.txt"))
        ){

            w.write("Item\tProfit\n");

            String line;

            line = r.readLine();

            while ((line = r.readLine()) != null){
                line = line.trim();
                String[] parts = line.split("\\s+");

                if (parts.length < 4){
                    continue;
                }

                try {
                    int n = parts.length;

                    int TotalUnitSold = Integer.parseInt(parts[n-1]);
                    double UnitSellingPrice = Double.parseDouble(parts[n-2]);
                    double UnitCost = Double.parseDouble(parts[n-3]);
                    StringBuilder item = new StringBuilder();

                    for (int i = 0; i < n-3; i++){
                        item.append(parts[i]).append(" ");
                    }

                    if (UnitCost < 0 || UnitSellingPrice < 0){
                        System.out.println("Exception occurred by: " + item);
                        throw new InvalidPriceException("Price can not be less than 0");
                    }
                    if (TotalUnitSold < 0){
                        System.out.println("Exception occurred by: " + item);
                        throw  new UnitSoldMinBoundException("Total unit sold can not be less then 0");
                    }
                    if (TotalUnitSold > 1000){
                        System.out.println("Exception occurred by: " + item);
                        throw new UnitSoldMaxBoundException("Total unit sold can not be more than 1000");

                    }

                    double profit = (UnitSellingPrice - UnitCost) * TotalUnitSold;
                    Profit += profit;

                    if (profit > maximumProfit){
                        maximumProfit = profit;
                        maximumProfitItem = item.toString();
                    }

                    w.write(item + "\t" + profit + "\n");

                }catch (InvalidPriceException | UnitSoldMinBoundException | UnitSoldMaxBoundException e){

                    System.out.println("Exception: " + e);
                }

            }

            w.write("Total Profit: " + Profit);
            w.newLine();
            w.write("Maximum Profit Item: " + maximumProfitItem);

            System.out.println();
            System.out.println("Profit file has been written..!");

        }catch (IOException e){
            System.out.println("ERROR!");
        }

    }
}
