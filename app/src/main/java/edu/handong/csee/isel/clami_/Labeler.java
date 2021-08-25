package edu.handong.csee.isel.clami_;
import weka.core.Instances;

public class Labeler {
private int median;
	
	private void calculateMedians(Instances instances) {
		int value;
		value = 0;
		System.out.println("calculateMedian method in findHigherMetricThanMedian");
		System.out.println("각각의 metric의 median을 구한다.");
		System.out.println("");
		median = value;
	}
	
	public int getMedian(int metric) {
		return median;
	}
	
	private void findHigherMetricThanMedian(Instances instances) {
		calculateMedians(instances);
		System.out.println("findHigherMetricThanMedian method in groupInstances");
		System.out.println("metric내에서 median보다 높은 값들을 찾아 표시한다.");
		System.out.println("");
		
	}
	
	public void groupInstances(Instances instances) {
		findHigherMetricThanMedian(null);
		System.out.println("groupInstances method");
		System.out.println("instance에 있는 표시된 값들 (metric에서 중간값보다 높아 표시된)의 개수(=k)에 따라 그룹을 나눈다.");
		System.out.println("");
		
	}
	
	public Instances labelInstance(Instances instances) {
		System.out.println("labelInstance method");
		System.out.println("다시 k에 따라 두 개의 그룹으로 나눈다. 상위의 그룹은 B로 label, 하위의 그룹은 C로 label한다.");
		System.out.println("");
		return null;
	}

}
