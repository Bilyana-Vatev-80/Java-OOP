package controllers;

import Interfaces.Layout;
import enums.ReportLevel;

public class XmlLayout implements Layout {
    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format ("<log>%n" +
                "<date>"+ date +"</date>%n" +
                "<level>"+reportLevel+"</level>%n" +
                "<message>"+ message +"</message>%n" +
                "</log>");
    }
}
