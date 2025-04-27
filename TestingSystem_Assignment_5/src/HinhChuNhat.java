public class HinhChuNhat {
    private double width;
    private double height;

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        System.out.println("Tinh chu vi hinh chu nhat");
        return 2 * (width + height);
    }

    public double getArea() {
        System.out.println("Tinh dien tich hinh chu nhat");
        return width * height;
    }

}
