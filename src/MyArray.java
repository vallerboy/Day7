import java.util.Arrays;

public class MyArray<T> {
    private T[] array;
    private final static int lengthMultiply = 15;
    private int activeElements = 0;

    public MyArray(T[] arguments){
        array = arguments;
        Arrays.sort(array);
        activeElements = calculateElements();
    }


    public T getElement(int index){
        if(index < 0)
            throw new IllegalArgumentException("Index < 0");
        return array[index];
    }

    public void addElement(T element){
        if(activeElements + 1 > array.length){
            array = Arrays.copyOf(array, array.length + lengthMultiply);
            array[array.length-lengthMultiply] = element;
        }else{
            array[activeElements] = element;
        }
        activeElements++;
    }

    private int calculateElements(){
        int counter = 0;
        for (T t : array) {
            if(t != null){
                counter ++;
            }
        }
        return counter;
    }
}
