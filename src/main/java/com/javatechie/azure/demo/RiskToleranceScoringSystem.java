package com.javatechie.azure.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("riskToleranceScoring")

public class RiskToleranceScoringSystem implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("\n\n****** Risk Tolerance System Completed ******");

        Integer friends_desc_score = (Integer) execution.getVariable("friends_desc_score");
        Integer unexpectedSumReceivedScore = (Integer) execution.getVariable("unexpectedSumReceivedScore");
        Integer investmentExpScore = (Integer) execution.getVariable("investment_exp_score");
        Integer decision_on_bonds_Score = (Integer) execution.getVariable("decision_on_bonds_score");
        Integer inflation_risk_attitude_Score = (Integer) execution.getVariable("inflation_risk_attitude_score");
        Integer investment_goals_Score = (Integer) execution.getVariable("investment_goals_score");
        Integer q7_Score = (Integer) execution.getVariable("q7_score");
        Integer q9_Score = (Integer) execution.getVariable("q9_score");


        String output = "\nFriends description on you Score- " + friends_desc_score + "\nUnexpected Money Received Score- " + unexpectedSumReceivedScore + "\nInvestment Experience- " +investmentExpScore +"\nDecision on Bonds- " +decision_on_bonds_Score+"\nAttitude towards Inflation and Risk- " + inflation_risk_attitude_Score +"\nInvestment Goals- " + investment_goals_Score + "\nQ7- " + q7_Score + "\nQ9- " + q9_Score;
        System.out.println("Scores:" + output);
        Integer totalScore = friends_desc_score + unexpectedSumReceivedScore + investmentExpScore + decision_on_bonds_Score + inflation_risk_attitude_Score + investment_goals_Score + q7_Score + q9_Score;
        System.out.println("\nRisk Tolerance Score: " + totalScore);


        execution.setVariable("rtScore", totalScore);

    }
}