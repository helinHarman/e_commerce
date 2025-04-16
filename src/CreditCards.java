
package donemprojesi;

/**
 *
 * @author helin
 */
public class CreditCards {
    
    public String cardNumber;
    public User user;
    public int securityCode;
    public String expirationDate;
    public double balance;
    
    CreditCards(double balance,String cardNumber, User user, 
            int securityCode, String expirationDate){
      this.cardNumber=cardNumber;
      this.user=user;
      this.securityCode=securityCode;
      this.expirationDate=expirationDate;
      this.balance= balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public int getSecurityCode() {
        return securityCode;
    }
    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
   
    
    public void decreasingMoney(int num, double cost){
        this.balance -= num * cost;
    }
    
    public void showAllInfoOfCreditCard(){
        System.out.println(this.user.getName().toUpperCase()+"'S CREDIT CARD INFORMATIONS");
        System.out.println("------------------------------------");
        System.out.println("Credit Card number: "+this.cardNumber);
        System.out.println("Credit Card's user: "+ this.user.getName());
        System.out.println("Security code :"+this.securityCode);
        System.out.println("Expiration date: "+this.expirationDate);
        System.out.println("Card balance: "+ this.balance);
        System.out.println("________________________________________");
        
    }
    
}
