package com.javatechie.azure.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("riskAttitudeScoring")
public class RiskAttitudeScoringSystem implements JavaDelegate{
    private final Logger LOGGER = LoggerFactory.getLogger(RiskAttitudeScoringSystem.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("\n\n****** Risk Attitude System ******");

        Integer ageScore = (Integer) execution.getVariable("age_score");
        Integer msScore = (Integer) execution.getVariable("marital_status_score");
        Integer childrenCountScore = (Integer) execution.getVariable("children_count_score");
        Integer stabilityScore = (Integer) execution.getVariable("stability_score");
        Integer emerg_FundScore = (Integer) execution.getVariable("emerg_fund_score");
        Integer monthlyIncome_InvestableScore = (Integer) execution.getVariable("monthly_income_investable_score");
        Integer jobStatusScore = (Integer) execution.getVariable("job_status_score");
        Integer incomeLiabilityScore = (Integer) execution.getVariable("incomeLiabilityScore");
        Integer annualTakeHomeSalaryScore = (Integer) execution.getVariable("annual_take_home_salary_score");


        String output = "\nAge Score- " + ageScore + "\nMarital Score- " + msScore + "\nChildren count Score- " + childrenCountScore + "\nJob Stability Score- " + stabilityScore + "\nEmergency Fund Score- " + emerg_FundScore + "\nMonthly Income Investable Score- " + monthlyIncome_InvestableScore + "\nJob Status Score- " + jobStatusScore + "\nIncome Liability Score- " + incomeLiabilityScore + "\nAnnual Take Home Salary Score- " + annualTakeHomeSalaryScore ;
        System.out.println("Scores:" + output);
        Integer totalScore = ageScore + msScore + childrenCountScore + stabilityScore + emerg_FundScore + monthlyIncome_InvestableScore + jobStatusScore + incomeLiabilityScore + annualTakeHomeSalaryScore;
        System.out.println("\nRisk Attitude Score: " + totalScore);

        execution.setVariable("raScore", totalScore);

    }
}
