//стэк

public interface Stackable<T> {
    void push(T data);
    T peek();
    T pop();
    boolean isEmpty();
}
