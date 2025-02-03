package opgave03.model;

public class SASGoSmart extends TicketType{

    public SASGoSmart() {
        super(1, 1);
    }

    @Override
    public String getTypeName() {
        return "SAS Go Smart";
    }
}
