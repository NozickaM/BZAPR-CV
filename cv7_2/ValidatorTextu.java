package cv7_2;

public class ValidatorTextu {
    private String vzor;

    public ValidatorTextu(String vzor) {
        this.vzor = vzor;
    }

    public boolean validuj(String name) {
        return name.matches(this.vzor);
    }

    @Override
    public String toString() {
        return "ValidatorTextu: " +
                "vzor: " + this.vzor;
    }
}
