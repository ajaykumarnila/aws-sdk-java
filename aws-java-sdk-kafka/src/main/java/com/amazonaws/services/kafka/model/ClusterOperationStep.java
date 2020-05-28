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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Step taken during a cluster operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ClusterOperationStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterOperationStep implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the step and its status.
     * </p>
     */
    private ClusterOperationStepInfo stepInfo;
    /**
     * <p>
     * The name of the step.
     * </p>
     */
    private String stepName;

    /**
     * <p>
     * Information about the step and its status.
     * </p>
     * 
     * @param stepInfo
     *        <p>
     *        Information about the step and its status.
     *        </p>
     */

    public void setStepInfo(ClusterOperationStepInfo stepInfo) {
        this.stepInfo = stepInfo;
    }

    /**
     * <p>
     * Information about the step and its status.
     * </p>
     * 
     * @return <p>
     *         Information about the step and its status.
     *         </p>
     */

    public ClusterOperationStepInfo getStepInfo() {
        return this.stepInfo;
    }

    /**
     * <p>
     * Information about the step and its status.
     * </p>
     * 
     * @param stepInfo
     *        <p>
     *        Information about the step and its status.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationStep withStepInfo(ClusterOperationStepInfo stepInfo) {
        setStepInfo(stepInfo);
        return this;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param stepName
     *        <p>
     *        The name of the step.
     *        </p>
     */

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @return <p>
     *         The name of the step.
     *         </p>
     */

    public String getStepName() {
        return this.stepName;
    }

    /**
     * <p>
     * The name of the step.
     * </p>
     * 
     * @param stepName
     *        <p>
     *        The name of the step.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterOperationStep withStepName(String stepName) {
        setStepName(stepName);
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
        if (getStepInfo() != null)
            sb.append("StepInfo: ").append(getStepInfo()).append(",");
        if (getStepName() != null)
            sb.append("StepName: ").append(getStepName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterOperationStep == false)
            return false;
        ClusterOperationStep other = (ClusterOperationStep) obj;
        if (other.getStepInfo() == null ^ this.getStepInfo() == null)
            return false;
        if (other.getStepInfo() != null && other.getStepInfo().equals(this.getStepInfo()) == false)
            return false;
        if (other.getStepName() == null ^ this.getStepName() == null)
            return false;
        if (other.getStepName() != null && other.getStepName().equals(this.getStepName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStepInfo() == null) ? 0 : getStepInfo().hashCode());
        hashCode = prime * hashCode + ((getStepName() == null) ? 0 : getStepName().hashCode());
        return hashCode;
    }

    @Override
    public ClusterOperationStep clone() {
        try {
            return (ClusterOperationStep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ClusterOperationStepMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
