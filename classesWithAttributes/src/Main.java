public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Bilgisayar","MSI Bilgisayar",15000,2,"Kırmızı" );
        /*product.setName("Bilgisayar");
        product.setId(1);
        product.setDescription("MSI Bilgisayar");
        product.setPrice(15000);
        product.setStockAmount(2);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
