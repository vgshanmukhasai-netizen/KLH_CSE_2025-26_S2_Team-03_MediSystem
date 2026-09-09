import java.io.*;
import java.util.*;

public class CorpusLoader {

    public static List<Patient> loadCorpus() {

        List<Patient> patients = new ArrayList<>();

        try {

            File folder = new File("corpus_txt");

            File[] files = folder.listFiles();

            if(files == null)
                return patients;

            for(File file : files) {

                Scanner sc = new Scanner(file);

                String id = "";
                String name = "";
                int age = 0;
                String disease = "";
                String symptoms = "";
                String severity = "";

                while(sc.hasNextLine()) {

                    String line = sc.nextLine();

                    if(line.startsWith("Patient_ID:"))
                        id = line.split(":")[1];

                    else if(line.startsWith("Name:"))
                        name = line.split(":")[1];

                    else if(line.startsWith("Age:"))
                        age = Integer.parseInt(line.split(":")[1]);

                    else if(line.startsWith("Disease:"))
                        disease = line.split(":")[1];

                    else if(line.startsWith("Symptoms:"))
                        symptoms = line.split(":")[1];

                    else if(line.startsWith("Severity:"))
                        severity = line.split(":")[1];
                }

                patients.add(
                        new Patient(
                                id,
                                name,
                                age,
                                disease,
                                symptoms,
                                severity
                        )
                );

                sc.close();
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return patients;
    }
}