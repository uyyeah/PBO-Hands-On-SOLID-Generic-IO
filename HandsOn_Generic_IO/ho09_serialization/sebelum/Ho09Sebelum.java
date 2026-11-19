import java.io.*;

public class Ho09Sebelum {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        try {
            FileWriter fw = new FileWriter("employee.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + "," + age);
            bw.close();
            System.out.println("Data saved to text file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
            String line = br.readLine();
            String[] data = line.split(",");
            System.out.println("Name: " + data[0] + ", Age: " + data[1]);
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}