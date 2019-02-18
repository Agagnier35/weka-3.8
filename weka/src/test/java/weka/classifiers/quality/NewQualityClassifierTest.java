package weka.classifiers.quality;

import junit.framework.Test;
import junit.framework.TestSuite;
import weka.classifiers.AbstractClassifierTest;
import weka.classifiers.Classifier;

public class NewQualityClassifierTest extends AbstractClassifierTest {

	public NewQualityClassifierTest(String name) {
		super(name);
	}

	/** Creates a default NewQualityClassifier */
	public Classifier getClassifier() {
		return new NewQualityClassifier();
	}

	public static Test suite() {
		return new TestSuite(NewQualityClassifierTest.class);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(suite());
	}
}
