package com.event.common;

import java.util.HashMap;

/**
 * 返回类
 */
public class AjaxResult extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * 初始化一个新建的对象
     */
    public AjaxResult() {
    }

    /**
     * 返回错误信息
     *
     * @return
     */
    public static AjaxResult error() {
        return error(1, "操作失败");
    }

    /**
     * 返回错误信息
     *
     * @param msg
     * @return
     */
    public static AjaxResult error(String msg) {
        return error(1, msg);
    }

    /**
     * 返回错误信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static AjaxResult error(int code, String msg) {
        AjaxResult result = new AjaxResult();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    /**
     * 返回成功信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static AjaxResult success(int code, String msg, Object data) {
        AjaxResult result = new AjaxResult();
        result.put("code", code);
        result.put("msg", msg);
        result.put("data", data);
        return result;
    }

    /**
     * 返回成功信息
     *
     * @param
     * @param
     * @return
     */
    public static AjaxResult success(Object data) {
        AjaxResult success = AjaxResult.success();
        success.put("data", data);
        return success;
    }

    /**
     * 返回成功信息
     *
     * @param code
     * @param msg
     * @return
     */
    public static AjaxResult success(int code, String msg) {
        AjaxResult result = new AjaxResult();
        result.put("code", code);
        result.put("msg", msg);
        return result;
    }

    /**
     * 返回成功信息
     *
     * @param msg
     * @return
     */
    public static AjaxResult success(String msg) {
        return success(0, msg);
    }

    /**
     * 返回成功信息
     *
     * @return
     */
    public static AjaxResult success() {
        return success(0, "操作成功");
    }

    /**
     * 重写put方法
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Object put(String key, Object value) {
        super.put(key, value);
        return this;

    }
}
