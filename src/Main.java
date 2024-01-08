public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory("China","Pinduo" );
        Factory factory2 = new Factory("Italy", "Jenner");

        WomenClothes womenClothes = new WomenClothes("Pamel", "Cotton",
                SizeEnum.S, factory, "Winter");

        Dresses dresses2 = new Dresses("Kylie", "Silk", SizeEnum.M,
                factory2, "Summer", 10);

        Dresses dresses3 = new Dresses("Kendal", "Silk + Cotton", SizeEnum.XL,
                factory2, "Summer", 8);

        System.out.println(womenClothes.getInfo());
        womenClothes.printLabel();
        womenClothes.printLabel("Alex");
        womenClothes.printLabel(2023);
        System.out.println();

        System.out.println(dresses2.getInfo());
        womenClothes.printLabel();
        womenClothes.printLabel("Kamel");
        womenClothes.printLabel(2022);
        System.out.println();

        System.out.println(dresses3.getInfo());
        womenClothes.printLabel();
        womenClothes.printLabel("Mari");
        womenClothes.printLabel(2021);





    }
}