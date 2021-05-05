package formatter;

public class NameEmailFormatter {
    public static void main(String[] args) {
        String name = args[0];
        String email = args[1];

        System.out.printf("%s <%s>%n", name, email);
    }
}
