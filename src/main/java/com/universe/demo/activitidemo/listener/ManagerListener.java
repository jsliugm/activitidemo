package com.universe.demo.activitidemo.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class ManagerListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        String branch = (String)delegateTask.getExecution().getVariable("branchCode");
        if("3010100".equals(branch))
        delegateTask.setAssignee("王五");
        else delegateTask.setAssignee("李四");
    }
}
