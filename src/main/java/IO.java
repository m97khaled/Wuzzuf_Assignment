import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class IO {
    public static void main(String[] args) throws IOException {
        List<JobDetails> jobs = readBooksFromCSV("Wuzzuf_Jobs.csv");
        for (JobDetails j : jobs) {
            System.out.println(j);
        }
    }

    private static List<JobDetails> readBooksFromCSV(String fileName) {
        List<JobDetails> jobs = new ArrayList<>();
        Path pathToFile = Paths.get("Wuzzuf_Jobs.csv");

        try (BufferedReader br = Files.newBufferedReader(Paths.get("Wuzzuf_Jobs.csv"))) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                JobDetails job = createJob(attributes);
                jobs.add(job);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return jobs;
    }

    private static JobDetails createJob(String @NotNull [] metadata) {
        String title = metadata[0];
        String company = metadata[1];
        String location = metadata[2];
        String type = metadata[3];
        String level = metadata[4];
        String yearsExp = metadata[5];
        String country = metadata[6];
        ArrayList<String> skills = new ArrayList<>();
        return new JobDetails(title, company, location, type, level, yearsExp, country);
    }
}
