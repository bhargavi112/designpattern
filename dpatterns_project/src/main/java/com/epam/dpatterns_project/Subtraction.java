package com.epam.dpatterns_project;

public class Subtraction implements StrategyPattern{
	@Override
	   public int performOp(int num1,int num2) {
	      return num1-num2;
	   }
}
