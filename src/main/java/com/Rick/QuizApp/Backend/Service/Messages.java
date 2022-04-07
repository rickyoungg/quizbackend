package com.Rick.QuizApp.Backend.Service;

import java.util.ArrayList;

public interface Messages {
    ArrayList getMessages();
    void changeMessage(String m, int position);
    void deleteMessage(int position);
    void addMessage(String m);
}
