package controllers;

import Interfaces.Appender;
import Interfaces.Layout;
import enums.ReportLevel;

public abstract class BaseAppender implements Appender {
    private Layout layout;

    protected
    BaseAppender (Layout layout) {
        this.layout = layout;
    }

    public
    void append (String data, ReportLevel reportLevel, String message) {
        System.out.println (this.layout.format (data, reportLevel, message));
    }
}
