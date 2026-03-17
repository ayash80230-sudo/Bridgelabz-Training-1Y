public class Product {
    int productId;
    String productName;

    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }


    boolean isMatch(String keyword) {
        return productName.toLowerCase().contains(keyword.toLowerCase());
    }
}

    class ElectronicProduct extends Product {
        String brand;

        ElectronicProduct(int productId, String productName, String brand) {
            super(productId, productName);
            this.brand = brand;
        }


        @Override
        boolean isMatch(String keyword) {
            String lowerKeyword = keyword.toLowerCase();
            boolean nameMatch = productName.toLowerCase().contains(lowerKeyword);
            boolean brandMatch = brand.toLowerCase().contains(lowerKeyword);

            return nameMatch || brandMatch;
        }
    }

    public class ECommerceSystem {
        public static void main(String[] args) {
            Product generalItem = new Product(501, "Organic Coffee");
            ElectronicProduct gadget = new ElectronicProduct(702, "iPhone 15", "Apple");

            String search = "Apple";

            System.out.println("Searching for: " + search);
            System.out.println("Match in General Product? " + generalItem.isMatch(search));
            System.out.println("Match in Electronics? " + gadget.isMatch(search));
        }
    }

