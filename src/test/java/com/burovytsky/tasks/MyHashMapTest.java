/**
 * 
 */
package com.burovytsky.tasks;

import org.junit.Before;

/**
 * @author downey
 *
 */
public class MyHashMapTest extends MyLinearMapTest {

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		map = new MyHashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put(null, 0);
	}
}
