public class Factory {
    private String country;
    private String nameOfFactory;

    public String getCountry() {
        return country;
    }

    public String getNameOfFactory() {
        return nameOfFactory;
    }

    public Factory(String country, String nameOfFactory) {
        this.country = country;
        this.nameOfFactory = nameOfFactory;
    }
}
