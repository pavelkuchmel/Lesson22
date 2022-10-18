public class QueueTest {
    public static void main(String[] args) {
        Queue<HeavyBox> q1 = new Queue<>();
        for (int i = 0; i < 5; i++){
            q1.addElement(new HeavyBox());
        }
        System.out.println(q1);
        q1.removeElement();
        System.out.println(q1);
    }
}
