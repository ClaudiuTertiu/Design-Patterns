package facade;

public class MainClass {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Pie pie = new Pie();
        FacadeBakeryClass facadeBakeryClass = new FacadeBakeryClass(cake, pie);

        facadeBakeryClass.bakeCake();
        facadeBakeryClass.bakePie();
    }
}
