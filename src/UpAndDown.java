public class UpAndDown {
    public static void main(String[] args) {
        int number = 3;

        System.out.println(number); //3

        int numberAfterChange = number++;
        System.out.println(numberAfterChange);
        System.out.println(number);

        number += 1;
        System.out.println(number); //4
        number ++;
        System.out.println(number); //5
        number --;
        System.out.println(number); //4
        System.out.println(number++); //4
        System.out.println(number); //5




    }
}
