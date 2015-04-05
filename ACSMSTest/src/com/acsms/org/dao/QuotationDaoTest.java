package com.acsms.org.dao;

import java.sql.Statement;
import org.junit.*;
import static org.junit.Assert.*;
import com.acsms.org.vo.QuotationVO;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.ConnectionImpl;

/**
 * The class <code>QuotationDaoTest</code> contains tests for the class <code>{@link QuotationDao}</code>.
 *
 * @generatedBy CodePro at 31/03/15 2:48 PM
 * @author Hp
 * @version $Revision: 1.0 $
 */
public class QuotationDaoTest {
	/**
	 * Run the QuotationDao(QuotationVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testQuotationDao_1()
		throws Exception {
		QuotationVO quotation = new QuotationVO();

		QuotationDao result = new QuotationDao(quotation);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getStatement());
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_1()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_2()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_3()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_4()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_5()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_6()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_7()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_8()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_9()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_10()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the void createNewQuote() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testCreateNewQuote_11()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		fixture.createNewQuote();

		// add additional test code here
	}

	/**
	 * Run the Statement getStatement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test
	public void testGetStatement_1()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());

		Statement result = fixture.getStatement();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void setStatement(Statement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Test(expected = java.lang.NoSuchMethodException.class)
	public void testSetStatement_1()
		throws Exception {
		QuotationDao fixture = new QuotationDao(new QuotationVO());
		Statement statement = new CallableStatement((ConnectionImpl) null, null);

		fixture.setStatement(statement);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 31/03/15 2:48 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QuotationDaoTest.class);
	}
}