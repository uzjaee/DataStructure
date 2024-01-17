package list;

public class ArrayList2 <E> implements List2 <E>{
    int listSize ;
    E [] data ;

    public ArrayList2(int capacity) {
        listSize = 0;
        data = (E[]) new Object[capacity];
    }


    @Override
    public void insert(int pos, E item) {
        for (int i =listSize; i >pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = item;
        listSize +=1;
    }
    @Override
    public void append(E item) {
        insert(listSize,item);
    }

    @Override
    public void remove(int pos) {
        for (int i = pos; i<listSize; i++){
            data[i] =data[i+1];
        }
        listSize--;
    }

    @Override
    public E getValue(int pos) {
        return data[pos];
    }

    @Override
    public void clear() {
        listSize = 0;
    }

    @Override
    public int length() {
        return 0;
    }
}
