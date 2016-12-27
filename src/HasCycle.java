import java.util.HashSet;
import java.util.Set;

/**
 *  Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
 * Created by dinu on 12/27/16.
 */
public class HasCycle {


    boolean hasCycle(Node head) {
        Set<Node> set = new HashSet<>();
        while (head != null) {
            set.add(head);
            head = head.next;
            if (set.contains(head)) {
                return true;
            }
        }
        return false;

    }


}

class Node {
    int data;
    Node next;
}
