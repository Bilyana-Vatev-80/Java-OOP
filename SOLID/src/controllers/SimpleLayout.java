package controllers;

import Interfaces.Layout;
import enums.ReportLevel;

public class SimpleLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format ("%s - %s - %s",date,reportLevel,message);
    }
}
