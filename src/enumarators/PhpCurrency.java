package enumarators;

public enum PhpCurrency {
    Penny(0.01f, 0.0f),Nickle(0.7f, 0.0f),Dime(0.25f, 0.0f),Quarter(0.6f,0.0f);

    float val;
    float tax;
    String name;

    PhpCurrency(float val, float tax){
        this.val = val;
        this.tax = tax;
        this.name = null;
    }
}
