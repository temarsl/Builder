package my;

public abstract class HomeBuilder {
    Home home;

    void buildHouse(){
        home = new Home();
    }

    abstract void buildFloors();
    abstract void buildYear();
    abstract void buildFinishing();

    Home getHome() {
        return home;
    }
}
