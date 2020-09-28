package automation.saucedemo.data;

public enum CheckoutData {
    //*********************//
    //*** CHECKOUT DATA ***//
    //*********************//

    FIRST_NAME("Sauce"),
    LAST_NAME("Demo"),
    ZIP_CODE("29590");

    private final String data;

    CheckoutData(String data) {
        this.data = data;
    }

    public String getData() { return data; }
}
