public class Lab1Ex4 {

    public static void main(String[] args) {
        double n;
        n = Double.NEGATIVE_INFINITY;
        System.out.println("The smallest number is: " + Math.nextUp(n));
        n = Double.POSITIVE_INFINITY;
        System.out.println("The biggest number is: " + Math.nextDown(n));
    }

}
