public class ObjectLinkedList implements List<Object> {
    private static class ObjectLinkedListItem {
        private final Object data;
        private final ObjectLinkedListItem next;

        public ObjectLinkedListItem(Object data, ObjectLinkedListItem next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }
        public ObjectLinkedListItem getNext() {
            return next;
        }
    }

    private ObjectLinkedListItem head;

    public ObjectLinkedList() {
        head = null;
    }

    @Override
    public void addToHead(Object item) {
        head = new ObjectLinkedListItem(item, head);
    }
    @Override
    public boolean contains(Object item) {
        var worker = head;
        while (worker != null) {
            if (worker.getData().equals(item))
                return true;
            worker = worker.getNext();
        }
        return false;
    }
    @Override
    public void print() {
        var worker = head;
        System.out.print("[");
        while (worker != null) {
            System.out.printf(" %s ->", worker.getData());
            worker = worker.getNext();
        }
        System.out.println("]");
    }
    @Override
    public Object getHeadItem() {
        if(head != null)
            return head.getData();
        return null;
    }
}
