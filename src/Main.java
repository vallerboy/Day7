import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,5,6};

        MyArray<Integer> cos = new MyArray<>(ints);
        cos.addElement(5);
        cos.addElement(10);
        System.out.println(cos.getElement(cos.getLength()-1));


        String[] strings = {"1", "24", "512", "124"};

        MyArray<String> cos1 = new MyArray<>(strings);
        cos1.addElement("1222cos");
        cos1.addElement("hejo");
        System.out.println(cos1.getElement(cos1.getLength()-1));

    }
}
