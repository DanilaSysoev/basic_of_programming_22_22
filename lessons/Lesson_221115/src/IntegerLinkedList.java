public class IntegerLinkedList {
    private static class IntegerLinkedListItem {
        private final int data;
        private final IntegerLinkedListItem next;

        public IntegerLinkedListItem(int data, IntegerLinkedListItem next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
        public IntegerLinkedListItem getNext() {
            return next;
        }
    }

    private IntegerLinkedListItem head;

    public IntegerLinkedList() {
        head = null;
    }

    public void addToHead(int item) {
        head = new IntegerLinkedListItem(item, head);
    }

    public boolean contains(int item) {
        var worker = head;
        while (worker != null) {
            if (worker.getData() == item)
                return true;
            worker = worker.getNext();
        }
        return false;
    }

    public void print() {
        var worker = head;
        System.out.print("[");
        while (worker != null) {
            System.out.printf(" %d ->", worker.getData());
            worker = worker.getNext();
        }
        System.out.println("]");
    }
}
