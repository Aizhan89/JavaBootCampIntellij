public class ThirdActivity {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setName("Ivan3");
        } catch (IllegalNameException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
