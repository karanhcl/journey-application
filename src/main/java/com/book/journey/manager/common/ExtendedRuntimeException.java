package com.book.journey.manager.common;

/**
 * 
 * Custom exception class.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
public class ExtendedRuntimeException extends RuntimeException
{
    public ExtendedRuntimeException(String s){
        super(s);
    }
}