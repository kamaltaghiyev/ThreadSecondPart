public class ThreadGenerator implements Runnable {
    static int count = 0;
    String line;
    int linesWordCount;
    public ThreadGenerator(String line) {
        this.line = line;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (line.trim().isEmpty()) {

                continue;
            }

            String[] words = line.split("\\s+");
            linesWordCount = words.length;
            System.out.println(Thread.currentThread().getName() + " output " + linesWordCount);
            count +=linesWordCount;
            System.out.println(count);


        }
    }

}
