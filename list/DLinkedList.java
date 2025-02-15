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
    DLink<E> it = new DLink<>(item,null,null);
    it.prev = tail.prev;
    it.next = tail;
    tail.prev = it;
    size++;
  }

  @Override
  public void update(int pos, E item) {
    DLink<E> curr = head;
    for(int i =0;i<pos;i++){
      curr = curr.next;
    }
    curr.item = item;
  }

  @Override
  public E getValue(int pos) {
    DLink<E> curr = head;
    for(int i =0;i<pos;i++){
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
    DLink<E> curr = head;
    for(int i =0;i<pos;i++){
      curr = curr.next;
    }
    curr.prev.next = curr.next;
    curr.next.prev = curr.prev;
    size--;

  }

  @Override
  public ListIterator<E> listIterator() {
    return new ListIterator<E>() {
      DLink<E> pos = head;
      @Override
      public boolean hasNext() {
        return  pos.next != tail;
      }

      @Override
      public E next() {
        pos = pos.next;
        return pos.item;
      }

      @Override
      public boolean hasPrevious() {
        return pos.prev != head;
      }

      @Override
      public E previous() {
        pos = pos.prev;
        return pos.next.item;
      }
    };
  }

}
