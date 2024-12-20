package list;

public interface List4 <E>{
  public int length();
  public void add(E e);
  public void insert(int index, E e);
  public void update(int index, E e);
  public void clear();
  public E remove(int index);
  public E getValue(int index);

}
