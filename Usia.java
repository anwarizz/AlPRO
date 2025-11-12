public class Usia {
    public static void main(String[] args) {
        
        int usia = 8;

        if (usia <= 5) {
            System.out.println("Balita");
        } else if (usia > 5 && usia <= 12) {
            System.out.println("Anak-anak");
        } else if (usia > 12 && usia <= 17)  {
            System.out.println("Remaja");
        } else {
            System.out.println("Dewasa");
        }
    }
}
