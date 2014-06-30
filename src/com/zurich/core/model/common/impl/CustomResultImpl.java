/**
 * 
 */
package com.zurich.core.model.common.impl;

import com.zurich.core.model.common.CustomResult;

/**
 * @author SUN
 *
 */
public class CustomResultImpl<RESULT extends Object> implements CustomResult<RESULT> {
    private static final long serialVersionUID = 1658761847048593649L;

    private boolean isSuccess;
    private RESULT result;
    private String message;
    
    public CustomResultImpl() {
        this.isSuccess = false;
        this.result = null;
        this.message = "";
    }
    
    public CustomResultImpl(boolean isSuccess, RESULT result, String message) {
        this.isSuccess = isSuccess;
        this.result = result;
        this.message = message;
    }
    
    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }
    
    public void setResult(RESULT result) {
        this.result = result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public RESULT getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

}
