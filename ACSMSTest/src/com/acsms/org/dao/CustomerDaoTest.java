package com.acsms.org.dao;

import org.junit.*;
import static org.junit.Assert.*;
import com.acsms.org.vo.CustomerVO;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

/**
 * The class <code>CustomerDaoTest</code> contains tests for the class <code>{@link CustomerDao}</code>.
 *
 * @generatedBy CodePro at 26/03/15 3:52 PM
 * @author Hp
 * @version $Revision: 1.0 $
 */
public class CustomerDaoTest {
	/**
	 * Run the CustomerDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_1()
		throws Exception {

		CustomerDao result = new CustomerDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CustomerDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_2()
		throws Exception {

		CustomerDao result = new CustomerDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CustomerDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_3()
		throws Exception {

		CustomerDao result = new CustomerDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CustomerDao(CustomerVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_4()
		throws Exception {
		CustomerVO objCustomer = new CustomerVO();

		CustomerDao result = new CustomerDao(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CustomerDao(CustomerVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_5()
		throws Exception {
		CustomerVO objCustomer = new CustomerVO();

		CustomerDao result = new CustomerDao(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CustomerDao(CustomerVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testCustomerDao_6()
		throws Exception {
		CustomerVO objCustomer = new CustomerVO();

		CustomerDao result = new CustomerDao(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String addNewCust() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddNewCust_1()
		throws Exception {
		CustomerDao fixture = new CustomerDao(new CustomerVO());
		fixture.customerPool = new ConnectionPool();

		String result = fixture.addNewCust();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String addNewCust() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddNewCust_2()
		throws Exception {
		CustomerDao fixture = new CustomerDao(new CustomerVO());
		fixture.customerPool = new ConnectionPool();

		String result = fixture.addNewCust();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 26/03/15 3:52 PM
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
	 * @generatedBy CodePro at 26/03/15 3:52 PM
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
	 * @generatedBy CodePro at 26/03/15 3:52 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CustomerDaoTest.class);
	}
}