public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }
    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println("postive");
        }else if (number < 0 ) {
            System.out.println("negitve");
        }else if(number == 0){
            System.out.println("zero");
        }
    }
}
