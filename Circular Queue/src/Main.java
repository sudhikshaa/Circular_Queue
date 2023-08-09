public class Main {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue();

        queue.insert(9);
        queue.insert(8);
        queue.insert(7);
        queue.insert(6);
        queue.insert(5);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();


    }
}