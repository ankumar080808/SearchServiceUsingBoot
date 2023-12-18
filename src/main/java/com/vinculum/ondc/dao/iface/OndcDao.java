
package com.vinculum.ondc.dao.iface;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Flush;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.executor.BatchResult;
import org.springframework.transaction.annotation.Transactional;

import com.vinculum.ondc.dao.objects.Sku;
/**
 * The OndcDao interface provides methods for retrieving and manipulating ONDC data.
 * It defines the contract for interacting with the ONDC data access layer.
 * <p>
 * The interface declares methods for retrieving SKUs (Stock Keeping Units) based on the last transmit date,
 * inserting and updating transmit logs, and retrieving the last transmit date for a given integration code.
 * </p>
 * <p>
 * The interface is annotated with the {@link Transactional} annotation, indicating that the methods
 * defined in this interface are transactional and should participate in a transaction.
 * </p>
 *
 * @since 1.0
 */
@Transactional
public interface OndcDao {

    /**
     * Retrieves a list of SKUs (Stock Keeping Units) based on the last transmit date.
     *
     * @param lastTransmitDate the last transmit date used to filter SKUs
     * @return a list of SKUs
     */
    public List<Sku> getSkus(@Param("lastTransmitDate") Timestamp lastTransmitDate);

    /**
     * Inserts a transmit log with the specified integration code and last transmit date.
     *
     * @param intCode         the integration code associated with the transmit log
     * @param lastTransmitDate the last transmit date to be recorded in the transmit log
     */
    public void insertTransmitLog(@Param("intCode") String intCode, @Param("lastTransmitDate") final Timestamp lastDate);

    /**
     * Updates a transmit log with the specified integration code and last transmit date.
     *
     * @param intCode         the integration code associated with the transmit log
     * @param lastTransmitDate the last transmit date to be updated in the transmit log
     */
    public void updateTransmitLog(@Param("intCode") String intCode, @Param("lastTransmitDate") final Timestamp lastDate);

    /**
     * Retrieves the last transmit date recorded in the transmit log for the specified integration code.
     *
     * @param intCode the integration code for which to retrieve the last transmit date
     * @return the last transmit date for the specified integration code
     */
    public Timestamp getLastTransmitDate(@Param("intCode") String intCode);

    /**
     * Flushes any pending batch statements and returns the batch execution results.
     *
     * @return a list of batch execution results
     */
    @Flush
    public List<BatchResult> flush();
}
