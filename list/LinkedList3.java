package list;

public class LinkedList3 <E> implements List4<E>{
  Link3<E> head,tail;
  int size;
  LinkedList3(){
    head = new Link3<>(null,null);
    tail = head;
    size = 0;
  }

  @Override
  public int length() {
    return size;
  }

  @Override
  public void add(E e) {
    tail.next = new Link3<>(e,null);
    tail = tail.next;
    size++;
  }



  @Override
  public void insert(int index, E e) {
    Link3<E> item = new Link3<>(e,null);
    Link3<E> curr = head;
    for(int i = 0;i<index; i++)
      curr = curr.next;
    item.next = curr.next;
    curr.next = item;
    size++;

  }



  @Override
  public void update(int index, E e) {
    Link3<E> curr = head;
    for(int i = 0;i<=index;i++)
      curr = curr.next;
    curr.item = e;
  }

  @Override
  public void clear() {
    tail = head;
    size = 0;
    head.next =null;
  }

  @Override
  public E remove(int index) {
    Link3<E> curr = head;
    for(int i = 0; i<index; i++)
      curr = curr.next;
    E removed = curr.next.item;
    curr.next = curr.next.next;
    size--;
    return removed;
  }

  @Override
  public E getValue(int index) {
    Link3<E> curr = head;
    for (int i =0; i <=index; i++)
      curr = curr.next;
    return curr.item;
  }

}
