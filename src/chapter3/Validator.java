package chapter3;

public interface Validator<T> {
    boolean validate(T t);
}
