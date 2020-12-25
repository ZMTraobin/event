package com.event.service.impl;

import com.event.common.AjaxResult;
import com.event.domain.EventInfo;
import com.event.repository.EventRepository;
import com.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;

    @Override
    public AjaxResult addEvent(EventInfo eventInfo) {
        if (eventRepository.addEvent(eventInfo) == 1) {
            return AjaxResult.success();
        }
        return AjaxResult.error();
    }

    @Override
    public AjaxResult modifyEvent(EventInfo eventInfo) {
        if (eventRepository.modifyEvent(eventInfo) == 1) {
            return AjaxResult.success();
        }
        return AjaxResult.error();
    }

    @Override
    public AjaxResult findEvents(EventInfo eventInfo) {
        List<EventInfo> eventInfos = null;
        if ((eventInfos = eventRepository.findEvents(eventInfo)) != null) {
            return AjaxResult.success(eventInfos);
        }
        return AjaxResult.error();
    }

    @Override
    public AjaxResult remove(EventInfo eventInfo) {
        if (eventRepository.remove(eventInfo) == 1) {
            return AjaxResult.success();
        }
        return AjaxResult.error();
    }
}
