package controllers;

import Interfaces.Layout;
import enums.ReportLevel;

public class ConsoleAppender extends BaseAppender{
    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public
    void append (String data, ReportLevel reportLevel, String message) {
        super.append (data, reportLevel, message);
    }
}
