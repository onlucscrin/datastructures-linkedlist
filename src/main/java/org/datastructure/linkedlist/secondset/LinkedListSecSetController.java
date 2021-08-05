package org.datastructure.linkedlist.secondset;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("api/v1/linkedlist/secondset")
public class LinkedListSecSetController {

    @GetMapping(path = "intersectionPoint", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getIntersectionPoint(){

    }

}
