
package donemprojesi;

import java.util.ArrayList;

public class User {
    
    public String userName;
    public String name;
    public String surName;
    public String dateOfBirth;
    public String password;
    public String emailAddresses;
    public String homeAdresses;
    public String workAdresses;
    public ArrayList<Product> orders;
    public ArrayList<Product> favorites;
    public ArrayList<CreditCards> creditcards;
    
    User(String userName,String name,String surName,String dateOfBirth,
         String password,String emailAddresses,String homeAdresses,String workAdresses){
        this.userName=userName;
        this.name=name;
        this.surName=surName;
        this.dateOfBirth=dateOfBirth;
        this.password=password;
        this.emailAddresses=emailAddresses;
        this.homeAdresses=homeAdresses;
        this.workAdresses=workAdresses;
        this.orders= new ArrayList<Product>();
        this.favorites= new ArrayList<Product>();
        this.creditcards= new ArrayList<CreditCards>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getHomeAdresses() {
        return homeAdresses;
    }

    public void setHomeAdresses(String homeAdresses) {
        this.homeAdresses = homeAdresses;
    }

    public String getWorkAdresses() {
        return workAdresses;
    }

    public void setWorkAdresses(String workAdresses) {
        this.workAdresses = workAdresses;
    }
    
    
    
    
    public void addOrder(Product a){
        this.orders.add(a);
        System.out.println(a.getProductName()+" successfull ordered");
    }
     public void deleteOrder(Product b){
        this.orders.remove(b);
        System.out.println("Order "+b.getProductName() +" deleted.");
    }
    
    public boolean payPart(Product p, CreditCards c, int amount ){
       
        double cost = amount * p.getProductCost();
        if(c.getBalance() >= cost){
            System.out.println(" paid enough money for "+p.getProductName()+"." );
            return true;
        }
        else{
            System.out.println("Insufficient");
            return false;
        }
    }
    
    public void addCreditCard(CreditCards c ){
        this.creditcards.add(c) ;  
    }
    public void addProductFavorites(Product fav){
        this.favorites.add(fav) ;
        System.out.println("Product added to favorites.");
    }
    
    
    
    public void showFavoritesProduct(){
        System.out.println(this.userName + "'s favorite products : ");
        for(int i = 0 ; i < this.favorites.size() ; i++){
            System.out.println(this.favorites.get(i).productName + 
                    "    $:"+ this.favorites.get(i).getProductCost());
        }
    }
   public void showOrderedProducts(){
       System.out.println(this.userName+ "'s ordered products box: ");
       for(int i = 0 ; i < this.orders.size(); i++ ){
           System.out.println(this.orders.get(i).getProductName()+ 
                   "  $"+ this.orders.get(i).productCost);
       }
   }
   
   
   public void writeAll(){
   System.out.println(this.userName.toUpperCase()+"'S INFORMATIONS");
   System.out.println(" ");
   System.out.println("Username :  "+this.userName);
   System.out.println("Name : " + this.name);
   System.out.println("Surname : " + this.surName);
   System.out.println("E-mail : " + this.emailAddresses);
   System.out.println("Home Address : " + this.homeAdresses);
   System.out.println("Work Address : "+ this.workAdresses);
    System.out.println(this.userName+  "'s number of credit cards: " + this.creditcards.size());
       System.out.println( this.userName + "'s credit cards : ");
       for(int i = 0 ; i<this.creditcards.size() ; i++){
           System.out.println((i+1)+"."+this.creditcards.get(i).getCardNumber());
       }
       System.out.println(".............................");
   }
   }
