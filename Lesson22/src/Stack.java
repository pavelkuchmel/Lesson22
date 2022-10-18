public class Stack<T> implements Stackable<T>{

    private Node head;

    public Stack(){ head = null; }

    @Override
    //true - если стек пустой
    public boolean isEmpty(){
        return head == null;
    }

    @Override
    //положить данные в стек
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    //прочитать данные с вершины стека, если стек пустой, то срабатывает исключение
    public T peek() throws NullPointerException{
        if (isEmpty())throw new NullPointerException("Stack is empty");
        return (T) head.data;
    }

    @Override
    //вернуть данные с вершины стека и удалить
    public T pop() {
        T headDate = peek();
        head = head.next;
        return headDate;
    }

    @Override
    //преобразовать стек в строку
    public String toString() {
        Node<T> current = head;
        StringBuilder buff = new StringBuilder();
        while(current != null){
            buff.append(current.data);
            buff.append(" ");
            current = current.next;
        }
        return buff.toString();
    }
}
