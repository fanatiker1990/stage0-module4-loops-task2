package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            int innerCount = counter;
            int c = 1;
            while (innerCount > 0) {
                c *= innerCount;
                innerCount--;
            }
            System.out.println(c);
            counter++;

        }
    }
}
