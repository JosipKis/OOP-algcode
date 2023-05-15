package p15_5_pckg_exceptions;

public abstract class Robot {
    // apstraktna klasa sluzi samo za extendanje, zato je konstruktor protected a ne public....
    protected String name;
    protected int id;
    private static int cntID = 10;

    // constructors
    protected Robot(String name){
        this.name = name;
        this.id = cntID++;
    }

    protected abstract void performSomeAction();

    public void moveToANotherLocation(){
        System.out.println(getClass().getSimpleName() +" moving to another location!");
    }

}
