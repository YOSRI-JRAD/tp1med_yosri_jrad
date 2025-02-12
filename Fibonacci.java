public class Fibonacci {
    public static int fibonacci (int n) throws Superieur {
        if (n <= 0) {
            throw new Superieur("L'entier saisi doit être impérativement supérieur à 0.");
        }
        if (n ==2 || n == 1) {
            return 1;
        }
        int f1=1 ,f2=1,f=0;
        for (int i=3;i<=n;i++) {
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
}
