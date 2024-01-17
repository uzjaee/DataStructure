package list;

public interface List2<E> {
    public void insert(int pos, E item);
    public void append(E item);
    public void remove(int pos);
    public E getValue(int pos);
    public void clear();
    public int length();

}
