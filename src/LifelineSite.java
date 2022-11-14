public class LifelineSite extends Site {

    private double units;
    private double rate;

    public LifelineSite() {
    }

    @Override
    public double getBaseAmount() {
        return this.units * this.rate * 0.5;
    }

    @Override
    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
