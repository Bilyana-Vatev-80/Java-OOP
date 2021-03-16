package LoggerLib.layouts.interfaces;


import LoggerLib.enumerations.ReportLevel;

public interface Layout {
    String format(String data, ReportLevel reportLevel, String message);
}
