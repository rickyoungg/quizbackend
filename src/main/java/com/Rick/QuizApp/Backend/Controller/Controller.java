package com.Rick.QuizApp.Backend.Controller;

import com.Rick.QuizApp.Backend.Model.ResponseModel;
import com.Rick.QuizApp.Backend.Service.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/test")
public class Controller {
    @Autowired
    private Messages service;

    @GetMapping
    public ResponseModel<ArrayList<String>> getMessages(){
        ResponseModel<ArrayList<String>> response = new ResponseModel<>();

        response.setStatusMessage("success");
        response.setReturningData(service.getMessages());
        return response;
    }
    @PostMapping
    public ResponseModel addMessages(@RequestParam String m){
        ResponseModel response = new ResponseModel<>();
        service.addMessage(m);
        response.setStatusMessage("success");
        return response;

    }
    @DeleteMapping
    public ResponseModel deleteMessage(@RequestParam int position){
        ResponseModel response = new ResponseModel<>();
        service.deleteMessage(position);
        response.setStatusMessage("success");
        return response;
    }
    @PatchMapping
    public ResponseModel editMessage(@RequestParam String newMsg, @RequestParam int position){
        ResponseModel response = new ResponseModel<>();
        service.changeMessage(newMsg, position);
        response.setStatusMessage("success");
        return response;

    }



}
