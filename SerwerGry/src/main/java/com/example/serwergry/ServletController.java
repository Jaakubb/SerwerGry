package com.example.serwergry;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServletController {

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.POST
    )
    public String hello(@RequestBody()String i){
        JSONObject jsonObject = new JSONObject(i);
jsonObject.get("hp");

        return "hello "+i;

    }


}
