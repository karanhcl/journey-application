package com.book.journey.manager.common;

/**
 * 
 * Custom exception class.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class CustomerNotFound extends RuntimeException
{
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public CustomerNotFound(String s){
        super(s);
    }
}