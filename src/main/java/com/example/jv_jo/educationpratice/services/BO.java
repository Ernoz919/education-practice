package com.example.jv_jo.educationpratice.services;

import android.app.Activity;

import com.example.jv_jo.educationpratice.repository.QuestionRepository;

/**
 * Created by jv_jo on 01/05/2016.
 */
public class BO {

    private QuestionRepository questionRepository;

    public BO(Activity activity){
        questionRepository = new QuestionRepository(activity);
        questionRepository.defined();
    }

}
