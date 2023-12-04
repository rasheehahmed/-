public class Progression {
    protected long current;

    public Progression( ) {
        this(0);
    }

    public Progression(long start) {
        current = start;
    }
    public long nextvalue() {
        long answer = current;
        advance();
        return answer;
    }
    protected void advance() {
        current++;
    }
    public void printprogression(int r){
        System.out.println(nextvalue());
        for (int i = 1; i < r; i++) {
            System.out.println(" " + nextvalue());
            System.out.println( );
        }
    }
}
