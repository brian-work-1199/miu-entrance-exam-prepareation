package DSA;

public class LinkedList <E>{
    int length;
    Node<E> head;
    Node<E> tail;
    LinkedList(E data){
        Node<E> newNode = new Node<>(data);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public String printList(){
        Node<E> temp = this.head;
        String string = "";
        while(temp != null){
            string += temp.data + ", ";
            temp = temp.next;
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }else{
            string = "[]";
        }
        return string;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean append(E data){
        Node<E> newNode = new Node<>(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
            this.length += 1;
        }
        return true;
    }

    public Node<E> pop(){
        if(this.length == 0) return null;
        Node<E> temp = this.head;
        Node<E> pre = this.head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        this.tail = pre;
        this.tail.next = null;
        this.length -= 1;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public boolean prepend(E data){
        Node<E> newNode = new Node<>(data);
        if (this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length += 1;
        return true;
    }

    public Node<E> popFirst(){
        if(this.length == 0) return null;
        Node<E> temp = this.head;
        this.head = temp.next;
        temp.next = null;
        this.length -= 1;
        if(this.length == 0){
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public Node<E> get(int index){
        if(index < 0 || index > this.length) return null;
        Node<E> temp = this.head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, E data){
        Node<E> temp = get(index);
        if (temp != null) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public boolean insert (int index, E data) {
        if (index < 0 || index > this.length) return false;
        if (index == 0) return this.prepend(data);
        if (index == this.length) return this.append(data);
        Node<E> newNode = new Node<>(data);
        Node<E> pre = this.get(index - 1);
        newNode.next = pre.next;
        pre.next = newNode;
        this.length += 1;
        return true;
    }

    public Node<E> remove(int index) {
        if (index < 0 || index > this.length) return null;
        if (index == 0) return this.popFirst();
        if (index == this.length - 1) return this.pop();
        Node<E> pre = this.get(index - 1);
        Node<E> temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        this.length -= 1;
        return temp;
    }
}
