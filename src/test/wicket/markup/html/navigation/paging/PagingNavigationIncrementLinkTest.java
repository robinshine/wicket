/*
 * $Id: PagingNavigationIncrementLinkTest.java 5844 2006-05-24 20:53:56 +0000
 * (Wed, 24 May 2006) joco01 $ $Revision$ $Date: 2006-05-24 20:53:56
 * +0000 (Wed, 24 May 2006) $
 * 
 * ==============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package wicket.markup.html.navigation.paging;

import wicket.EmptyPage;


/**
 * Testcase for the navigation increment link.
 * 
 * @author Martijn Dashorst
 */
public class PagingNavigationIncrementLinkTest extends AbstractPagingNavigationTest
{
	/**
	 * Construct.
	 * 
	 * @param name
	 *            the name of the test
	 */
	public PagingNavigationIncrementLinkTest(String name)
	{
		super(name);
	}

	/** the mock pageable driver. */
	private MockPageable mock;

	/**
	 * sets up the test.
	 * 
	 * @throws Exception
	 */
	@Override
	public void setUp() throws Exception
	{
		super.setUp();
		mock = new MockPageable();
	}

	/**
	 * Performs the forward navigation by incrementing one page.
	 */
	public void testGetPageNumberPositive()
	{
		PagingNavigationIncrementLink link = new PagingNavigationIncrementLink(new EmptyPage(), "",
				mock, 1);
		assertEquals(0, link.getPageNumber());
		pagecount = 1;
		assertEquals(0, link.getPageNumber());
		pagecount = 2;
		assertEquals(1, link.getPageNumber());
		currentpage = 1;
		assertEquals(1, link.getPageNumber());
	}

	/**
	 * Performs the backward navigation by decrementing one page.
	 */
	public void testGetPageNumberNegative()
	{
		PagingNavigationIncrementLink link = new PagingNavigationIncrementLink(new EmptyPage(), "",
				mock, -1);
		assertEquals(0, link.getPageNumber());
		pagecount = 1;
		assertEquals(0, link.getPageNumber());
		pagecount = 2;
		assertEquals(0, link.getPageNumber());
		currentpage = 1;
		assertEquals(0, link.getPageNumber());
		pagecount = 3;
		currentpage = 2;
		assertEquals(1, link.getPageNumber());
	}

	/**
	 * Performs the forward navigation by incrementing two pages.
	 */
	public void testGetPageNumberTwo()
	{
		PagingNavigationIncrementLink link = new PagingNavigationIncrementLink(new EmptyPage(), "",
				mock, 2);
		assertEquals(0, link.getPageNumber());
		pagecount = 1;
		assertEquals(0, link.getPageNumber());
		pagecount = 2;
		assertEquals(1, link.getPageNumber());
		currentpage = 1;
		assertEquals(1, link.getPageNumber());

		currentpage = 0;
		pagecount = 3;
		assertEquals(2, link.getPageNumber());
		currentpage = 1;
		assertEquals(2, link.getPageNumber());
	}

	/**
	 * Checks the logic behind the isFirst and isLast page methods.
	 */
	public void testIsFirstLastPage()
	{
		PagingNavigationIncrementLink link = new PagingNavigationIncrementLink(new EmptyPage(), "",
				mock, 0);

		pagecount = 0;
		currentpage = 0;
		assertTrue(link.isFirst());
		assertTrue(link.isLast());

		pagecount = 1;
		currentpage = 0;
		assertTrue(link.isFirst());
		assertTrue(link.isLast());

		pagecount = 2;
		currentpage = 0;
		assertTrue(link.isFirst());
		assertFalse(link.isLast());

		pagecount = 3;
		currentpage = 1;
		assertFalse(link.isFirst());
		assertFalse(link.isLast());

		pagecount = 3;
		currentpage = 2;
		assertFalse(link.isFirst());
		assertTrue(link.isLast());
	}
}
