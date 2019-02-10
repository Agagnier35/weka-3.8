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

/**
 * RegExpFromFileTest.java
 * Copyright (C) 2014 University of Waikato, Hamilton, New Zealand
 */
package weka.core.stopwords;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Tests the RegExpFromFile stopwords algorithm. Run from commandline as follows:<br/>
 *   java weka.core.stopwords.RegExpFromFileTest
 *
 * @author fracpete (fracpete at waikato dot ac dot nz)
 * @version $Revision$
 */
public class RegExpFromFileTest
		extends AbstractStopwordsTest {

	/**
	 * Constructs the test.
	 *
	 * @param name the name of the test
	 */
	public RegExpFromFileTest(String name) {
		super(name);
	}

	/**
	 * Used to create an instance of a specific stopwords scheme.
	 *
	 * @return a suitably configured <code>StopwordsHandler</code> value
	 */
	@Override
	public StopwordsHandler getStopwords() {
		RegExpFromFile result;

		result = new RegExpFromFile();
		result.setStopwords(new File(getTmpDirectory() + File.separator + "RegExpFromFile.txt"));

		return result;
	}

	/**
	 * Called by JUnit before each test method.
	 *
	 * @exception Exception if an error occurs reading the example instances.
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		copyResourceToTmp("RegExpFromFile.txt");
	}

	/**
	 * Called by JUnit after each test method.
	 */
	@Override
	protected void tearDown() {
		deleteFileFromTmp("RegExpFromFile.txt");

		super.tearDown();
	}

	public static Test suite() {
		return new TestSuite(RegExpFromFileTest.class);
	}

	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
