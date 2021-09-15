package nl.inholland.fundamentals;

public class App {

    public static void main(String[] args) {
        String placeholder = "I like Java";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            placeholder += "I like Java";
        }
        long end = System.currentTimeMillis();
        System.out.println("Adding to the string took  " + (end - start) + " ms");

        long start2 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(placeholder);
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("I like Java");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("This took about " + (end2 - start2) + " ms");

        long start3 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(placeholder);
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("I like Java");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("This took about " + (end3 - start3) + " ms");    }
}
