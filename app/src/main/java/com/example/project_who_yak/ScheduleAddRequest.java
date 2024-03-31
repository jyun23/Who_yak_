package com.example.project_who_yak;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ScheduleAddRequest extends StringRequest {
    final static private String URL ="http://whoyak.dothome.co.kr/ScheduleAdd.php";
    private Map<String, String> parametrs;

    public ScheduleAddRequest(String userID, String schedule,String date, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parametrs = new HashMap<>();
        parametrs.put("userID",userID);
        parametrs.put("schedule",schedule);
        parametrs.put("date", date);
    }

    @Override
    public Map<String,String> getParams(){
        return parametrs;
    }
}