package edu.handong.csee.isel.clami_;

import weka.core.Instances;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataCluster {
	private Instances instances;
	private int[][] complexity;
	
	public Instances loadArff(String path){
		Instances instances=null;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			instances = new Instances(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		instances.setClassIndex(instances.numAttributes()-1);
		System.out.println("*DataCluster class*");
		System.out.println("");
		System.out.println("-loadArff method");
		System.out.println("instances와 metrices 데이터 수집");
		System.out.println("");
		
		return instances;
	}
	
}
