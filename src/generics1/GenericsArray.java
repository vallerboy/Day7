package generics1;

public class GenericsArray<T> {
    private T[] array;

    public GenericsArray(T[] array){
        this.array = array;
    }

    public MinMax<T> getMinMax(){
        return new MinMax<>(array[0], array[array.length-1]);
    }
}
