package list;

public class DLinkedList <E> implements List<E> {

  public DLink<E> head , tail;
  public int size;
  public DLinkedList() {
    head = new DLink<E>(null, null, null);
    tail = new DLink<E>(null, null, null);
    head.next = tail;
    tail.prev = head;
    size = 0;
  }
  @Override
  public void clear() {
    head.next = tail;
    tail.prev = head;
    size = 0;
  }

  @Override
  public void insert(int pos, E item) {
    DLink<E> curr = head;
    for(int i =0;i<pos;i++){
      curr = curr.next;
    }
    DLink<E> in = new DLink<>(item,curr,curr.next);
    curr.next.prev = in;
    curr.next = in;
    size++;
  }

  @Override
  public void append(E item) {

  }

  @Override
  public void update(int pos, E item) {

  }

  @Override
  public E getValue(int pos) {
    return null;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public void remove(int pos) {

  }

  @Override
  public ListIterator<E> listIterator() {
    return null;
  }

}
