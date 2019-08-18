package com.book.journey.manager.api;

import java.io.Serializable;
import java.util.Map;

/**
 * 
 * Response TO.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class ResponseTO<T> implements Serializable {
   
    private static final long serialVersionUID = 1L;
    /**
     * error    
     */
    private boolean error;
    /**
     * error message    
     */
    private Map<String, String> errorMessages;
    /**
     * message    
     */
    private String message;
    /**
     * data    
     */
    private T data;
    
    /**
     * 
     * Getter of {@link #error}.
     * 
     * @return boolean.
     */
    public boolean isError() {
        return this.error;
    }
    
    /**
     * 
     * Getter of {@link #errorMessages}.
     * 
     * @return Map<String, String> 
     */
    public Map<String, String> getErrorMessages() {
        return this.errorMessages;
    }
    
    /**
     * 
     * Setter of {@link #errorMessages}.
     * 
     * @param errorMessages
     */
    public void setErrorMessages(Map<String, String> errorMessages) {
        this.error = !errorMessages.isEmpty();
        this.errorMessages = errorMessages;
    }
    
    /**
     * 
     * Getter of {@link #data}.
     * 
     * @return data
     */
    public T getData() {
        return this.data;
    }
    
    /**
     * 
     * Setter of {@link #data}.
     * 
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * 
     * Getter of {@link #message}.
     * 
     * @return {@link #message}
     */
    public String getMessage() {
        return message;
    }

    /**
     * 
     * Setter of {@link #message}.
     * 
     * @param message 
     *           
     */
    public void setMessage(String message) {
        this.message = message;
    }

}