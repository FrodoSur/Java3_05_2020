package lesson1.homework;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        orangeBox.compare(appleBox);
        appleBox.dropTo(appleBox1);

    }
    public static Object[] exchange(Object[] mas, int ind1,int ind2){
        Object el = mas[ind1];
        mas[ind1] = mas[ind2];
        mas[ind2] = el;
        return(mas);
    }
    public static ArrayList<Object> transform(Object[] mas){
        ArrayList<Object> arr = new ArrayList<Object>();
        for(int i =0; i<mas.length;i++){
            arr.add(mas[i]);
        }
        return(arr);
    }
}
