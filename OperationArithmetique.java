public class OperationArithmetique {
    public static  long addition  ( int a, int b) throws TooLargeValueException    {
        long s =(long)a +(long)b;
        if (s<Integer.MAX_VALUE && s< Integer.MIN_VALUE){
            return s;

        }
        else throw new TooLargeValueException("valeur tres grande ");

    }
    public static long division ( int a, int b) throws TooLargeValueException, IllegalDivisionException {
        if (b==0){
            throw new IllegalDivisionException("division zero impossible ");
        }
        long s =(long)a / b;
        if (s<Integer.MAX_VALUE && s< Integer.MIN_VALUE ){
            return s;

        }
        else {
            throw new TooLargeValueException("valeur tres grande");
        }


    }
}
