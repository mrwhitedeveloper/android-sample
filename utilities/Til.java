package com.mrwhitedeveloper.android.sample.utilities;

import com.google.android.material.textfield.TextInputLayout;
/**
 * Created by mrwhitedeveloper on 26-May-20.
 */
public class Til {
    public static String get(TextInputLayout textInputLayout){
        return textInputLayout.getEditText().getText().toString().trim();
    }
    public static void set(TextInputLayout textInputLayout,String text){
        textInputLayout.getEditText().setText(text);
    }
    public static void clear(TextInputLayout textInputLayout){
        set(textInputLayout,"");
    }
    public static boolean required(TextInputLayout textInputLayout,String text){
        boolean res;
        if(get(textInputLayout).isEmpty()){
            textInputLayout.setError(text );
            res=false;
        }else{
            textInputLayout.setErrorEnabled(false);
            res=true;
        }
        return res;
    }
    public static boolean mobile( TextInputLayout textInputLayout,String text){
        boolean res;
        if(get(textInputLayout).length()!=10 ){
            textInputLayout.setError(text );
            res=false;
        }else{
            textInputLayout.setErrorEnabled(false);
            res=true;
        }
        return res;
    }
}
