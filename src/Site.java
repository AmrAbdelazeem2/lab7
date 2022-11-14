public abstract class Site {
    protected static final double TAX_RATE = 10;
    private double BaseAmount;
    private double TaxAmount;
    public Site() {
    }

    public double getBillableAmount() {

        return getBaseAmount() + getTaxAmount();
    }

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();
}
