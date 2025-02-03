package opgave03.model;

public class SASGoLight extends TicketType{
    public SASGoLight() {
        super(0,0);
    }

    @Override
    public String getTypeName() {
        return "SAS Go Light";
    }
}
