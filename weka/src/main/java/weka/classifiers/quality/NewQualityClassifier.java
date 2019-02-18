/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * NewQualityClassifier.java
 * Copyright (C) 2001-2012 University of Waikato, Hamilton, New Zealand
 *
 */
package weka.classifiers.quality;

import java.io.Serializable;
import java.util.*;

import weka.classifiers.AbstractClassifier;
import weka.core.*;
import weka.core.Capabilities.Capability;

/**
 * <!-- globalinfo-start -->
 *     New algorithm that does nothing for LOG8371 Polytechnique Montréal Class
 * <!-- globalinfo-end -->
 *
 <!-- options-start --> Valid options are:
 * <p/>
 *
 * <pre>
 * -S
 *  Does something nice
 * </pre>
 *
 * <!-- options-end -->
 *
 * @author Félix Agagnier (no@no.com)
 * @version $Revision$
 */

public class NewQualityClassifier extends AbstractClassifier implements Serializable {
	static final long serialVersionUID = 6512884454517478938L;

	private boolean somethingNice = false;

	/**
	 * This will return a string describing the classifier.
	 *
	 * @return The string.
	 */
	public String globalInfo() {
		return "New classifier algorithm that does nothing for LOG8371 Polytechnique Montréal Class";
	}

	/**
	 * Returns an enumeration describing the available options
	 *
	 * @return an enumeration of all the available options
	 */
	@Override
	public Enumeration<Option> listOptions() {
		Vector<Option> newVector = new Vector<>(4);
		newVector.addElement(new Option("\tDo Something Nice\n",
				"SN", 0, "-SN"));
		return newVector.elements();
	} // listOptions

	/**
	 * Parses a given list of options.
	 * <p>
	 *
	 * <!-- options-start --> Valid options are:
	 * <p/>
	 *
	 * <pre>
	 * -S
	 *  Does something nice
	 * </pre>
	 *
	 * <!-- options-end -->
	 *
	 * @param options the list of options as an array of strings
	 * @throws Exception if an option is not supported
	 */
	@Override
	public void setOptions(String[] options) throws Exception {
		super.setOptions(options);

		somethingNice = !Utils.getFlag("SN", options);

		Utils.checkForRemainingOptions(options);
	} // setOptions

	/**
	 * Gets the current settings of the classifier.
	 *
	 * @return an array of strings suitable for passing to setOptions
	 */
	@Override
	public String[] getOptions() {
		Vector<String> options = new Vector<>();

		Collections.addAll(options, super.getOptions());

		if (!somethingNice) {
			options.add("-SN");
		}

		return options.toArray(new String[0]);
	} // getOptions

	/**
	 * Generates the classifier.
	 *
	 * @param instances set of instances serving as training data
	 * @throws Exception if the classifier has not been generated successfully
	 */
	@Override
	public void buildClassifier(Instances instances) throws Exception {
		// can classifier handle the data?
		getCapabilities().testWithFail(instances);

		// remove instances with missing class
		instances = new Instances(instances);
		instances.deleteWithMissingClass();
	} // buildClassifier

	/**
	 * Returns a description of the classifier.
	 *
	 * @return a description of the classifier as a string.
	 */
	@Override
	public String toString() {
		return "Quality Code right here";
	} // toString

	/**
	 * Returns default capabilities of the classifier.
	 *
	 * @return the capabilities of this classifier
	 */
	@Override
	public Capabilities getCapabilities() {
		Capabilities result = super.getCapabilities();
		result.disableAll();

		// attributes
		result.enable(Capability.NOMINAL_ATTRIBUTES);
		result.enable(Capability.NUMERIC_ATTRIBUTES);
		result.enable(Capability.MISSING_VALUES);

		// class
		result.enable(Capability.NOMINAL_CLASS);
		result.enable(Capability.MISSING_CLASS_VALUES);

		// instances
		result.setMinimumNumberInstances(0);

		return result;
	}

	/**
	 * Classifies the given test instance.
	 *
	 * @param instance the instance to be classified
	 * @return the predicted most likely class for the instance or
	 *         Utils.missingValue() if no prediction is made
	 * @throws Exception if an error occurred during the prediction
	 */
	@Override
	public double classifyInstance(Instance instance) throws Exception {
		return 0;
	}
}
