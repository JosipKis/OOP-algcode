public enum Cars {
    // sve zadano - ne trebate ništa mijenjati
    ToyotaYaris("Toyota Yaris"), BMWX5("BMW X5"), MercedesBenzCClass("Mercedes-Benz C-Class"),
    AudiA4("Audi A4"),  RenaultAustral("Renault Austral"), VolkswagenGolf("Volkswagen Golf");

    private String carName;

    Cars(String carName){
        this.carName = carName;
    }

    public String getCarName(){
        return this.carName;
    }
}