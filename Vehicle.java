public class Vehicle {
    // Thuộc tính
    private String brand;
    private int speed;
    private int weight;
    private String color;

    // Phương thức khởi tạo mặc định
    public Vehicle() {
    }

    // Phương thức init để khởi tạo giá trị cho các thuộc tính
    public void init(String brand, int speed, int weight, String color) {
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    // Phương thức display để hiển thị thông tin của Vehicle
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}