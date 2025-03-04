public class Test14 {
    double length;
    double width;
    double height;

    // Default Constructor
    Test14() {
        // creates with default values
    }

    Test14(double len, double wid) {
        length = len;
        width = wid;
    }

    Test14(double len, double wid, double hei) {
        length = len;
        width = wid;
        height = hei;
    }

    double setArea() {
        return length * width;
    }

    double setVolume() {
        return length * width * height;
    }

    double getLength() {
        return length;
    }

    void setLength(double len) {
        length = len;
        System.out.println("Lengthn successfully change to " + len);
    }

    double getWidth() {
        return width;
    }

    void setWidth(double wid) {
        width = wid;
        System.out.println("Width successfully change to " + wid);
    }

    double getHeight() {
        return height;
    }

    void setHeight(double hei) {
        height = hei;
        System.out.println("Height successfully change to " + hei);
    }

}
