
package donemprojesi;


public class Product {
    
    public String productName;
    public String productColor;
    public String productCategory;
    public int productStockInfo;
    public double productWeight;
    public String productDescriptionInfo;
    public double productCost;
    
   Product ( String productName, String productColor, String productCategory, int productStockInfo, 
           double productWeight, String productDescriptionInfo, double productCost){
       
       this.productName= productName;
       this.productColor=productColor;
       this.productCategory=productCategory;
       this.productStockInfo=productStockInfo;
       this.productWeight=productWeight;
       this.productDescriptionInfo=productDescriptionInfo;
       this.productCost=productCost;
    }

    public boolean stockDisplay(int numberOfProduct){
        if(numberOfProduct <= this.productStockInfo && this.productStockInfo > 0 && numberOfProduct > 0){
            return true;
        }
        if(this.productStockInfo==0){
            System.out.println("Stock is not enough.");
        }
        else if(numberOfProduct<=0 && this.productStockInfo >0){
            System.out.println("There are not as many items in stock as you added");
        }
        else if(numberOfProduct > 0 && this.productStockInfo<0){
            System.out.println("False");
        }
        else {
            System.out.println("You can not buy this product.");
        }
        return false;
    }
    
    public void decrease(int numberOfProduct){
        this.productStockInfo= this.productStockInfo - numberOfProduct;
    }
    
    public void showAllInformationsOfProduct(){
        System.out.println(this.productName.toUpperCase()+"'INFORMATIONS");
        System.out.println("---------------------------------");
         System.out.println("Product name: "+this.productName);
        System.out.println("product Color: "+this.productColor);
        System.out.println("product category: "+this.productCategory );
        System.out.println("Stock of product: "+this.productStockInfo);
        System.out.println("product Weight(kg): "+this.productWeight);
        System.out.println("product description information: "+this.productDescriptionInfo);
        System.out.println("Price of product: $"+this.productCost);
        System.out.println("________________________________________");
 }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockInfo() {
        return productStockInfo;
    }

    public void setProductStockInfo(int productStockInfo) {
        this.productStockInfo = productStockInfo;
    }

    public double getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(double productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescriptionInfo() {
        return productDescriptionInfo;
    }

    public void setProductDescriptionInfo(String productDescriptionInfo) {
        this.productDescriptionInfo = productDescriptionInfo;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }
    
}

