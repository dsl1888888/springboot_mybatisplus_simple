package com.wzb.service;

import java.util.HashMap;
import java.util.List;import javax.management.BadBinaryOpValueExpException;

/**
 * @author Satsuki
 * @time 2019/8/27 17:51
 * @description:
 * 一些模拟数据库事务的方法
 */
public interface TestService {
    public void ins();
    public void del();
    public void upd();
    public void sel();
    
    public String query();
    public String page( int offset, int limit );
}
