package com.universe.demo.activitidemo.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class BaoxiaoListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("张三");
    }
}
