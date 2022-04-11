package africa.semicolon.chapterSixteen.linkedList;


public class _LinkedList {
    Node head;
    public static void main(String[] args) {
        _LinkedList list = new _LinkedList();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        while (list.head.next != null) {
            System.out.println(list.head.value);
            list.head = list.head.next;
        }
    }
}
