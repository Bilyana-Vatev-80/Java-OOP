package LoggerLib.layouts;

import LoggerLib.enumerations.ReportLevel;
import LoggerLib.layouts.interfaces.Layout;

public class SimpleLayout implements Layout {


    @Override
    public String format(String date, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s",date,reportLevel.toString(),message);
    }
}
