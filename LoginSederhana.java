public class LoginSederhana {
    public static void main(String[] args) {
        String username = "admin";
        String password = "12345";

        if (username == "admin" && password == "12345") {
            System.out.println("Berhasil Login Sebagai: " + username);
        } else {
            System.out.println("Login gagal.");
        }
    }
}
