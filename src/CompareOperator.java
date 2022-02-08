public class CompareOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("Czy X jest większy od Y?");
        boolean isXGreaterThenY = x > y;
        System.out.println(isXGreaterThenY);

        boolean xEqualsY = x != y;
        System.out.println("Czy X jest różny Y?");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);
    }
}
