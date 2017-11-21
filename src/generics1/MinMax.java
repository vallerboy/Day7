package generics1;

public class MinMax<C> {

    private C first;
    private C last;

    public MinMax(C t, C t1) {
        this.first = t;
        this.last = t1;
    }

    public C getFirst() {
        return first;
    }

    public C getLast() {
        return last;
    }
}
