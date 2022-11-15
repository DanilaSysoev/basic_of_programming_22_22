public class LinkedList<T extends Widget & MyInterface> implements List<T> {
    private static class LinkedListItem<T extends Widget & MyInterface> {
        private final T data;
        private final LinkedListItem<T> next;

        public LinkedListItem(T data, LinkedListItem<T> next) {
            this.data = data;
            this.next = next;
            data.method();
        }

        public T getData() {
            return data;
        }
        public LinkedListItem<T> getNext() {
            return next;
        }
    }

    private LinkedListItem<T> head;

    public LinkedList() {
        head = null;
    }
    @Override
    public void addToHead(T item) {
        head = new LinkedListItem<T>(item, head);
    }
    @Override
    public boolean contains(T item) {
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
        System.out.println(toString());
    }
    @Override
    public T getHeadItem() {
        if(head != null)
            return head.getData();
        return null;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        var worker = head;
        data.append('[');
        while (worker != null) {
            data.append(String.format(" %s ->", worker.getData()));
            worker = worker.getNext();
        }
        data.append(" ]");
        return data.toString();
    }
}
