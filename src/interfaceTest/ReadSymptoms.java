package interfaceTest;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ReadSymptoms implements IRole{

    private String pathFile;

    public ReadSymptoms(String pathFile){
            this.pathFile = pathFile;
    }

    @Override
    public Map<String, Integer> GetSymptoms() {
        Map<String, Integer> treatment = new Map<String, Integer>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Integer get(Object key) {
                return null;
            }

            @Override
            public Integer put(String key, Integer value) {
                return null;
            }

            @Override
            public Integer remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<Integer> values() {
                return null;
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }
        };

        treatment.put("file1:"+pathFile, 1);
        treatment.put("file2:"+pathFile, 2);
        treatment.put("file3:"+pathFile, 3);

        System.out.println(treatment);

        treatment.forEach((symptom, counter) -> {
            System.out.println(symptom + " " + counter);
        });

        return treatment;
    }
}
