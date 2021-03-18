package barracksWars.core.commands;

import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

public class Fight implements Executable {

    public Fight() {

    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException {
        return "fight";
    }
}
