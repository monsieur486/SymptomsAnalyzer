package com.hemebiotech.analytics.core;

import java.io.IOException;

public class DataRecovery {

    public static void dataRecovery() throws IOException {

        ReadFile.readFile();
        OrderSymptoms.orderSymptoms();

    }

}
