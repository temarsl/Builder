package my;

public class Builder {
    HomeBuilder homeBuilder;

    public void setHomeBuilder(HomeBuilder homeBuilder) {
        this.homeBuilder = homeBuilder;
    }

    Home buildHome() {
        homeBuilder.buildHouse();
        homeBuilder.buildFloors();
        homeBuilder.buildFinishing();
        homeBuilder.buildYear();
        Home home = homeBuilder.getHome();
        return home;
    }
}
