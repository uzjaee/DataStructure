package list;

public class ArrayList4<E> implements List4<E>{

  int size ;
   E [] data;

   ArrayList4(int capacity){
    data = (E[]) new Object[capacity];
    size = 0;
  }

  public E [] getData(){
     return data;
  }

  @Override
  public int length() {
    return size;
  }

  @Override
  public void add(E e) {
    if(size == data.length)
      makeDouble();
    data[size] = e;
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
     size = 0;

  }

  @Override
  public E remove(int index) {
    return null;
  }

  @Override
  public E getValue(int index) {
    return null;
  }

  private void makeDouble(){
    E [] list2 = (E[]) new Object[data.length*2];
    System.arraycopy(data, 0, list2, 0, data.length);
    data = list2;
  }

}
