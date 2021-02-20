package tracy.androidprojects.csc498ch06;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Doppio", "a couple of espresso shots", R.drawable.espresso),
            new Drink("Cappuccino", "Espresso, hot milk and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filtered Coffee", "Highest quality beans roasted and brewed fresh", R.drawable.filtered)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }

}
