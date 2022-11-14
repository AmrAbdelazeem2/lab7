public class ResidentialSite extends Site {

    private double units;
    private double rate;

    public ResidentialSite() {
    }

    public double getBillableAmount() {
        double base = units * rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
