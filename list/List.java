package list;

public interface List <E>{
	public void clear();
	public void insert(int pos, E item);
	public void append(E item);
	public void update(int pos ,E item);
	public E getValue(int pos);
	public int length();
	public void remove(int pos);

}
