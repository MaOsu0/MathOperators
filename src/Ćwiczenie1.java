import java.util.Random;

public class Ćwiczenie1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(50);
        int y = rand.nextInt(50);

        System.out.println("x=" + x + ", y=" + y);

        // Czy x jest większe od y?
        boolean result = x > y;
        System.out.println("x > y = " + result);

        // Czy x pomnożone przez 2 jest większe od y?

        result = (2 * x) > y;
        System.out.println("2*x > y = " + result);

        // Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?

        result = (x+3 > y) && (x-2 < y);
        System.out.println("x+3 > y i x-2 <y = " + result);

        // Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)

        result = ((x * y)%2 == 0);
        System.out.println("Czy x*y jest parzyste ? " + result);



//        int sum = x + 3; //8
//
//
//        int sum2 = x - 2; // 3
//        int iloczyn = x * y;
//        System.out.println(iloczyn);
//        int reszta = iloczyn%2;
//        System.out.println(reszta);
//
//        System.out.println(x > y);
//        System.out.println((x * 2) > y);
//        System.out.println(y < sum && y > sum2);
//        System.out.println(reszta==0);

    }
}
