package my;

public class CottageHouse extends HomeBuilder {
    @Override
    void buildFloors() {
        home.setFloors(3);
    }

    @Override
    void buildYear() {
        home.setYear(100);
    }

    @Override
    void buildFinishing() {
        home.setFinishing(Finishing.BRICK);
    }
}
