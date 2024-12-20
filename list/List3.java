package list;

public interface List3<E>{
    void append(E val);
    void insert(int pos, E val);
    void update(int pos , E val);
    void delete(int pos);
    void clear();
    E getValue(int pos);
    int length();
}
