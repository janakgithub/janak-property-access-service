package com.janakprj.mircroservices.janakpropertyaccessservice.controller;

import com.janakprj.mircroservices.janakpropertyaccessservice.beans.PropertyAccessBean;
import com.janakprj.mircroservices.janakpropertyaccessservice.beans.PropertyAccessValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertyFileAccessController {

    @Autowired
    PropertyAccessBean propertyAccessBean;

    @RequestMapping("access")
    public PropertyAccessValue accessPropertyFiles(){

        return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDesc());
    }

}
