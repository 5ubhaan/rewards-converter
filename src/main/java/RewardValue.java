public class RewardValue {

    private double cashValue;
    private double milesValue;

    // This is a constructor that will accept a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Converts cash to miles
    }

    // This is a constructor that will accept a mile value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Converts miles to cash
    }

    //This is a method to give cash value
    public double cashValue() {
        return this.cashValue;
    }

    //This is a method to give miles value
    public double milesValue() {
        return this.milesValue;
    }

}
