/**
 * 
 */
package com.zurich.core.model.common;

import java.io.Serializable;


public interface CustomResult<RESULT> extends Serializable {

    public boolean isSuccess();
    
    public RESULT getResult();
    
    public String getMessage();

}
