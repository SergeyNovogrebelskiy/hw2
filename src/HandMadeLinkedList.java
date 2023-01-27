import java.util.HashMap;
import java.util.NoSuchElementException;

public class HandMadeLinkedList<T> {

    class Node<Task> {
        public Task data;
        public Node<Task> next;
        public Node<Task> prev;

        public Node(Node<Task> prev, Task data, Node<Task> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * Указатель на первый элемент списка. Он же first
     */
     Node<Task> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
     Node<Task> tail;

    private int size = 0;

    HashMap<Integer, Node> tasks = new HashMap<>();
    private int STORY_SIZE = 10;

    public void addFirst(Task element) {
        final Node<Task> oldHead = head;
        final Node<Task> newNode = new Node<>(null, element, oldHead);
        head = newNode;
        if (oldHead == null)
            tail = newNode;
        else
            oldHead.prev = newNode;
        size++;
        tasks.put(element.id, newNode);
    }

    public void setSTORY_SIZE(int STORY_SIZE) {
        this.STORY_SIZE = STORY_SIZE;
    }

    public Task getFirst() {
        final Node<Task> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data;
    }

    public void addLast(Task task) {
        if (checkTaskIsOnList(task)) {
            removeTask(task);
            System.out.println("Privet");
        } else {
            if (tasks.size() > STORY_SIZE - 1) {
                removeTask(head.data);
                tasks.remove(head.data.id);
                System.out.println("Privet 5");
            }
        }
        final Node<Task> oldTail = tail;
        final Node<Task> newNode = new Node<>(oldTail, task, null);
        tail = newNode;
        if (oldTail == null)
            head = newNode;
        else
            oldTail.next = newNode;
        size++;
        tasks.put(task.id, newNode);
    }

    public void removeTask(Task task) {
        Node<Task> node = tasks.get(task.id);
        if (head.equals(node)) {
            Node<Task> next = node.next;
            next.prev = null;
            head = next;
            System.out.println("Privet 1");
        } else if (tail.equals(node)) {
            Node<Task> prev = node.prev;
            prev.next = null;
            tail = prev;
            System.out.println("Privet 2");
        } else {
            Node<Task> prev = node.prev;
            Node<Task> next = node.next;
            prev.next = next;
            next.prev = prev;
            System.out.println("Privet 3");
        }


    }

    public boolean checkTaskIsOnList (Task task){
        return tasks.containsKey(task.id);
    }

    public Task getLast() {
        final Node<Task> curHead = tail;
        if (curHead == null)
            throw new NoSuchElementException();
        return tail.data;
        // Реализуйте метод
    }

    public int size() {
        return this.size;
    }

}