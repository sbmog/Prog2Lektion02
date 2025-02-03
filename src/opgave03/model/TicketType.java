package opgave03.model;

public abstract class TicketType {
    protected int includedHandLuggage;
    protected int includedCheckedBags;

    protected static final int handLuggagePrice = 120;
    protected static final int extraCheckedBagPRice = 310;
    protected static final int heavyBag23To28KG = 330;
    protected static final int heavyBagOver28KG = 590;

    public TicketType(int includedHandLuggage, int includedCheckedBags) {
        this.includedHandLuggage = includedHandLuggage;
        this.includedCheckedBags = includedCheckedBags;
    }

    public int calculateExtraCost(int extaHandLuggage, int extraCheckedBags, double heavyBagWeight) {
        int totalPrice = 0;

        if (extaHandLuggage > 0 && includedHandLuggage == 0) {
            totalPrice += handLuggagePrice;
        }

        if (extraCheckedBags > includedCheckedBags) {
            int extraBags = extraCheckedBags - includedCheckedBags;
            totalPrice += extraBags * extraCheckedBagPRice;
        }

        if (heavyBagWeight > 28) {
            totalPrice += heavyBagOver28KG;
        } else if (heavyBagWeight > 23) {
            totalPrice += heavyBag23To28KG;
        }

        return totalPrice;
    }

    public abstract String getTypeName();
}
