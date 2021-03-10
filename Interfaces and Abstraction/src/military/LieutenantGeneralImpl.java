package military;

import military.interfaces.LieutenantGeneral;
import military.interfaces.Private;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(PrivateImpl priv) {
        this.privates.add(priv);
    }

    @Override
    public List<PrivateImpl> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(String.format("Name: %s %s Id: %d Salary: %.2f",
                        super.getFirstName(),
                        super.getLastName(),
                        super.getId(),
                        super.getSalary()))
                .append(System.lineSeparator())
                .append("Privates:");

            this.getPrivates().sort(Comparator.comparingInt(SoldierImpl::getId).reversed());
            for (Private aPrivate : privates) {
                sb.append(System.lineSeparator());
                sb.append("\t");
                sb.append(aPrivate.toString());
            }


        return sb.toString().trim();
    }
}
