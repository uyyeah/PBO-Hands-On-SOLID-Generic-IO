import java.io.*;
import java.util.*;

class EmployeeLatihan implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    EmployeeLatihan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Ho09Latihan {
    public static void serialize(String fileName, Object obj) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
            System.out.println("Saved to " + fileName);
        } catch (IOException ex) {
            System.out.println("Serialize error: " + ex.getMessage());
        }
    }

    public static Object deserialize(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Deserialize error: " + ex.getMessage());
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        EmployeeLatihan e1 = new EmployeeLatihan("Alice", 25);
        EmployeeLatihan e2 = new EmployeeLatihan("Bob", 32);
        List<EmployeeLatihan> team = List.of(e1, e2, new EmployeeLatihan("Charlie", 28));

        serialize("emp1.ser", e1);
        serialize("emp2.ser", e2);
        serialize("team.ser", new ArrayList<>(team));

        System.out.println("Restored e1 -> " + deserialize("emp1.ser"));
        System.out.println("Restored e2 -> " + deserialize("emp2.ser"));
        List<EmployeeLatihan> restoredTeam = (List<EmployeeLatihan>) deserialize("team.ser");
        System.out.println("Restored team -> " + restoredTeam);
    }
}