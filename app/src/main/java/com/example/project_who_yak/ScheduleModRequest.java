package com.example.project_who_yak;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ScheduleModRequest extends StringRequest {
    final static private String URL ="http://whoyak.dothome.co.kr/ScheduleMod.php";
    private Map<String, String> parametrs;

    public ScheduleModRequest(String schedule_id, String schedule_update,  Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parametrs = new HashMap<>();
        parametrs.put("schedule_update",schedule_update);
        parametrs.put("schedule_id",schedule_id);
    }

    @Override
    public Map<String,String> getParams(){
        return parametrs;
    }
}