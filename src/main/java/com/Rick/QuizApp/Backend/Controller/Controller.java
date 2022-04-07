package com.Rick.QuizApp.Backend.Controller;

import com.Rick.QuizApp.Backend.Model.ResponseCodes;
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
        ArrayList<String> temp = service.getMessages();
        response.setStatusMessage("success");
        response.setReturningData(temp);
        return response;
    }
    @PostMapping
    public ResponseModel addMessages(@RequestParam String m){
        ResponseModel response = new ResponseModel<>();
        if(m.isBlank()){
            ResponseCodes error = ResponseCodes.INVALIDMSGINPUT;
            response.setStatusMessage(error.getDesc());
            response.setErrorCode(error.getErrorCode());
            return response;
        }

        ResponseCodes responseData = service.addMessage(m);
        response.setStatusMessage(responseData.getDesc());
        response.setErrorCode(responseData.getErrorCode());
        return response;

    }
    @DeleteMapping
    public ResponseModel deleteMessage(@RequestParam int position){
        ResponseModel response = new ResponseModel<>();
        ResponseCodes responseData = service.deleteMessage(position);
        response.setStatusMessage((responseData.getDesc()));
        response.setErrorCode(responseData.getErrorCode());
        return response;
    }
    @PatchMapping
    public ResponseModel editMessage(@RequestParam String newMsg, @RequestParam int position){
        ResponseModel response = new ResponseModel<>();
        if(newMsg.isBlank()){
            ResponseCodes error = ResponseCodes.INVALIDMSGINPUT;
            response.setStatusMessage(error.getDesc());
            response.setErrorCode(error.getErrorCode());
            return response;
        }
        ResponseCodes responseData = service.changeMessage(newMsg,position);
        response.setStatusMessage(responseData.getDesc());
        response.setErrorCode(responseData.getErrorCode());
        return response;

    }



}
