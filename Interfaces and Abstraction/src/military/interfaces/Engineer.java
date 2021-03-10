package military.interfaces;

import military.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
