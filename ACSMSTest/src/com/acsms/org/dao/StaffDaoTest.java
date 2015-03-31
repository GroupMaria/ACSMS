package com.acsms.org.dao;

import org.junit.*;
import static org.junit.Assert.*;
import com.acsms.org.vo.StaffVO;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

/**
 * The class <code>StaffDaoTest</code> contains tests for the class <code>{@link StaffDao}</code>.
 *
 * @generatedBy CodePro at 26/03/15 6:19 PM
 * @author Hp
 * @version $Revision: 1.0 $
 */
public class StaffDaoTest {
	/**
	 * Run the StaffDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_1()
		throws Exception {

		StaffDao result = new StaffDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_2()
		throws Exception {

		StaffDao result = new StaffDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffDao() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_3()
		throws Exception {

		StaffDao result = new StaffDao();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffDao(StaffVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_4()
		throws Exception {
		StaffVO objStaff = new StaffVO();

		StaffDao result = new StaffDao(objStaff);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffDao(StaffVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_5()
		throws Exception {
		StaffVO objStaff = new StaffVO();

		StaffDao result = new StaffDao(objStaff);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffDao(StaffVO) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testStaffDao_6()
		throws Exception {
		StaffVO objStaff = new StaffVO();

		StaffDao result = new StaffDao(objStaff);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddStaff_1()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.addStaff();

		// add additional test code here
	}

	/**
	 * Run the void addStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testAddStaff_2()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.addStaff();

		// add additional test code here
	}

	/**
	 * Run the void deleteStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testDeleteStaff_1()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.deleteStaff();

		// add additional test code here
	}

	/**
	 * Run the void deleteStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testDeleteStaff_2()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.deleteStaff();

		// add additional test code here
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_1()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_2()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_3()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_4()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_5()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_6()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_7()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_8()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_9()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_10()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the StaffVO getStaffByID(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testGetStaffByID_11()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();
		String Id = "";

		StaffVO result = fixture.getStaffByID(Id);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void updateStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testUpdateStaff_1()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.updateStaff();

		// add additional test code here
	}

	/**
	 * Run the void updateStaff() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	@Test(expected = com.mysql.jdbc.exceptions.jdbc4.CommunicationsException.class)
	public void testUpdateStaff_2()
		throws Exception {
		StaffDao fixture = new StaffDao(new StaffVO());
		fixture.staffPool = new ConnectionPool();

		fixture.updateStaff();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 26/03/15 6:19 PM
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
	 * @generatedBy CodePro at 26/03/15 6:19 PM
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
	 * @generatedBy CodePro at 26/03/15 6:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StaffDaoTest.class);
	}
}