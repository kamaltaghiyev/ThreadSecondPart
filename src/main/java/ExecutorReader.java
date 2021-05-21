import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorReader {

    public static void main(String[] args) throws IOException, InterruptedException {
        final int maxNumber = 10;

        ExecutorService executorService = Executors.newFixedThreadPool(maxNumber);
        BufferedReader bf = new BufferedReader(new FileReader("sample.txt"));
        String line ;

        while ((line = bf.readLine())!=null){
            ThreadGenerator threadGenerated = new ThreadGenerator(line);

            executorService.submit(threadGenerated);


        }

        executorService.shutdown();


    }
}
