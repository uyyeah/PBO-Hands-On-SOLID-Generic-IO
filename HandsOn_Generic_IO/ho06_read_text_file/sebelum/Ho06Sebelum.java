import java.io.*;

public class Ho06Sebelum {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("employees.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}