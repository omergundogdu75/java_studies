package ch4_control_statements_logical_operators;
// break statement exiting a for statement.
public class BreakTest {
    public static void main(String[] args) {
        int count;// control variable also used after loop terminates
        for ( count = 0; count <=10; count++) {// loop 10 times
            if (count == 5) break; //terminates loop if count is 5
            System.out.printf("%d ",count);
        }
        System.out.printf("%nBroke out loop at count = %d%n",count);
    }
}
