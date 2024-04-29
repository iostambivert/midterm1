package midterm.tatia_iosebashvili_1.task3;

public class OnlineMarketTester {
    public static void main(String[] args) {
        Vegetable v1 =new Vegetable();
        v1.setName("Tomato");
        v1.setPrice("2.5 lari");

        Vegetable v2 = new Vegetable();
        v2.setName("Carrot");
        v2.setPrice("3 lari");
        VMMS vmms = new VMMS();
        vmms.addVegetable(v1);
        vmms.addVegetable(v1);
        vmms.addVegetable(v2);

        vmms.removeVegetable(v1);

        vmms.printStorage();
    }

}
