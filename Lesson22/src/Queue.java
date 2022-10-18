public class Queue<T> implements UniQueue<T> {

    private Node<T> head;
    private Node<T> tail;

    public Queue(){
        head = null; tail = null;
    }

    @Override
    public boolean isEmpty() {
        return (head == null && tail == null);  //надо проверять и голову и хвост, один модет быть не nullа
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;    //привязываем к хвосту
            tail = newNode;     //переставили ссылку на новый элемент
        }
    }

    @Override
    public T removeElement(){
        T queueHeadData = peekFirst();
        if (head == tail) {
            queueHeadData = head.data;
            head = tail = null;  //можно присваивать и так
        }
        else {
            queueHeadData = head.data;
            head = head.next;
        }
        return queueHeadData;
    }

    @Override
    public T peekFirst() throws  NullPointerException{
        if (isEmpty()) throw new NullPointerException("Queue is empty");
        return head.data;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder buff = new StringBuilder();
        while (current != null){
            buff.append(current.data.toString());
            buff.append(" ");
            current = current.next;
        }
        return buff.toString();
    }
}
