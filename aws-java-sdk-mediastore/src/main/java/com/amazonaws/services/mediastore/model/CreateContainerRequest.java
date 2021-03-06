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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     */
    private String containerName;

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @param containerName
     *        The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *        your AWS account within a specific region. As an example, you could create a container named
     *        <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @return The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *         your AWS account within a specific region. As an example, you could create a container named
     *         <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @param containerName
     *        The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *        your AWS account within a specific region. As an example, you could create a container named
     *        <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRequest withContainerName(String containerName) {
        setContainerName(containerName);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerRequest == false)
            return false;
        CreateContainerRequest other = (CreateContainerRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerRequest clone() {
        return (CreateContainerRequest) super.clone();
    }

}
