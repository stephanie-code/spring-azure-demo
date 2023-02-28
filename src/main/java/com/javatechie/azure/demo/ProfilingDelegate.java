package com.javatechie.azure.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("profiling_process")
public class ProfilingDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {

        String profile = (String) execution.getVariable("profiledOutput");
        System.out.println("\nYour profile is " + profile);
    }

}
