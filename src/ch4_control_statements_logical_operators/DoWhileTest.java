package ch4_control_statements_logical_operators;
// do...while iteration statement.
public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%d ",counter);
            ++counter;
        }while (counter <= 10);
        System.out.println();
    }
}
