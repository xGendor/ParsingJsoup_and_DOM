public class Brand {
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Brand(String brand, String type) {

        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
