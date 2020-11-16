package DS;

public class Stack<T> {
  private Node<T> first = null;
  
  public boolean isEmpty() {
    return (this.first == null);
  }
  
  public void push(T x) {
    Node<T> temp = new Node<>(x);
    temp.setNext(this.first);
    this.first = temp;
  }
  
  public T pop() {
    T x = this.first.getValue();
    this.first = this.first.getNext();
    return x;
  }
  
  public T top() {
    return this.first.getValue();
  }
  
  public String toString() {
    StringBuilder str = new StringBuilder("[");
    Node<T> pos = this.first;
    while (pos != null) {
      str.append(pos.getValue().toString());
      if (pos.getNext() != null)
        str.append(",");
      pos = pos.getNext();
    }
    str.append("]");
    return str.toString();
  }
}