package zad2;

public class Robot implements CommonActions{

    // atributes
    private String name;
    private int id;
    private int cntID = 800;
    private String doc;

    // constructor
    public Robot(){
        getName();
        getId();
        getDoc();
    }

    // implemented methods
    @Override
    public void walk(String direction, int distance) {
        System.out.println("Walking "+ direction +" for "+ distance +" kilometers...");
    }

    @Override
    public String talk(String words) {
        String tlk = "";
        System.out.println("'Shows a sheat of paper' " + "\nThis robot can't speak...");
        return tlk;
    }

    @Override
    public void think(String thoughts) {
        System.out.println("Thinking about "+ thoughts);
        System.out.println("Thinking....");
    }

    @Override
    public int calculate(int math) {
        if (math == 0 || math == 1){
            return 1;
        }else {
            return math*calculate(math-1);
        }
    }

    //methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDoc() {
        return doc;
    }

    public void infoRobot(){
        System.out.println("Robots name - "+ name);
        System.out.println("Robots date of creation - "+ doc);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", id=" + id +", dOC="+ doc+
                '}';
    }
}
