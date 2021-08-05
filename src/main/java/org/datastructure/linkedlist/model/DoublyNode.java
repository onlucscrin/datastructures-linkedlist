package org.datastructure.linkedlist.model;

public class DoublyNode<T> {
    private T data;
    private DoublyNode nextNode;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode nextNode) {
        this.nextNode = nextNode;
    }
}
