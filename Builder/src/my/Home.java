package my;

public class Home {
    private int floors;
    private int year;
    private Finishing finishing;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFinishing(Finishing finishing) {
        this.finishing = finishing;
    }

    @Override
    public String toString() {
        return "Home: " +
                "floors = " + floors +
                ", year = " + year +
                ", finishing = " + finishing;
    }
}
