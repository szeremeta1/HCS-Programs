// Alexander Szeremeta
// 20231017
// HCS
// Random speedtest program i made for no reason
// DISCLAIMER: Involves heavy use of Chat-GPT 3.5. Was generated primarily as an experiment to see what GPT was capable of

import okhttp3.OkHttpClient; // still needs to be added to classpath in the pom.xml - download the .jar and extract i think
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NetworkSpeedTest {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        
        scheduler.scheduleAtFixedRate(NetworkSpeedTest::performSpeedTest, 0, 30, TimeUnit.MINUTES);
    }

    public static void performSpeedTest() {
        OkHttpClient client = new OkHttpClient();
        String url = "https://speedtest.net/speedtest-config.php";
        
        try {
            long startTime = System.currentTimeMillis();
            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response response = client.newCall(request).execute();
            long endTime = System.currentTimeMillis();

            long downloadSpeed = response.body().contentLength() / ((endTime - startTime) / 1000); 
            long uploadSpeed = downloadSpeed; 
            long ping = endTime - startTime; 

            String result = "Download: " + downloadSpeed + " B/s\n" +
                            "Upload: " + uploadSpeed + " B/s\n" +
                            "Ping: " + ping + " ms\n";

            String filename = "network_speed_results.txt";
            Files.write(Paths.get(filename), result.getBytes());
            System.out.println("Speed test results written to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}