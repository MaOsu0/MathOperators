public class LogicalOperators {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;

        System.out.println("Czy X jest mniejszy od zera lub Y jest większy od zera?");
        System.out.println(x < 0);
        System.out.println(y > 0);
        System.out.println(x < 0 || y > 0);

        System.out.println("Czy X jest mniejszy od zera i (jednocześnie) Y jest większy od zera?");
//        System.out.println(x < 0);
//        System.out.println(y > 0);
//        System.out.println(x < 0 || y > 0);
        System.out.println(x < 0 && y > 0);

        boolean xLessThen0 = x < 0;
        boolean yGreaterThen0 = y > 0;

    }
}
