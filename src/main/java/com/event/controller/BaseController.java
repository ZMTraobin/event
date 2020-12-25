package com.event.controller;
/*
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;

import java.util.List;

public class BaseController {


    *//**
     * 设置请求分页数据
     *//*
    protected void startPage(Integer pageNum, Integer pageSize) {
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = pageDomain.getOrderBy();
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    *//**
     * 响应请求分页数据
     *//*
    @SuppressWarnings({"rawtypes", "unchecked"})
    protected TableDataInfo getDataTable(List<?> list) {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }


}*/
