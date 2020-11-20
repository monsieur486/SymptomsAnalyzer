package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WriteFile {

    public static void writeFile() throws IOException {

        FileWriter writer = new FileWriter ("result.out");

        Set set = Main.symptomsSorted.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry symptom = (Map.Entry)iterator.next();
            String key = (String) symptom.getKey();
            Integer value = (Integer) symptom.getValue();
            writer.write(key + ": " + value + "\n");
        }

        writer.close();
        System.out.println("[info] Result.out file created.");

    }

}
