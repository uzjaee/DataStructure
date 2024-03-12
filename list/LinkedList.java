package list;

public class LinkedList<E> implements List<E> {

    Link<E> head,tail;
    int size;
    public LinkedList(){
        head = new Link<>(null,null);
        tail = head;
        size = 0;
    }

    @Override
    public void clear() {
        tail = head;
        head.next =null;
        size = 0;
    }

    @Override
    public void insert(int pos, E item) {
        Link<E> in = new Link<>(item,null);
        Link<E> curr = head;
        for(int i =0;i<pos;i++){
            curr = curr.next;
        }
        in.next = curr.next;
        curr.next =in;
        size++;
    }

    @Override
    public void append(E item) {
        tail.next = new Link<E>(item,null);
        tail = tail.next;
        size++;
    }

    @Override
    public void update(int pos, E item) {
        Link<E> curr = head;
        for(int i =0; i<=pos; i++){
            curr = curr.next;
        }
        curr.item =item;
        size++;
    }

    @Override
    public E getValue(int pos) {
        Link<E>curr = head;
        for(int i=0;i<=pos;i++){
            curr = curr.next;
        }
        return curr.item;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public void remove(int pos) {
        Link<E> curr = head;
        for(int i=0; i<pos; i++)
            curr = curr.next;
        if(curr.next ==tail)
            tail =curr;
        curr.next =curr.next.next;
        size--;

    }
}
