public class Main {
    public static void main(String[] args) {
        System.out.println("A = 5 B= 10");
        int a = 5, b = 10;
        System.out.println("Сумма = " + plus(a, b));
        System.out.println("Произведение = " + qca(a, b));
        System.out.println("Разность = " + minus(a, b));
        System.out.printf("А в степени B = %.0f \n", stepen(a, b));
        System.out.printf("Корень А = %.2f", mda(a));
    }

    static int plus(int a, int b) {
        return (a + b);
    }
    static int qca(int a, int b){
        return (a*b);
    }
    static int minus(int a, int b){
        return (a-b);
    }
    static double stepen(int a, int b){
        return (Math.pow(a,b));
    }
    static double mda(double a){
        return (Math.sqrt(a));
    }
}