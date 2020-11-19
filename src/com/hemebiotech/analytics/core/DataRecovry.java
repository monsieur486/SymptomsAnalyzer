package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.core.datarecovery.OrderSymptoms;
import com.hemebiotech.analytics.core.datarecovery.ReadFile;

public class DataRecovry {

    public static void dataRecovery(){

        ReadFile.readFile();
        OrderSymptoms.orderSymptoms();

    }

}
