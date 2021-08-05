package org.datastructure.linkedlist.baseProblemSet;

import org.datastructure.linkedlist.model.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1/linkedlist")
public class LinkedListBaseProblemSetController {

    private LinkedLlistBaseProblemSetService linkedLlistBaseProblemSetService;

    @Autowired
    public LinkedListBaseProblemSetController(LinkedLlistBaseProblemSetService linkedLlistBaseProblemSetService){
        this.linkedLlistBaseProblemSetService = linkedLlistBaseProblemSetService;
    }
    @PutMapping(path = "/insert/{position}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertAtEnd(@RequestBody Integer data, @PathVariable int position) {
        try {
            if(position == -1)
                this.linkedLlistBaseProblemSetService.insertAtEnd(data);
            return ResponseEntity.ok().body(this.linkedLlistBaseProblemSetService.getString());
        }catch (Exception e ){
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping(path ="/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getLinkedList(){
        try{
            return ResponseEntity.ok().body("Here you go about LinkedList");
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
    @GetMapping(path ="/<value>", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getLinkedListNode(@PathVariable Integer value){
        try{
            Node<Integer> node = this.linkedLlistBaseProblemSetService.search(value);
            if(Objects.isNull(node))
                return ResponseEntity.notFound().build();
            return ResponseEntity.ok().body(node);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping(path = "/<value>", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteMapping(@PathVariable Integer value) {
        try{
            String result = this.linkedLlistBaseProblemSetService.deleteByValue(value);
            return ResponseEntity.ok().body(result);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(path = "/length", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> getLength() {
        try{
            Integer result = this.linkedLlistBaseProblemSetService.getLength();
            return ResponseEntity.ok().body(result);
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(path = "/loopdetection", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> getLinkedListLoop(){
        try{
            Boolean result = this.linkedLlistBaseProblemSetService.detectLoop();
            return ResponseEntity.ok().body(result);
        }catch (Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(path ="/middleNode", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getMiddleNode(){
        try {
            Object result = this.linkedLlistBaseProblemSetService.findMiddle();
            return ResponseEntity.ok().body(result);
        } catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping(path = "ducplicatesRemoved", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> removeDuplicates(){
        try{
            String result = this.linkedLlistBaseProblemSetService.removeDuplicates();
            return ResponseEntity.ok().body(result);
        }catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }


}
