package interfaceTest;

import java.util.Map;

public class MainTreatment {
    private String role = "guest";
    private String inputFile;
    public Map<String, Integer> results;

    public MainTreatment(String pathFile) {
        this.inputFile = pathFile;
        results = new ReadSymptoms(inputFile).GetSymptoms();
    }

    public String GetRole() {
        return role;
    }
}
