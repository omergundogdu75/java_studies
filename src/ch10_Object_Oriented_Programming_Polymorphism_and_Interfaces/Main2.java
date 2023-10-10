package ch10_Object_Oriented_Programming_Polymorphism_and_Interfaces;

import java.io.*;
/*
* Serializable: Bu arayüz, bir sınıfın nesnelerinin serileştirilip (disk gibi bir depolama ortamına yazılma)
* veya deserileştirilip (okunma) kullanılabilmesini sağlar. Özellikle verilerin diskte saklanması veya ağ
* üzerinden iletilmesi gerektiğinde kullanılır.
* */
class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Bir Person nesnesini dosyaya yazma (serileştirme)
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            Person person = new Person("Alice", 30);
            outputStream.writeObject(person);
            System.out.println("Person nesnesi serileştirildi.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Bir Person nesnesini dosyadan okuma (deserileştirme)
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person loadedPerson = (Person) inputStream.readObject();
            System.out.println("Deserileştirilen Person nesnesi: " + loadedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
