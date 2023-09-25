public class Bakery {
    public static void main(String[] args) {
        Cake chocolateCake = new Cake("Chocolate Cake", 25.99, "Chocolate");
        Cookie chocolateChipCookies = new Cookie("Chocolate Chip Cookies", 12.49, 12);

        System.out.println("Cake Details:");
        chocolateCake.describe();

        System.out.println("\nCookie Details:");
        chocolateChipCookies.describe();
    }
}