package command;

public class GarageDoor {
    private boolean isOpen= true;
    public void open(){
        isOpen=true;
        System.out.println("Garage Door is " + isOpen);
    }
    public void close(){
        isOpen=false;
        System.out.println("Garage Door is "+ isOpen);
    }
}


