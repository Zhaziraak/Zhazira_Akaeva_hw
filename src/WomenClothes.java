public class WomenClothes extends Clothes {
        private String season;


    public WomenClothes(String name, String material, SizeEnum sizeEnum,
                        Factory factory, String season) {
        super(name, material, sizeEnum, factory);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void printLabel() {
        System.out.println("It was handmade by Zhazira");
    }

    public void printLabel(String byName) {
        System.out.println("It was handmade by " +
                byName);
    }

    public final void printLabel(int year) {
        System.out.println("It was handmade in " +
                year);
    }

    public String getInfo (){
        return  "\nName: " + getName()+
                "\nMaterial: " + getMaterial()+
                "\nSize: " + getSizeEnum() +
                "\nFactory name: " + getFactory().getNameOfFactory() +
                "\nFactory country: " + getFactory().getCountry() +
                "\nSeason: " + season;

    }

}
