package solvd.itcompany.codeable;

public abstract class Application {
    private int basicPrice;
    private String type;
    private String subtype;
    private int timeTakes;

    public Application(int basicPrice, int timeTakes) {
        this.basicPrice = basicPrice;
        this.timeTakes = timeTakes;
    }

    public Application() {
        super();

    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getTimeTakes() {
        return timeTakes;
    }

    public void setTimeTakes(int timeTakes) {
        this.timeTakes = timeTakes;
    }

    @Override
    public String toString() {
        return type + " " + subtype + ",  " + basicPrice + " of monetary value";
    }

    public void assignType(TypeAndSubtypes types) {
        this.type = types.name();
    }

    public void assingSubType(TypeAndSubtypes sTypes) {
        this.subtype = sTypes.name();
    }
}
