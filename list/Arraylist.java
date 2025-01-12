package list;


public class Arraylist <E> implements List <E> {
	
	int listSize;
	E[] data;
	
	Arraylist(int capacity){
		listSize = 0;
		data = (E[])new Object[capacity];
	}


	@Override
	public void clear() {
		listSize =0;
		
	}

	@Override
	public void insert(int pos, E item) {
		for (int i=listSize - 1 ; i>=pos; i--) {
			data[i+1] = data[i];
		}
		data[pos] = item;
		listSize++;
		
	}

	@Override
	public void append(E item) {
		insert(listSize , item);
	}

	@Override
	public void update(int pos, E item) {
		data[pos] = item;
	}

	@Override
	public E getValue(int pos) {
		return data[pos];
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return listSize;
	}

	@Override
	public void remove(int pos) {
		for (int i =pos; i<listSize-1;i++) {
			data[i] = data[i+1];
			System.out.println(data[i+1]);
		}
		listSize--;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new ListIterator<E>() {
			int curr = 0;

			@Override
			public boolean hasNext() {
				return curr < listSize;
			}

			@Override
			public E next() {
				// 현재 값을 집어넣는 형태

				return data[curr++];
			}

			@Override
			public boolean hasPrevious() {
				return curr > 0;
			}

			@Override
			public E previous() {
				return data[--curr];
			}


		};
	}

}
