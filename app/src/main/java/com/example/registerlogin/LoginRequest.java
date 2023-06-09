package com.example.registerlogin;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {
    //서버 URL 설정(php파일 연동)
    final static private String URL = "http://bpmduduhgee.dothome.co.kr/Login.php";
    //final static private String URL = "https://591f-211-227-109-84.ngrok.io/Login.php";
    private Map<String ,String >map;

    public LoginRequest(String uerID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        map= new HashMap<>();
        map.put("uerID",uerID);
        map.put("userPassword", userPassword);

    }


    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
