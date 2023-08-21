package ch4_control_statements_logical_operators;
// Counter-controlled iteration with the while iteration statement.
public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // declare and initialize control variable

        while (counter <= 10){
            System.out.printf("%d ", counter);
            ++counter;
        }
    }
}
