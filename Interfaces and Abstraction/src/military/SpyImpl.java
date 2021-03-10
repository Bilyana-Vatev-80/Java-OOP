package military;

import military.interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(super.getFirstName()).append(" ").append(super.getLastName()).append(" Id: ").append(super.getId()).append(System.lineSeparator())
                .append("Code Number: ").append(getCodeNumber());
        return sb.toString().trim();
        /*String.format("Name: %s %s Id: %d%nCode Number: %s",
                super.getFirstName(),
                super.getLastName(),
                super.getId(),
                this.getCodeNumber());*/

    }
}
