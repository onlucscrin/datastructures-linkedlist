package org.datastructure.linkedlist.baseProblemSet;

import org.datastructure.linkedlist.model.LinkedList;
import org.datastructure.linkedlist.model.Node;
import org.springframework.stereotype.Service;

@Service
public class LinkedLlistBaseProblemSetService<T> {
    private LinkedList<T> linkedList = new LinkedList<T>();

    public LinkedList<T> insertAtEnd(T data){
        linkedList.insertAtEnd(data);
        return linkedList;
    }

    public Node<T> search(T data) {
        return linkedList.search(data);
    }

    public String deleteByValue(T data) {
        return linkedList.deleteByValue(data);
    }

    public Integer getLength() {
        return linkedList.getLength();
    }

    public String getString(){
        return linkedList.getLinkedList();
    }
    public boolean detectLoop(){
        return linkedList.detectLoop();
    }
    public Object findMiddle(){
        return linkedList.getFindMiddle();
    }

    public String removeDuplicates(){
        return linkedList.removeDuplicates();
    }

}
