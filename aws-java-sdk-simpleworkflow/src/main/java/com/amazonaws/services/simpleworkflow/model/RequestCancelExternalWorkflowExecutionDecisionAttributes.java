/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>RequestCancelExternalWorkflowExecution</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an <code>Action</code> element to allow or deny permission to call this action.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot use an IAM policy to constrain this action's parameters.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
 * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RequestCancelExternalWorkflowExecutionDecisionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestCancelExternalWorkflowExecutionDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution to cancel.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to cancel.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     */
    private String control;

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution to cancel.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @return The <code>workflowId</code> of the external workflow execution to cancel.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The <code>workflowId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @param workflowId
     *        The <code>workflowId</code> of the external workflow execution to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelExternalWorkflowExecutionDecisionAttributes withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution to cancel.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @return The <code>runId</code> of the external workflow execution to cancel.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The <code>runId</code> of the external workflow execution to cancel.
     * </p>
     * 
     * @param runId
     *        The <code>runId</code> of the external workflow execution to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelExternalWorkflowExecutionDecisionAttributes withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        The data attached to the event that can be used by the decider in subsequent workflow tasks.
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * <p>
     * The data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @return The data attached to the event that can be used by the decider in subsequent workflow tasks.
     */

    public String getControl() {
        return this.control;
    }

    /**
     * <p>
     * The data attached to the event that can be used by the decider in subsequent workflow tasks.
     * </p>
     * 
     * @param control
     *        The data attached to the event that can be used by the decider in subsequent workflow tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCancelExternalWorkflowExecutionDecisionAttributes withControl(String control) {
        setControl(control);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestCancelExternalWorkflowExecutionDecisionAttributes == false)
            return false;
        RequestCancelExternalWorkflowExecutionDecisionAttributes other = (RequestCancelExternalWorkflowExecutionDecisionAttributes) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        return hashCode;
    }

    @Override
    public RequestCancelExternalWorkflowExecutionDecisionAttributes clone() {
        try {
            return (RequestCancelExternalWorkflowExecutionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.RequestCancelExternalWorkflowExecutionDecisionAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
