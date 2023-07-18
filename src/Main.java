public class Main {
    public static void main(String[] args) {
        User user1 = new
                User.Builder(49465465, "Çağrı").setPhoneNumber("49841984").build();
        User user2 = new
                User.Builder(464654, "Ali").setAge(45).setEmail("email").build();
    }
}