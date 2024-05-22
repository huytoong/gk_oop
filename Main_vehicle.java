public class Main_vehicle {
    public static void main(String[] args) {
        Vehicle vd1 = new Car();
        vd1.init("BMW", 100, 500, "RED");
        vd1.display();
        ((Movement)vd1).start();
        ((Movement)vd1).run();
        ((Movement)vd1).stop();
        ((Movement)vd1).sleep();
    }
}
