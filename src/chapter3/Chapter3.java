package chapter3;

public class Chapter3 {

    public static void main(String[] args) {

//        new Thread(() -> {
//            for(int i = 0; i <= 1000; i++){
//                System.out.println(i);
//            }
//        }).start();

        Validator<String> valid = value -> value.matches("[0-9]{5}-[0-9]{3}");

        System.out.println(valid.validate("04101-300"));
    }
}
