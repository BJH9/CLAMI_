package edu.handong.csee.isel.clami_;
import weka.core.Instances;

public class Labeler {
private int median;
	
	private void calculateMedians(Instances instances) {
		int value;
		value = 0;
		System.out.println("calculateMedian method in findHigherMetricThanMedian");
		System.out.println("������ metric�� median�� ���Ѵ�.");
		System.out.println("");
		median = value;
	}
	
	public int getMedian(int metric) {
		return median;
	}
	
	private void findHigherMetricThanMedian(Instances instances) {
		calculateMedians(instances);
		System.out.println("findHigherMetricThanMedian method in groupInstances");
		System.out.println("metric������ median���� ���� ������ ã�� ǥ���Ѵ�.");
		System.out.println("");
		
	}
	
	public void groupInstances(Instances instances) {
		findHigherMetricThanMedian(null);
		System.out.println("groupInstances method");
		System.out.println("instance�� �ִ� ǥ�õ� ���� (metric���� �߰������� ���� ǥ�õ�)�� ����(=k)�� ���� �׷��� ������.");
		System.out.println("");
		
	}
	
	public Instances labelInstance(Instances instances) {
		System.out.println("labelInstance method");
		System.out.println("�ٽ� k�� ���� �� ���� �׷����� ������. ������ �׷��� B�� label, ������ �׷��� C�� label�Ѵ�.");
		System.out.println("");
		return null;
	}

}
