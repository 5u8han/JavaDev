import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello");

        try {
            BufferedReader read = new BufferedReader(new FileReader("input.txt"));
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
