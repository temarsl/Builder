package my;

public class ApartmentHouse extends HomeBuilder {

    @Override
    void buildFloors() {
        home.setFloors(20);
    }

    @Override
    void buildYear() {
        home.setYear(50);
    }

    @Override
    void buildFinishing() {
        home.setFinishing(Finishing.WOODEN);
    }
}
