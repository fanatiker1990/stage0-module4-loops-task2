package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive == 0) {
        } else if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                int miltiResult = multiplyByAndToInclusive * counter;
                System.out.println(miltiResult);
                counter++;
            }
        } else {
            while (counter <= -multiplyByAndToInclusive) {
                int miltiResult = multiplyByAndToInclusive * counter;
                System.out.println(miltiResult);
                counter++;
            }
        }
    }
}
