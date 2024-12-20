package list;

public class ArrayList4<E> implements List4<E>{

  int size ;
   E [] data;

   ArrayList4(int capacity){
    data = (E[]) new Object[capacity];
    size = 0;
  }

  @Override
  public int length() {
    return size;
  }

  @Override
  public void add(E e) {
    if(size == data.length)
      makeDouble();
    data[size++] = e;
  }

  @Override
  public void insert(int index, E e) {
    if(size == data.length)
      makeDouble();
    for(int i =size; i>index; i--)
      data[i] = data[i-1];
    data[index] = e;
    size++;
  }

  @Override
  public void update(int index, E e) {
     data[index] =e;
  }

  @Override
  public void clear() {
     size = 0;

  }

  @Override
  public E remove(int index) {
     E result = data[index];
     for(int i = index; i < size; i++)
       data[i] = data[i+1];
     size--;
    return result;
  }

  @Override
  public E getValue(int index) {
    return data[index];
  }

  private void makeDouble(){
    E [] list2 = (E[]) new Object[data.length*2];
    System.arraycopy(data, 0, list2, 0, data.length);
    data = list2;
  }

}
