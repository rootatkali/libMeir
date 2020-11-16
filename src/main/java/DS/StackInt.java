package DS;

public class StackInt {
  private NodeInt first = null;
  
  public boolean isEmpty() {
    return (this.first == null);
  }
  
  public void push(int x) {
    NodeInt temp = new NodeInt(x);
    temp.setNext(this.first);
    this.first = temp;
  }
  
  public int pop() {
    int x = this.first.getValue();
    this.first = this.first.getNext();
    return x;
  }
  
  public int top() {
    return this.first.getValue();
  }
  
  public String toString() {
    StringBuilder str = new StringBuilder("[");
    NodeInt pos = this.first;
    while (pos != null) {
      str.append(pos.getValue());
      if (pos.getNext() != null)
        str.append(",");
      pos = pos.getNext();
    }
    str.append("]");
    return str.toString();
  }
}
