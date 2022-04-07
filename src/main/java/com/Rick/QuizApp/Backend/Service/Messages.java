package com.Rick.QuizApp.Backend.Service;

import com.Rick.QuizApp.Backend.Model.ResponseCodes;

import java.util.ArrayList;

public interface Messages {
    ArrayList getMessages();
    ResponseCodes changeMessage(String m, int position);
    ResponseCodes deleteMessage(int position);
    ResponseCodes addMessage(String m);
}
