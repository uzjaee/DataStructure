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

  }

  @Override
  public void update(int index, E e) {

  }

  @Override
  public void clear() {

  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public E getValue(int index) {
    Link3<E> curr = head;
    for (int i =0; i <=index; i++)
      curr = curr.next;
    return curr.item;
  }

}
