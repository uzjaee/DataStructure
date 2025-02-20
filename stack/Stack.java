package stack;

public interface Stack<E>{
  public void push(E it);
  public E pop();
  public E top();
  public int size();
}
