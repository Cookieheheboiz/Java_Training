public class HinhVuong extends HinhChuNhat {
    public HinhVuong(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        System.out.println("Tinh chu vi hinh vuong");
        return 4 * getWidth();
    }

    public double getArea() {
        System.out.println("Tinh dien tich hinh vuong");
        return getWidth() * getWidth();
    }
}
