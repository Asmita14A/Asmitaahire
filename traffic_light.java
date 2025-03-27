public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = scanner.next().toLowerCase();

        switch (color) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Get Ready"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color!");
        }
        scanner.close();
    }
}