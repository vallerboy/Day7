public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,5,6};

        MyArray<Integer> cos = new MyArray<>(ints);
        cos.addElement(5);
        cos.addElement(10);
        System.out.println(cos.getElement(cos.getLength()-1));
    }
}
