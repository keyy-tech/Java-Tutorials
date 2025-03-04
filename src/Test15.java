public class Test15 {
    public static void main(String[] args) {
        Test14 test14 = new Test14(5, 6, 7);
        System.out.println("Length: " + test14.getLength());
        System.out.println("Width: " + test14.getWidth());
        System.out.println("Height: " + test14.getHeight());
        System.out.println("Area: " + test14.setArea());
        System.out.println("Volume: " + test14.setVolume());
        test14.setLength(10);
        test14.setWidth(11);
        test14.setHeight(12);

    }
}
