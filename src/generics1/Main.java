package generics1;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        GenericsArray<Integer> genericsArray = new GenericsArray<>(ints);
        MinMax<Integer> minMax = genericsArray.getMinMax();

        System.out.println(minMax);
    }
}
