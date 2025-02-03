package opgave03.model;

public class SASBusiness extends TicketType{

    public SASBusiness() {
        super(1, 2);
    }

    @Override
    public String getTypeName() {
        return "SAS Business";
    }
}
