package generics;

public class Pair<X, Y> {
    private X first;
    private Y last;

    public Pair(X first, Y last){
        this.first = first;
        this.last = last;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X value){
        this.first = value;
    }

    public Y getLast() {
        return last;
    }

    public void setLast(Y value){
        this.last = value;
    }
}
