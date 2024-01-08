public final class Dresses extends WomenClothes{
    private int rating;
    public Dresses(String name, String material, SizeEnum sizeEnum, Factory factory,
                   String season, int rating) {
        super(name, material, sizeEnum, factory, season);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nrating: " + rating;
    }
}
