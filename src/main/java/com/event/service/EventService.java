package com.event.service;

import com.event.common.AjaxResult;
import com.event.domain.EventInfo;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public interface EventService {

    public AjaxResult addEvent(EventInfo eventInfo);

    public AjaxResult modifyEvent(EventInfo eventInfo);

    public AjaxResult findEvents(EventInfo eventInfo);

    public AjaxResult remove(EventInfo eventInfo);

}
