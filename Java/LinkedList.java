class LinkedList{
  private int data;
  private LinkedList next;
  public LinkedList(int value){
    data = value;
    next = null;
  }
  public int getData(){
    return data;
  }
  public void setData(int data){
  this.data = data;
}
public LinkedList getNext(){
  return next;
}
public void setNext(LinkedList node){
  next  = node;
}

}
