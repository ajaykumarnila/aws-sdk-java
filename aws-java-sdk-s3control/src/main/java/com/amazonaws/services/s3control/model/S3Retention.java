/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/S3Retention" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Retention implements Serializable, Cloneable {

    /**
     * <p>
     * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     * </p>
     */
    private java.util.Date retainUntilDate;
    /**
     * <p>
     * The Retention mode to be applied to all objects in the Batch Operations job.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     * </p>
     * 
     * @param retainUntilDate
     *        The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     */

    public void setRetainUntilDate(java.util.Date retainUntilDate) {
        this.retainUntilDate = retainUntilDate;
    }

    /**
     * <p>
     * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     * </p>
     * 
     * @return The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     */

    public java.util.Date getRetainUntilDate() {
        return this.retainUntilDate;
    }

    /**
     * <p>
     * The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     * </p>
     * 
     * @param retainUntilDate
     *        The date when the applied Object Retention will expire on all objects in the Batch Operations job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Retention withRetainUntilDate(java.util.Date retainUntilDate) {
        setRetainUntilDate(retainUntilDate);
        return this;
    }

    /**
     * <p>
     * The Retention mode to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param mode
     *        The Retention mode to be applied to all objects in the Batch Operations job.
     * @see S3ObjectLockRetentionMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The Retention mode to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @return The Retention mode to be applied to all objects in the Batch Operations job.
     * @see S3ObjectLockRetentionMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The Retention mode to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param mode
     *        The Retention mode to be applied to all objects in the Batch Operations job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockRetentionMode
     */

    public S3Retention withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The Retention mode to be applied to all objects in the Batch Operations job.
     * </p>
     * 
     * @param mode
     *        The Retention mode to be applied to all objects in the Batch Operations job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectLockRetentionMode
     */

    public S3Retention withMode(S3ObjectLockRetentionMode mode) {
        this.mode = mode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRetainUntilDate() != null)
            sb.append("RetainUntilDate: ").append(getRetainUntilDate()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Retention == false)
            return false;
        S3Retention other = (S3Retention) obj;
        if (other.getRetainUntilDate() == null ^ this.getRetainUntilDate() == null)
            return false;
        if (other.getRetainUntilDate() != null && other.getRetainUntilDate().equals(this.getRetainUntilDate()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetainUntilDate() == null) ? 0 : getRetainUntilDate().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public S3Retention clone() {
        try {
            return (S3Retention) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
