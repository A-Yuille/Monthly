package com.example.monthly;

import java.util.Date;

public class MonthlyItem {

    double[] values;
    Date date;
    String iconID;

    public MonthlyItem(double[] vals, Date d, String iid) {
        values = vals;
        date=d;
        iconID=iid; // potentially add more to create string for complete id string not just specific name
    }

    public double getIndividualAmount(int i){

        return 0;
    }

    public Date getDueDate(){
        return date;
    }

    public String getIconID(){
        return iconID;
    }

    public void setIndividualAmount(int i, double val){
        if (val>= 0)
            values[i]= val;
    }
}
