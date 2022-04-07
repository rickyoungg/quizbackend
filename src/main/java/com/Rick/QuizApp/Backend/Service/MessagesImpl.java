package com.Rick.QuizApp.Backend.Service;
import com.Rick.QuizApp.Backend.Model.ResponseCodes;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MessagesImpl implements Messages{

    private ArrayList<String> messages;


    @Override
    public ResponseCodes addMessage(String message){
        if(messages == null){
            messages = new ArrayList<>();
        }
        messages.add(message);
        return ResponseCodes.SUCCESS;
    }
    @Override
    public ResponseCodes deleteMessage(int position){
        if(messages == null){
            return ResponseCodes.ARRAYNOTINITIALIZED;
        }
        if((messages.size() > 0) && (0 <= position) && (position < messages.size())){
            messages.remove(position);
            return ResponseCodes.SUCCESS;
        }
        return ResponseCodes.POSITIONERROR;

    }
    @Override
    public ResponseCodes changeMessage(String message, int position){
        if(messages == null){
            return ResponseCodes.ARRAYNOTINITIALIZED;
        }
        if((messages.size() >0) && (0 <= position) && (position < messages.size())){
            messages.set(position, message);
            return ResponseCodes.SUCCESS;
        }
        else{
            return ResponseCodes.POSITIONERROR;
        }

    }
    @Override
    public ArrayList getMessages(){
        if(messages == null){
            messages = new ArrayList<>();
        }
        return messages;
    }

    public void test(){

    }
}
