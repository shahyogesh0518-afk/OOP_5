package workshop_5;

public class exception{

   
    static void checkArray() throws ArrayIndexOutOfBoundsException {
        int[] age = {10,20,25,24,28,27,30,31,32};
        System.out.println(age[9]);
    }

    public static void main(String[] args) {

       
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        
        try {
            checkArray();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}