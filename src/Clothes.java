public class Clothes {
    private String name;
    private String material;
    private SizeEnum sizeEnum;
    private Factory factory;

    public Clothes(String name, String material, SizeEnum sizeEnum, Factory factory) {
        this.name = name;
        this.material = material;
        this.sizeEnum = sizeEnum;
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }

    public Factory getFactory() {
        return factory;
    }



}
