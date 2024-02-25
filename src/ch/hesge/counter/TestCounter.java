package ch.hesge.counter;

public class TestCounter {

    public static void main(String[] args) {

        TestCounter testCounter = new TestCounter();
        testCounter.testInitCounter();
        testCounter.testAddValueCounter();

        testCounter.testInitUpperLimitedPositiveCounter();

    }

    private void testInitCounter() {
        Counter counter = new Counter(10);
        if (10 != counter.getValue()) {
            System.err.println("Bug : Bad initial value");
        } else {
            System.out.println("Good initial value");
        }
    }

    private void testAddValueCounter() {
        Counter counter = new Counter(10);
        try {
            counter.add(10);
            System.out.printf("new counter value : %s", counter.getValue());
        } catch (CounterException e) {
            System.err.printf("CounterException %s", e.getMessage());
        }
    }

    private void testInitUpperLimitedPositiveCounter() {
        try {
            UpperLimitedPositiveCounter upperLimitedPositiveCounter = new UpperLimitedPositiveCounter(2,100);
            if (2 != upperLimitedPositiveCounter.getValue()) {
                System.err.println("Bug : Bad initial value");
            }
            if (100 != upperLimitedPositiveCounter.getMaxValue()) {
                System.err.println("Bug : Bad max value");
            }
        } catch (CounterException e) {
            System.err.printf("CounterException %s", e.getMessage());
        }
    }


}
