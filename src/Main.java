public class Main {
    public static void main(String[] args) {
        HandMadeLinkedList handMadeLinkedList = new HandMadeLinkedList();

        handMadeLinkedList.addLast(new Task(1,"Ford", "Mondeo", 1600,
                false));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(2, "Ford", "Focus", 1600,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(3, "Mitsubishi", "Lancer", 2000,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(4,"Toyota", "Camry", 1200,
                false));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(5,"Toyota", "Corolla", 1600,
                false));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(6, "Ford", "Exploer", 1600,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(7, "Mitsubishi", "Pajero", 2000,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(8,"Kia", "Sorento", 1200,
                false));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(9,"Kia", "Sportage", 1600,
                false));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(10, "Mazda", "3", 1600,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);

        System.out.println(handMadeLinkedList.getFirst());
        System.out.println(handMadeLinkedList.getLast());

        handMadeLinkedList.addLast(new Task(11, "Mitsubishi", "Galant", 2000,
                true));
        System.out.println(handMadeLinkedList.head + "\t" + handMadeLinkedList.tail);
        handMadeLinkedList.addLast(new Task(12,"Lada", "Granta", 1200,
                false));

        System.out.println(handMadeLinkedList.getFirst());
        System.out.println(handMadeLinkedList.getLast());

        //handMadeLinkedList.addLast(new Task(1,"Ford", "Mondeo", 1600, false));

        System.out.println(handMadeLinkedList.getFirst());
        System.out.println(handMadeLinkedList.getLast());

        //handMadeLinkedList.addLast(new Task(2, "Ford", "Focus", 1600, true));
        //handMadeLinkedList.addLast(new Task(3, "Mitsubishi", "Lancer", 2000, true));
        //handMadeLinkedList.addLast(new Task(4,"Ford", "Fiesta", 1200, false));

//        System.out.println(handMadeLinkedList.getFirst());
//        System.out.println(handMadeLinkedList.getLast());

        System.out.println(handMadeLinkedList.tasks.size());
    }
}
