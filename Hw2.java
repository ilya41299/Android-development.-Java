public class Collection<T> {
    private class elements {
        T data;
        elements next;
    }

    private elements head;

    Collection() {
        head = null;
    }

    public T get(int index) {
        T get_data = head.data;
        elements tmp = head;
        int counter = 0;
        while (counter != index) {
            tmp = tmp.next;
            get_data = tmp.data;
            ++counter;
        }
        return get_data;
    }

    public void add(T element) {
        if (head == null) {
            head = new elements();
            head.data = element;
            head.next = null;
        } else {
            elements tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new elements();
            tmp.next.data = element;
            tmp.next.next = null;
        }
    }

    public elements getHead() {
        return head;
    }
}
