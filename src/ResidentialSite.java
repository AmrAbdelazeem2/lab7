public class ResidentialSite extends Site {

    private double units;
    private double rate;

    public ResidentialSite() {
    }

    @Override
    public double getBaseAmount() {
        return this.units * this.rate;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
