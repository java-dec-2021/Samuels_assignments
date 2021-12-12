// Set-up Test File class
public class PhoneTester {
    //Entry Point
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("s9", 99, "Verizon", "Ring Ring Ring!");
        IPhone iphoneTen = new IPhone("X", 100, "AT&T", "Zing");

        // Galaxy Test
        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        // IPhone Test
        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());
    }
}