package com.event.repository;

import com.event.common.AjaxResult;
import com.event.domain.EventInfo;

import java.util.List;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
public interface EventRepository {

    public int addEvent(EventInfo eventInfo);

    public int modifyEvent(EventInfo eventInfo);

    public List<EventInfo> findEvents(EventInfo eventInfo);

    public int remove(EventInfo eventInfo);
}
