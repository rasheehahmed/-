public class Fibonacciprogression extends Progression {
    protected long prev;
    public Fibonacciprogression( ){
        this(0,1);
    }
    public Fibonacciprogression(long first, long second) {
        super(first);
        prev = second - first;
    }
    protected void advance (){
        long temp = prev;
        prev = current;
        current += temp;
    }

    public static void main(String[] args) {
        Fibonacciprogression y = new Fibonacciprogression(2,2);
        y.printprogression(8);
    }
}
