package edu.handong.csee.isel.clami_;
import weka.core.Instances;

public class MetricSelector {
	//TODO
	private String violation;
	private int metricViolationScore;
	private int[][] selectedMetricesComplexity;
	
	public String[] calculateViolations(Instances instances) {
		System.out.println("*MetricSelector class*");
		System.out.println("");
		System.out.println("-calculateViolation method");
		System.out.println("metric���� violation�� ���Ѵ�");
		System.out.println("");
		return null;
	}
	public String[] calculateMVS(Instances instances) {
		//calculateViolations(instances);
		System.out.println("-calculateMVS method");
		System.out.println("metric���� MVS�� ���Ѵ�");
		System.out.println("");
		return null;
	}
	public Instances selectMetric(String[] cal) {
		System.out.println("-selectMetric method");
		System.out.println("metricSelection�� �Ѵ�.");
		System.out.println("");
		return null;
	}

}
