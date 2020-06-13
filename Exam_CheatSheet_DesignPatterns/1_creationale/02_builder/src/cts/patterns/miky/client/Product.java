package cts.patterns.miky.client;

//might be smartdevice,superhero etc
//product
public class Product {
    private String name;
    private String description;
    private float price;
    private boolean isAvaible;
    IVolume volume;

    private Product() {
    }

    private Product(String name, String description, float price, IVolume volume) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setVolume(IVolume volume) {
        this.volume = volume;
    }

    public void setAvaible(boolean avaible) {
        isAvaible = avaible;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", isAvaible=" + isAvaible +
                ", volume=" + volume +
                '}';
    }

    //Builder
    public static class ProductBuilder {
        private Product product;

        //mondatory attributes
        public ProductBuilder(String name) {
            //each product built will have a name
            this.product = new Product();
            this.product.setName(name);
        }

        //for each field in ProductClass
        public ProductBuilder setAvaible(boolean avaible) {
            this.product.setAvaible(avaible);
            return this;
        }

        public ProductBuilder setDescription(String description) {
            this.product.setDescription(description);
            return this;
        }

        public ProductBuilder setVolume(IVolume volume){
            this.product.setVolume(volume);
            return this;
        }

        public ProductBuilder setPrice(float price){
            this.product.setPrice(price);
            return this;
        }


        //build
        public Product build() {
            return this.product;
        }
    }


}
