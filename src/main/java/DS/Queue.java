package DS;

public class Queue<T> {
  private Node<T> first = null;
  
  private Node<T> last = null;
  
  public boolean isEmpty() {
    return (this.first == null);
  }
  
  public void insert(T x) {
    Node<T> k = new Node<>(x);
    if (this.first == null) {
      this.first = k;
      this.last = this.first;
    } else {
      this.last.setNext(k);
      this.last = this.last.getNext();
    }
  }
  
  public T remove() {
    T x = this.first.getValue();
    this.first = this.first.getNext();
    return x;
  }
  
  public T head() {
    return this.first.getValue();
  }
  
  public String toString() {
    if (isEmpty())
      return "[]";
    insert(null);
    StringBuilder s = new StringBuilder("[");
    T temp = remove();
    while (temp != null) {
      s.append(temp.toString()).append(",");
      insert(temp);
      temp = remove();
    }
    s = new StringBuilder(s.substring(0, s.length() - 1) + "]");
    return s.toString();
  }
}
