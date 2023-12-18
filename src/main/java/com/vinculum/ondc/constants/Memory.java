package com.vinculum.ondc.constants;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The Memory class represents a container for storing key-value pairs in memory.
 * It provides a thread-safe implementation using ConcurrentHashMap for concurrent access.
 * 
 * The class includes a public static final Map variable named KEY_MASTER, which holds the key-value pairs.
 * 
 * The Memory class serves as a convenient and efficient way to store and retrieve data in memory for the application.
 */
public class Memory {

	public static final Map<String, String> KEY_MASTER = new ConcurrentHashMap<>();
	
}
