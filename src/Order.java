
package donemprojesi;

public class Order {
    private User receiver;
    private Product orderedProduct;
    private CreditCards card;
    private int piece;
    private boolean isOrderedSuccessfull;

    public Order(User receiver, Product orderedProduct, CreditCards card, 
            int piece, boolean isOrderedSuccessfull) {
        this.receiver = receiver;
        this.orderedProduct = orderedProduct;
        this.card = card;
        this.piece = piece;
        this.isOrderedSuccessfull = isOrderedSuccessfull;
    }

    public User getReceiver() {
        return receiver;
    }
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
    public Product getOrderedProduct() {
        return orderedProduct;
    }
    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
    public CreditCards getCard() {
        return card;
    }
    public void setCard(CreditCards card) {
        this.card = card;
    }
    public int getPiece() {
        return piece;
    }
    public void setPiece(int piece) {
        this.piece = piece;
    }
    public boolean isIsOrderedSuccessfull() {
        return isOrderedSuccessfull;
    }
    public void setIsOrderedSuccessfull(boolean isOrderedSuccessfull){
        this.isOrderedSuccessfull = isOrderedSuccessfull;
    }
    
    
    public void orderProcess(){
        if(this.orderedProduct.stockDisplay(this.piece)){
            if(this.receiver.payPart(this.orderedProduct, this.card, this.piece)){
                
               this.receiver.addOrder(this.orderedProduct);
               this.orderedProduct.decrease(this.piece);
               this.card.decreasingMoney(this.piece,  this.orderedProduct.getProductCost());
               this.isOrderedSuccessfull = true;
        }
            else{
                this.isOrderedSuccessfull = false;
            }
    }
        else{
            this.isOrderedSuccessfull = false;
        }   
 }
    public void cancelOrder(){
        if (this.isOrderedSuccessfull) {
            this.orderedProduct.setProductStockInfo(this.orderedProduct.getProductStockInfo() + this.piece);
       this.card.setBalance(this.card.getBalance() + (this.piece * this.orderedProduct.getProductCost()));
       this.receiver.deleteOrder(this.orderedProduct);
        }
        else{
            System.out.println("Order not found");
        }
    }
    
    public void showAllOfOrderInformation(){
        System.out.println(this.getReceiver().getName().toUpperCase()+"'S ORDER INFORMATIONS");
        System.out.println("---------------------------------------");
        System.out.println("Name : "+this.receiver.getName());
        System.out.println("Surname "+this.receiver.getSurName());
        System.out.println("Product: "+this.orderedProduct.getProductName());
        System.out.println("Paid card: "+this.card.getCardNumber());
        System.out.println ("Number of product: "+this.piece);
        System.out.println("_____________________________________________");
        
    }
    

    
    
}
