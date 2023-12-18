package com.vinculum.ondc.dao.datasource;

import org.springframework.util.Assert;

/**
 * The CustomerContextHolder class provides a thread-local mechanism for managing the customer type context
 * in a multi-tenant application. It allows setting and retrieving the customer type associated with the current thread.
 * <p>
 * The class uses a thread-local variable to store the customer type. The customer type is a string value
 * representing the type of customer or tenant in a multi-tenant environment.
 * </p>
 * <p>
 * The class provides static methods to set, get, and clear the customer type. The customer type is stored
 * in a thread-local variable, ensuring that each thread has its own independent copy of the customer type value.
 * </p>
 *
 * @since 1.0
 */
public class CustomerContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * Sets the customer type for the current thread.
     *
     * @param customerType the customer type to be set
     * @throws IllegalArgumentException if the customer type is null
     */
    public static void setCustomerType(final String customerType) {
        Assert.notNull(customerType, "Customer Type Cannot Be NULL");
        contextHolder.set(customerType);
    }

    /**
     * Retrieves the customer type associated with the current thread.
     *
     * @return the customer type of the current thread
     */
    public static String getCustomerType() {
        return contextHolder.get();
    }

    /**
     * Clears the customer type for the current thread.
     */
    public static void clearCustomerType() {
        contextHolder.remove();
    }
}
