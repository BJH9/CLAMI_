package edu.handong.csee.isel.clami_;
import weka.core.Instances;

public class MetricSelector {
	private String violation;
	private int metricViolationScore;
	private int[][] selectedMetricesComplexity;
	
	public String[] calculateViolations(Instances instances) {
		System.out.println("calculateViolation method");
		System.out.println("metric별로 violation을 구한다");
		System.out.println("");
		return null;
	}
	public String[] calculateMVS(Instances instances) {
		System.out.println("calculateMVS method");
		System.out.println("metric별로 MVS을 구한다");
		System.out.println("");
		calculateViolation(instances);
		return null;
	}
	public Instances selectMetric(String[] cal) {
		System.out.println("selectMetric method");
		System.out.println("metricSelection을 한다.");
		System.out.println("");
		return null;
	}

}
