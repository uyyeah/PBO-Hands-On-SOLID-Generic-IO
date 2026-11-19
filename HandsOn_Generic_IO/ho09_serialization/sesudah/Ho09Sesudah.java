import java.io.*;

class EmployeeSesudah implements Serializable {
    String name;
    int age;
    EmployeeSesudah(String n, int a) {
        name = n;
        age = a;
    }
}

public class Ho09Sesudah {
    public static void main(String[] args) {
        EmployeeSesudah e = new EmployeeSesudah("John", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"))) {
            oos.writeObject(e);
            System.out.println("Serialized successfully.");
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"))) {
            EmployeeSesudah restored = (EmployeeSesudah) ois.readObject();
            System.out.println("Deserialized: " + restored.name + ", " + restored.age);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}