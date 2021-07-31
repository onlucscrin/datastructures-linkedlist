package org.datastructure.linkedlist.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LinkedList<T> {
    Node<T> firstNode;
    Node<T> lastNode;
    int length;

    public void insertAtEnd(T data){
        Node<T> node = new Node<>();
        node.setData(data);
        if(Objects.isNull(firstNode))
            firstNode = node;
        else
            lastNode.setNextNode(node);
        length++;
        lastNode = node;
    }

    public Node<T> search(T data){
        Node<T> tempNode = firstNode;
        while(tempNode != null) {
            if (tempNode.getData().equals(data)) {
                return tempNode;
            }
            else
                tempNode = tempNode.getNextNode();
        }
        return null;
    }


    public String deleteByValue(T data) {
        Node<T> tempNode = firstNode;
        Node<T> prevNode = firstNode;
        while(tempNode!=null) {
            if(tempNode.getData().equals(data)) {
                prevNode.setNextNode(tempNode.getNextNode());
                length--;
            }
            prevNode = tempNode;
            tempNode = tempNode.getNextNode();
        }
        return this.getLinkedList().toString();
    }

    public String getLinkedList() {
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> tempNode = firstNode;
        while(tempNode != null) {
            stringBuilder.append(tempNode.getData() +", ");
            tempNode = tempNode.getNextNode();
        }
        return stringBuilder.toString();
    }

    public Integer getLength(){
        return this.length;
    }
}
