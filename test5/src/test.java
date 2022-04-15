import java.io.*;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            BufferedReader inputFile = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"));
            String input = inputFile.readLine();
            String output;
            while (input != null){
               String temp = input.replace("stream","media-files");
             String newTemp = temp.replace("/v/","/");
                System.out.println(newTemp);
              //  output = newTemp;
               // outputFile.write(output +"\n");
               input = inputFile.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
