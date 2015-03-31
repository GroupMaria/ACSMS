package com.acsms.org.dao;

import org.junit.*;
import static org.junit.Assert.*;
import com.acsms.org.vo.TransportBookingVO;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

/**
 * The class <code>TransportBookingDAOTest</code> contains tests for the class <code>{@link TransportBookingDAO}</code>.
 *
 * @generatedBy CodePro at 31/03/15 2:46 PM
 * @author Hp
 * @version $Revision: 1.0 $
 */
public class TransportBookingDAOTest {
	/**
	 * Run the TransportBookingDAO() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_1()
		throws Exception {

		TransportBookingDAO result = new TransportBookingDAO();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransportBookingDAO() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_2()
		throws Exception {

		TransportBookingDAO result = new TransportBookingDAO();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransportBookingDAO() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_3()
		throws Exception {

		TransportBookingDAO result = new TransportBookingDAO();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransportBookingDAO(TransportBookingVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_4()
		throws Exception {
		TransportBookingVO objCustomer = new TransportBookingVO();

		TransportBookingDAO result = new TransportBookingDAO(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransportBookingDAO(TransportBookingVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_5()
		throws Exception {
		TransportBookingVO objCustomer = new TransportBookingVO();

		TransportBookingDAO result = new TransportBookingDAO(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the TransportBookingDAO(TransportBookingVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testTransportBookingDAO_6()
		throws Exception {
		TransportBookingVO objCustomer = new TransportBookingVO();

		TransportBookingDAO result = new TransportBookingDAO(objCustomer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addNewTransportBooking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddNewTransportBooking_1()
		throws Exception {
		TransportBookingDAO fixture = new TransportBookingDAO(new TransportBookingVO());
		fixture.customerPool = new ConnectionPool();

		fixture.addNewTransportBooking();

		// add additional test code here
	}

	/**
	 * Run the void addNewTransportBooking() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddNewTransportBooking_2()
		throws Exception {
		TransportBookingDAO fixture = new TransportBookingDAO(new TransportBookingVO());
		fixture.customerPool = new ConnectionPool();

		fixture.addNewTransportBooking();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 31/03/15 2:46 PM
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
	 * @generatedBy CodePro at 31/03/15 2:46 PM
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
	 * @generatedBy CodePro at 31/03/15 2:46 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TransportBookingDAOTest.class);
	}
}