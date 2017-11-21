import java.util.Arrays;

public class MyArray<T> {
    private T[] array;
    private final static int lengthMultiply = 15;
    private int activeElements = 0;

    public MyArray(T[] arguments){
        array = arguments;
        activeElements =  arguments.length;
    }


    public T getElement(int index){
        if(index < 0 || index > activeElements - 1)
            throw new IllegalArgumentException("");

        return array[index];
    }

    public void addElement(T element){
        if(element == null){
            throw new NullPointerException();
        }

        if(activeElements + 1 > array.length) {
            array = Arrays.copyOf(array, array.length + lengthMultiply);
        }

        array[activeElements] = element;
        activeElements++;
    }


    public int getLength(){
        return activeElements;
    }


}
