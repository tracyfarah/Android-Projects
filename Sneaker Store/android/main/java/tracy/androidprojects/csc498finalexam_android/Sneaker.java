package tracy.androidprojects.csc498finalexam_android;

public class Sneaker {
    private final String name;
    private final String description;
    private final String retailPrice;
    private final int imageResource;

    public static Sneaker[] sneakers = {
            new Sneaker("Air Jordan 1 High Black Toe", "Dressed in the classic Chicago Bulls’ White, Varsity Red and Black color scheme. This Air Jordan 1 comes built with a full-grain leather upper, a rubber cupsole with encapsulated Air-Sole unit in the heel. Completing the build is a rubber outsole with deep flex grooves and pivot point for traction and flexibility.", "$160", R.drawable.blacktoe),
            new Sneaker("Air Jordan 1 High Blue Chill", "Dressed in an Obsidian, Blue Chill, and White color scheme as a nod to the UNC Tar Heels.\n" +"This Air Jordan 1 features a full patent leather upper in a mix of Obsidian, Blue, and White. Nike Air tongue tags, Wings logo on the ankle atop a White midsole and Light Blue outsole completes the design.", "$160", R.drawable.bluechill),
            new Sneaker("Air Jordan 1 High Chicago","The shoe comes dressed in its original color scheme of White, Black and Varsity Red. Featuring the Nike Air treatment displayed on the tongue and will come in the Chicago Bulls colors that we all grew up loving", "$160",R.drawable.chicago),
            new Sneaker("Air Jordan 1 High Court Purple","Dressed in a Court Purple, Sail and Black color scheme. This Air Jordan 1 features Court Purple on the heel, Nike Air tongue label, toe box and rubber outsole. White covers the side panels and midsole, along with Black overlays, tongues and laces.","$160",R.drawable.courtpurple),
            new Sneaker("Air Jordan 1 High Dark Mocha", "Dressed in a Sail, Dark Mocha, and Black color scheme. This Air Jordan 1 features a Sail leather base with Black leather overlays and Swooshes. Finishing touches includes Dark Mocha heels atop a Sail midsole and Black rubber outsole.", "$170" ,R.drawable.darkmocha),
            new Sneaker("Air Jordan 1 High Fearless", "Dressed in a UNC and Chicago color blocking, this Air Jordan 1 features a University Blue and Varsity Red patent leather overlay with White underlays, Black Swoosh logos and tongues atop a White midsole and Red outsole, and the word “FEAR” printed on the insoles.", "$160" , R.drawable.fearless),
            new Sneaker("Air Jordan 1 High Light Smoke Grey", "Dressed in a mix of White, Black, Light Smoke Grey, and Varsity Red. This Air Jordan 1 features a White leather upper with Grey suede overlays, a Red leather collar and Black Swoosh logos on the sides. A White midsole atop a Black rubber outsole completes the design.","$170"  , R.drawable.lightsmoke),
            new Sneaker("Air Jordan 1 Retro High Obsidian", "Dressed in a Sail, Obsidian, and University Blue color scheme. This Air Jordan 1 has a lot of similarities to the “UNC Patent” pair. Instead of having a patent leather build, this release comes in full leather. It features Sail leather on the upper with Obsidian and University Blue overlays.", "$160", R.drawable.obsidian),
            new Sneaker("Air Jordan 1 Retro High Pine Green", "Dressed in a Pine Green, Sail and Black color scheme. This Air Jordan 1 features Pine Green on the toe box, tongue label, heel and rubber outsole. Black covers the tongue, laces, Wings logo, Nike Swoosh and overlay on the toe. Finishing off the design is White on the mid-section as well as on the midsole.", "$160", R.drawable.pinegreen),
            new Sneaker("Air Jordan 1 High Royal Toe","Dressed in a Black, White, and Game Royal color scheme. This Air Jordan 1 comes in a “Black Toe” motif with White leather on the side panels and Game Royal on the collar and toe area. Black overlays atop a White midsole and Royal rubber outsole completes the design.","$170", R.drawable.royaltoe),
            new Sneaker("Air Jordan 1 High University Blue", "Dressed in a White, University Blue, and Black color scheme. This Air Jordan 1 features a White leather upper with University Blue suede overlays and Black covering the Swooshes, ankle collar, and laces. A White midsole atop a Blue rubber outsole completes the design.","$170", R.drawable.universityblue)
    };

    public Sneaker(String name, String description, String retailPrice, int imageResource) {
        this.name = name;
        this.description = description;
        this.retailPrice = retailPrice;
        this.imageResource = imageResource;
    }

    @Override
    public String toString() {
        return description + "\n\n" + "Retail price: " + retailPrice;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public int getImageResource() {
        return imageResource;
    }
}
