package com.event.controller;

import com.event.common.AjaxResult;
import com.event.domain.EventInfo;
import com.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping("addEvent")
    public AjaxResult addEvent(@RequestBody EventInfo eventInfo){
        return eventService.addEvent(eventInfo);
    }
    @RequestMapping("modifyEvent")
    public AjaxResult modifyEvent(@RequestBody EventInfo eventInfo){
        return eventService.modifyEvent(eventInfo);
    }
    @RequestMapping("findEvents")
    public AjaxResult findEvents(@RequestBody EventInfo eventInfo){
        return eventService.findEvents(eventInfo);
    }
    @RequestMapping("remove")
    public AjaxResult remove(@RequestBody EventInfo eventInfo){
        return eventService.remove(eventInfo);
    }
}
