package com.Rick.QuizApp.Backend.Service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class MessagesImpl implements Messages{

    private ArrayList<String> messages;


    @Override
    public void addMessage(String message){
        if(messages == null){
            messages = new ArrayList<>();
        }
        messages.add(message);
    }
    @Override
    public void deleteMessage(int position){
        if(messages == null){
            return;
        }
        if((messages.size() > 0) && (0 <= position) && (position <= messages.size())){
            messages.remove(position);
        }
    }
    @Override
    public void changeMessage(String message, int position){
        if(messages == null){
            return;
        }
        if((messages.size() >0) && (0 <= position) && (position <= messages.size())){
            messages.set(position, message);
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
