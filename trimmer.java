import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import weka.classifiers.meta.FilteredClassifier;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class trimmer {
	// APPENDING AND GENERATING .ARFF FILES
	
	public static ArrayList<Integer> getNoneAllYesUserIDArray(String filename) throws Exception {
		ArrayList<Integer> userArray = new ArrayList<Integer>();
		DataSource source = new DataSource(filename);
		Instances data = source.getDataSet();

		for (int i = 0; i < data.numInstances(); i= i + 14) {
            for (int index=i; index < i+14; index++) {
                //System.out.println(data.instance(index).value(0)+": "+data.instance(index).stringValue(6));   
            	if (data.instance(index).stringValue(6).equals("no")) {
            		//System.out.println((int)data.instance(i).value(0));
            		userArray.add((int)data.instance(i).value(0));
            		break;
            	}
            }
		}
		//System.out.println(userArray);
		return userArray;
	}
	
	public static void main(String[] args) throws Exception {
			ArrayList<Integer> userArray = getNoneAllYesUserIDArray("../docs/intel_result6_notify.arff");
            user.generateArff(userArray, "trimmed_notify.arff");	
	}
}