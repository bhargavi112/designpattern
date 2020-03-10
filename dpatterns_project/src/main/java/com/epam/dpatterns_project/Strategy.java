package com.epam.dpatterns_project;

public class Strategy {
	private StrategyPattern strategy;
	   public Strategy(StrategyPattern strategy){
	      this.strategy=strategy;
	   }
	   public int runStrategy(int num1,int num2){
	      return strategy.performOp(num1,num2);
	   }
}
