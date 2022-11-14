public class Site {
    protected static final double TAX_RATE = 0;
    private double BaseAmount;
    private double TaxAmount;
    public Site() {
    }

    public double getBillableAmount() {

        return getBaseAmount() + getTaxAmount();
    }

    public double getBaseAmount() {
        return BaseAmount;
    }

    public double getTaxAmount() {
        return TaxAmount;
    }
}
