public class LinkedList {

    private ListNode listHead = null;

    // LinkedList listy = new LinkedList();
    // listy.add(data);
    // listy.get(index);
    // listy.remove(index);
    // listy.push(data);
    // listy.pop();
    // listy.length();
    // listy.reverse();
    public void add(ReadThis data) {
        if (listHead == null) {
            listHead = new ListNode(data);
        } else {
            listHead.addNodeToEnd(new ListNode(data));
        }
    }

    public ReadThis get(int index) {
        if (index == 0) {
            return listHead.getData();
        }
        ListNode node = listHead;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    public void remove(int index) {
        // find node to remove
        ListNode node = listHead;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        listHead = listHead.removeNode(node);
    }

    public void push(ReadThis data) {
        this.add(data);
    }

    public void pop() {
        listHead = listHead.removeFirstNode();
    }

    public int length() {
        return listHead.getLength();
    }

    public void reverse() {
        listHead = listHead.reverse();
    }
}
