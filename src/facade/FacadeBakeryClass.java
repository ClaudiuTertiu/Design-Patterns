package facade;

public class FacadeBakeryClass {
    private Cake cake;
    private Pie pie;

    public FacadeBakeryClass(Cake cake, Pie pie) {
        this.cake = cake;
        this.pie = pie;
    }

    public void bakeCake() {
        this.cake.bakeCake();
    }

    public void bakePie() {
        this.pie.bakePie();
    }
}
