package my;

public class main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        builder.setHomeBuilder(new ApartmentHouse());
        Home home = builder.buildHome();

        System.out.println(home);
    }
}
