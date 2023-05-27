import java.util.ArrayList;

public class WebShop {

    public WebShop(String webShopName){
    }

    public void updateOfferQuantity(Item item, int initQuantity){
        int someNum = item.getQuantity()-initQuantity;
        item.setQuantity(item.getQuantity()-someNum);
    }

    public void listAllItems(){

    }

    public void reduceNumberOfItemsAfterSuccessfulPurchase(Item item, int num){
        item.setQuantity(item.getQuantity()-num);
    }

    public void finishAndPay(){
        System.out.println("============ Package ============");
        listAllItems();
    }

    public void addItemInWebShop(Item item){
        ArrayList<Item> itemsList = new ArrayList<>();
        itemsList.add(item);
    }

    public void putItemsInPackage(Customer customer){

    }
}