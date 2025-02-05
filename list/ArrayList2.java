package list;

public class ArrayList2 <E> implements List2 <E> {

    int listSize;
    E[] data;

    public ArrayList2(int capacity) {
        listSize = 0;
        data = (E[]) new Object[capacity];
    }


    @Override
    public void insert(int pos, E item) {
        for (int i = listSize; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = item;
        listSize += 1;
    }

    @Override
    public void append(E item) {
        insert(listSize, item);
    }

    @Override
    public void remove(int pos) {
        for (int i = pos; i < listSize; i++) {
            data[i] = data[i + 1];
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
        return listSize;
    }

    @Override
    public void update(int pos, E item) {
        data[pos] = item;
    }

    @Override
    public ListIterator2<E> listIterator() {
        return new ListIterator2<E>() {
            int curr = 0;

            @Override
            public boolean hasNext() {
                if (curr < listSize)
                    return true;
                else
                    return false;
            }

            @Override
            public E next() {
                return data[curr++];
            }

            @Override
            public boolean hasPrevious() {
                if (curr > 0)
                    return true;
                else
                    return false;
            }

            @Override
            public E previous() {
                return data[--curr];
            }

        };
    }

}
