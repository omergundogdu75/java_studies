package ch17_Lambdas_and_Streams;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .map((int x) -> {
                    return x * 2;
                }) // IntUnaryOperator
                .sum();

        IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0) // IntPredicate
                .map(x -> x * 3)
                .sum();
    }
}

/*
* Functional Interface hakkında bilmemiz gerekenler;
Java8 ile gelmiş bir interface yapısıdır.
Functional interface’ler, functional programming temelini oluşturmaktadır.
Kesin ve en net kuralı, Functional Interface’de en az ve en çok 1 tane abstract class bulunmalıdır.
* Eğer sub interface’imiz super interface’i extends ediyorsa ve super interface’de abstract method varsa sub interface’de abstract method olamaz.
Aksi takdirde interface’imiz Functional Interface olamaz.
Functional Interface’de java.lang.Object sınıfında yer alan bir method eklenirse bu sayılmaz ve Functional Interface özelliğini korur.
Lambda ifadeleri ile birlikte kullanılmaktadır.
Basit olarak Functional Interface tanımı;

package functional.interfaces;

@FunctionalInterface
interface Interfae{
    public void abstractMethod();
    // 1 tane abstract method olmali.
    // 1 den az veya cok olursa compiler hatasi verir.
    // ve @FunctionalInterface anotasyonunu kaldirmamiz gerekir.
}

public class FunctionalInterfaceTest01 {
}
*
*
*------
* package functional.interfaces;

@FunctionalInterface
interface Animal{
    public void eat(Dog dog);
}

@FunctionalInterface
interface SubInterface extends Animal{
    // icerisinde abstract method olmadigi halde Functional Interface'dir.
    // Cunku super interface'de abstract method bulunmaktadir.
    // Eger SubInterface'de de bir abstract method tanimlarsak, compiler hatasi verir.
}
class Dog{

}
public class FunctionalInterfaceTest02 {
}
* ---------------------predicate---------------------------
* java.util.function.Predicate Java'da bir işlevsel arayüz (functional interface) olarak kullanılır ve
* genellikle koleksiyonların filtrelenmesi veya belirli koşulları kontrol etmek için kullanılır.
* Predicate, genellikle bir şartı değerlendirip sonucunu true veya false olarak döndüren bir test işlevi olarak düşünülebilir.

Predicate, genellikle Java 8 ve sonrasında geliştirilen lambda ifadeleri ve Stream API ile birlikte kullanılır.
*  Bir Predicate nesnesi, bir koleksiyonun elemanlarını filtrelemek veya belirli bir koşula uyan elemanları seçmek için kullanılabilir.
*
* import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-2);
        numbers.add(10);
        numbers.add(3);
        numbers.add(-8);

        // Predicate ile pozitif sayıları filtreleme
        Predicate<Integer> pozitifMi = num -> num > 0;

        List<Integer> pozitifSayilar = filterList(numbers, pozitifMi);

        System.out.println("Pozitif Sayılar: " + pozitifSayilar);
    }

    // Predicate'i kullanarak bir liste filtreleme
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> sonuc = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                sonuc.add(item);
            }
        }
        return sonuc;
    }
}

* */
