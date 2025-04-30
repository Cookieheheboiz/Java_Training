package com.vti.frontend;

import com.vti.backend.LogUtils;
import com.vti.entity.*;

public class Program5_question2 {
    public static void main(String[] args) {
        try {
            int x = 7 / 0;
        } catch (Exception e) {
            MyException exception_ = new MyException("Cannot divide 0","Nothing can divide 0", e);
            LogUtils.writeLog(exception_);
        }
        LogUtils.readLog();
    }
}
