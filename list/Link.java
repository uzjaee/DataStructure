package list;

public class Link <E>{
    public E item;
    public Link<E> next;
    public Link(E item, Link<E> next){
        this.item = item;
        this.next = next;
    }

}
