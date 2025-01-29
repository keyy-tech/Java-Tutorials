public class Variables {
//    ENUMERATED TYPE(a variable declared as enum
    enum Programmes {CE,CY,IS}
    public static void main(String[] args) {
//        VARIABLE DECLARATION(numbers,int,float,double)
        int StudentAge = 45;
        double hostelDistance = 4.45;
        float height;
        height = 2;
        System.out.println(StudentAge);
        System.out.println(hostelDistance);
        System.out.println(height);

//        STRING VARIABLES(String,text)
        String StudentName = "John Doe";
        String StudentFriend = "Emmanuel Yayra";
        String StudentHostel = "Camp City";
        System.out.println(StudentName);
        StudentName = "Jude";
        System.out.println(StudentFriend);
        System.out.println(StudentHostel);
        System.out.println(StudentName + ' ' + StudentHostel + ' ' + StudentFriend);

//        CONSTANTS VARIABLES
        final int YOB = 1946;
        System.out.println(YOB);

//         ENUMERATED VARIABLE IN USE
        Programmes StudentPrg = Programmes.CE;
        System.out.println(StudentPrg);

        Programmes StudentPrg2 = Programmes.CY;
        System.out.println(StudentPrg2);

        Programmes StudentPrg3 = Programmes.IS;
        System.out.println(StudentPrg3);

    }
}