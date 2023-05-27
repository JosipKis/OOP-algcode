public class Customer {

    private String adress;
    private int id;
    private String name;

    public Customer(String adress){
        this.name = name;
        this.adress = adress;
        id = 20;
    }

    public String getAdress() {
        return adress;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "adress='" + adress + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
