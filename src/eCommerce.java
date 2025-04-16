
package donemprojesi;

public class eCommerce {

  
    public static void main(String[] args) {
        
        User Bilge = new User("Bilge44","Bilgesu","Mengüşoğlu",
                "07.03.2003","malatya44","bilgemngsgl@gmail.com",
                "Malatya","Manisa");
        User Helin = new User("Helin21","Helin","Harman",
                "15.03.2004","diyarbakır21","helinharman2135@gmail.com",
                "Antalya","Manisa");
        
        CreditCards card1 = new CreditCards(5000.0,"0001",Bilge,4421,"09/29");
        CreditCards card2 = new CreditCards(2500.0,"0002",Bilge,4445,"06/28");
        CreditCards card3 = new CreditCards(1000.0,"0003",Helin,2135,"07/27");
        CreditCards card4 = new CreditCards(7500.0,"0004",Helin,2107,"08/26");
        
        Product skirt = new Product("Skirt","Pink","Clothes"
                ,10,0.7,"It is a awesome skirt. %100 cotton.",150);
        Product pants = new Product("Pants","Black","Clothes"
                ,3,1.0,"That pants are relax.",180);
        Product dress = new Product("Dress","White","Clothes"
                ,7,0.9,"Are you an angel? Let's show us.",300);
        Product jacket = new Product("Jacket","Brown","Clothes"
                ,2,1.9,"Just a jacket.",350);
        Product table = new Product("Table","Yellow","Home items"
                ,8,4.6,"Just not a table.",550);
        Product iron = new Product("Iron","Gray","Home items"
                ,10,1,"Your skirts will be straight with this iron.",600);
        Product sofa = new Product("Sofa","Beige","Home items"
                ,5,10.0,"Do you want to sit? Sit the sofa.",1000);
        Product carpet = new Product("Carpet","Red","Home items"
                ,40,3.2,"From Iran. Limited edition!",700);
        
       
        
        System.out.println("PRODUCTS INFORMATIONS");
        System.out.println(" ");
        skirt.showAllInformationsOfProduct();
        pants.showAllInformationsOfProduct();
        dress.showAllInformationsOfProduct();
        jacket.showAllInformationsOfProduct();
        table.showAllInformationsOfProduct();
        iron.showAllInformationsOfProduct();
        sofa.showAllInformationsOfProduct();
        carpet.showAllInformationsOfProduct();
        
        System.out.println("_____________________________");
        
        Bilge.favorites.add(skirt);
        Bilge.favorites.add(dress);
        Bilge.favorites.add(jacket);
        Helin.favorites.add(iron);
        Helin.favorites.add(sofa);
        Helin.favorites.add(carpet);
        
        Bilge.orders.add(skirt);
        Bilge.orders.add(jacket);
        Bilge.addOrder(sofa);
        Bilge.addOrder(iron);
        Helin.orders.add(iron);
        Helin.orders.add(sofa);
        Helin.orders.add(table);
        Helin.orders.add(carpet);
       
        
        System.out.println(" ");
        System.out.println("USERS INFORMATIONS");
        System.out.println(" ");
        Bilge.writeAll();
        
        Bilge.showFavoritesProduct();
        System.out.println(".........................");
        Bilge.showOrderedProducts();
        
        System.out.println("__________________________");
        Helin.writeAll();
        Helin.showFavoritesProduct();
        System.out.println("..........................");
        Helin.showOrderedProducts();
        System.out.println("__________________________");
        
        System.out.println(" ");
        Helin.deleteOrder(carpet);
        System.out.println(" ");
        System.out.println("After Delete");
        Helin.showOrderedProducts();
        
        System.out.println("_____________________________");
        System.out.println("Pay Part");
        System.out.print("Bilge ");Bilge.payPart(sofa, card1, 1);
        card1.decreasingMoney(1, 1000);
        System.out.println("After paying card1's balance is " + card1.balance);
        sofa.decrease(1);
        
        System.out.println("After buying sofa, sofa's stock is "+sofa.productStockInfo+".");
        System.out.println("_____________________________________");
       
        System.out.println(" ");
        card1.showAllInfoOfCreditCard();
        card2.showAllInfoOfCreditCard();
      
        
    }
   
}
