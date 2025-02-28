package stack;

public class AStack <E> implements Stack<E> {

  int maxsize;
  int top;
  E [] listArray;

  public AStack(int capacity) {
    maxsize = capacity;
    listArray = (E[]) new Object[maxsize];
    top = -1;
  }

  @Override
  public void push(E it) {

  }

  @Override
  public E pop() {
    return null;
  }

  @Override
  public E top() {
    return null;
  }

  @Override
  public int size() {
    return 0;
  }

}
