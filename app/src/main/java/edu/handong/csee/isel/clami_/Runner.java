/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package edu.handong.csee.isel.clami_;

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import weka.core.Instances;

public class Runner {
	private boolean help;
	private String instancesFilePath;
	private String instancesFile;
	private Instances instances;

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.run(args);
	}
	
	private void run(String[] args) {
		Options options = createOptions();
		
		if(parseOption(options, args)) {
			if(help) {
				printHelp(options);
				return;
			}
			instancesFile = instancesFilePath;
			
		}
		
		DataCluster dataCluster = new DataCluster();
		Labeler labeler = new Labeler();
		MetricSelector metricSelector = new MetricSelector();
		InstanceSelector instanceSelector = new InstanceSelector();
		DatasetTester datasetTester = new DatasetTester();
		
		//DataCluster class
		 //복잡도를 2차원배열로 생성한다.
		dataCluster.loadArff(instancesFile);
		
		//Labeler class
		 //instance를 metric value higher than median의 개수(=k) 별로 그룹화한다.
		labeler.groupInstances(instances);
		 //위에서 그룹화된 instance를 또다시 두개의 그룹으로 나눈다. k를 기준으로 top half와 bottom half로 나눈다. Label bug or clean, a top half is bug label while a bottom half is clear label.
		labeler.labelInstance(instances);
		
		//MetricSelector class
		metricSelector.calculateViolations(instances);
		metricSelector.calculateMVS(instances);
		 //violation과 mvs를 구한 뒤, metric selection을 한다.
		metricSelector.selectMetric(metricSelector.calculateMVS(instances));
		
		//InstanceSelector class
		instanceSelector.calcualteViolations(instances);
		 //violation을 구한 뒤, instance selection을 한다.
		instanceSelector.selectInstance(instanceSelector.calcualteViolations(instances));
		//DatasetTester class
		 //unlabed dataset에 metric selection을 적용해 test dataset을 생성한다.
		datasetTester.generateTestDataset(instances);
		datasetTester.test(instances);
	}
	
	private boolean parseOption(Options options, String[] args) {
		CommandLineParser parser = new DefaultParser();
		
		try {
			CommandLine cmd = parser.parse(options, args);
			
			instancesFilePath = cmd.getOptionValue("i");
			help = cmd.hasOption("h");
		} catch(Exception e) {
			printHelp(options);
			return false;
		}
		
		return true;
	}
	
	private Options createOptions() {
		Options options = new Options();
		
		options.addOption(Option.builder("i").longOpt("instancesFilePath")
				.desc("set a path of a instancesFilePath")
				.hasArg()
				.argName("Path name of instancesFilePath")
				.required()
				.build());
		
		options.addOption(Option.builder("h").longOpt("help")
				.desc("Help")
				.build());
		
		return options;
	}
	
	private void printHelp(Options options) {
		HelpFormatter formatter = new HelpFormatter();
		String header = "CLAMI";
		String footer = "\nPlease report issues";
		formatter.printHelp("CLAMI", header, options, footer, true);
	}
	
}


