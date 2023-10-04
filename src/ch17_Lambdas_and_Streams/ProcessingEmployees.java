package ch17_Lambdas_and_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Çalışan (Employee) nesnelerini işleyen ve çeşitli işlemler gerçekleştiren bir örnek sunan sınıf.
 */
public class ProcessingEmployees {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};


        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        //  List<Employee> list1 = List.of(
        //          new Employee("Jason", "Red", 5000, "IT"),
        //          new Employee("Ashley", "Green", 7600, "IT"),
        //          new Employee("Matthew", "Indigo", 3587.5, "Sales"),
        //          new Employee("James", "Indigo", 4700.77, "Marketing"),
        //          new Employee("Luke", "Indigo", 6200, "IT"),
        //          new Employee("Jason", "Blue", 3200, "Sales"),
        //          new Employee("Wendy", "Brown", 4236.4, "Marketing"));

        //Immutable list oluşturuldu.
        // Nedir bu immutable
        //Immutable" kelimesi, bir nesnenin oluşturulduktan sonra durumunun değiştirilemez olduğu anlamına gelir. Yani bir nesne
        // bir kez oluşturulduğunda, içindeki veriler veya durum artık değiştirilemez. Değişmez nesneler, birçok programlama
        // dilinde kullanılır ve çeşitli avantajlara sahiptir.

        /*
        * Değişmez nesnelerin bazı temel özellikleri şunlardır:

Durum Değiştirilemez: Bir kez oluşturulduktan sonra, bir değişmez nesnenin içindeki veriler veya durum değiştirilemez. Yani nesnenin özellikleri sabit kalır.

Thread-Safe: Değişmez nesneler, çoklu iş parçacığı (thread) ortamlarında güvenli bir şekilde kullanılabilir, çünkü durumlarının değiştirilme riski yoktur.

Güvenilir ve Öngörülebilir: Değişmez nesneler, kodun daha güvenilir ve öngörülebilir olmasını sağlar. Bir nesnenin durumu herhangi bir zamanda değiştirilemediği için, beklenmeyen yan etkilerden kaçınılır.

Paylaşılabilir: Bir değişmez nesne, farklı kod parçacıkları veya bileşenler arasında güvenle paylaşılabilir, çünkü içeriği değiştirilemez.

Hızlı ve Verimli: Değişmez nesneler, kodun performansını artırabilir. Özellikle fonksiyonel programlama yaklaşımlarında ve belirli algoritmalar için hızlıdır.

Örnek olarak, Java'da String sınıfı değişmezdir. Bir kez bir String nesnesi oluşturulduğunda, içeriği değiştirilemez.
*
* değiştirmek için yeni bir string nesnesi instancesi referansı oluşturulmalı yada StringBuilder Sınıfı ile yazılan stringe append metotu ile string yazılıt ve
* yeni stringe atanır
        * */

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);

        // Predicate that returns true for salaries in the range $4000-$6000
        Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary

        System.out.printf(
                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());
        //Sorting Employees By Multiple Fields

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);
// sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream().sorted(lastThenFirst).forEach(System.out::println);

        // sort employees in descending order by last name, then first name
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        IntPredicate even = value -> value % 2 == 0;
        IntPredicate greaterThan5 = value -> value > 5;
        even.and(greaterThan5);


        // Mapping Employees to Unique-Last-Name Strings
        // display unique employee last names sorted
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // display only first and last names
        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        // Grouping Employees By Department
        // group Employees by department
        System.out.printf("%nEmployees by department:%n");

        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));


        groupedByDepartment.forEach(
                (department, employeesInDepartment) -> { //BiConsumer
                    System.out.printf("%n%s%n", department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf(" %s%n", employee));
                }
        );

        // count number of Employees in each department
        System.out.printf("%nCount of Employees by department:%n");
        Map<String, Long> employeeCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.counting()));

        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s)%n", department, count));

        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2)
        );

        // average of Employee salaries with DoubleStream average method
        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());
    }
}

/*
 * Optional<T> döndüren bir akış işlemi için, sonucu bu türden bir değişkende saklayın, ardından Optional'ın
 * get yöntemini çağırmadan önce bir sonuç olduğunu doğrulamak için nesnenin isPresent
 * yöntemini kullanın. Bu, NoSuchElementExceptions'ı engeller.
 * <p>
 * Java'da Optional, Java 8 ve sonraki sürümlerde tanıtılan bir sınıftır ve genellikle "null" değerlerin işlenmesi ve kontrol edilmesi için kullanılır. Optional sınıfı, bir değerin mevcut olup olmadığını belirlemek için kullanılır ve "NullPointerException" hatasını önlemeye yardımcı olur.
 * <p>
 * Optional sınıfının temel işlevleri şunlardır:
 * <p>
 * Bir değerin mevcut olup olmadığını kontrol etme: Optional ile bir değerin mevcut olup olmadığını isPresent() yöntemi ile kontrol edebilirsiniz. Değer mevcutsa true, aksi takdirde false döner.
 * <p>
 * Değerin değerini alın: get() yöntemi, Optional içindeki değeri alır. Ancak bu yöntemi kullanmadan önce isPresent() ile kontrol etmelisiniz, aksi takdirde bir "NoSuchElementException" hatası alabilirsiniz.
 * <p>
 * Null kontrolü: Optional sınıfı, bir değeri sarmalar, bu nedenle değer null ise null olarak işaretlenir ve bu durumu daha iyi yönetmenizi sağlar.
 * <p>
 * Varsayılan değer: orElse() yöntemi, değer mevcut değilse bir varsayılan değeri sağlar. Bu, null değerlerle çalışırken yararlıdır.
 * <p>
 * Değer eşleştirme: filter() yöntemi, bir Predicate ile bir Optional değeri filtreler. Bu, belirli bir koşulu karşılayan değerleri elde etmek için kullanışlıdır.
 * <p>
 * Daha karmaşık işlemler: map(), flatMap(), ifPresent(), ifPresentOrElse() gibi yöntemlerle daha karmaşık işlemler gerçekleştirebilirsiniz.
 */

