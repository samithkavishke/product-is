/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.identity.integration.test.rest.api.server.application.management.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class ApplicationPatchModel {

    private String name;
    private String description;
    private String imageUrl;
    private String accessUrl;
    private String templateId;
    private ClaimConfiguration claimConfiguration;
    private AuthenticationSequence authenticationSequence;
    private AdvancedApplicationConfiguration advancedConfigurations;
    private ProvisioningConfiguration provisioningConfigurations;

    /**
     **/
    public ApplicationPatchModel name(String name) {

        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "pickup", required = true)
    @JsonProperty("name")
    @Valid
    @NotNull(message = "Property name cannot be null.")
    @Pattern(regexp="^[a-zA-Z0-9._-]+(?: [a-zA-Z0-9._-]+)*$")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
     **/
    public ApplicationPatchModel description(String description) {

        this.description = description;
        return this;
    }

    @ApiModelProperty(example = "This is the configuration for Pickup application.")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     **/
    public ApplicationPatchModel imageUrl(String imageUrl) {

        this.imageUrl = imageUrl;
        return this;
    }

    @ApiModelProperty(example = "https://example.com/logo/my-logo.png")
    @JsonProperty("imageUrl")
    @Valid
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     **/
    public ApplicationPatchModel accessUrl(String accessUrl) {

        this.accessUrl = accessUrl;
        return this;
    }

    @ApiModelProperty(example = "https://example.com/accessUrl")
    @JsonProperty("accessUrl")
    @Valid
    public String getAccessUrl() {
        return accessUrl;
    }
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    /**
     **/
    public ApplicationPatchModel templateId(String templateId) {

        this.templateId = templateId;
        return this;
    }

    @ApiModelProperty(example = "templateId")
    @JsonProperty("templateId")
    @Valid
    public String getTemplateId() {
        return templateId;
    }
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     **/
    public ApplicationPatchModel claimConfiguration(ClaimConfiguration claimConfiguration) {

        this.claimConfiguration = claimConfiguration;
        return this;
    }

    @ApiModelProperty()
    @JsonProperty("claimConfiguration")
    @Valid
    public ClaimConfiguration getClaimConfiguration() {
        return claimConfiguration;
    }
    public void setClaimConfiguration(ClaimConfiguration claimConfiguration) {
        this.claimConfiguration = claimConfiguration;
    }

    /**
     **/
    public ApplicationPatchModel authenticationSequence(AuthenticationSequence authenticationSequence) {

        this.authenticationSequence = authenticationSequence;
        return this;
    }

    @ApiModelProperty()
    @JsonProperty("authenticationSequence")
    @Valid
    public AuthenticationSequence getAuthenticationSequence() {
        return authenticationSequence;
    }
    public void setAuthenticationSequence(AuthenticationSequence authenticationSequence) {
        this.authenticationSequence = authenticationSequence;
    }

    /**
     **/
    public ApplicationPatchModel advancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {

        this.advancedConfigurations = advancedConfigurations;
        return this;
    }

    @ApiModelProperty()
    @JsonProperty("advancedConfigurations")
    @Valid
    public AdvancedApplicationConfiguration getAdvancedConfigurations() {
        return advancedConfigurations;
    }
    public void setAdvancedConfigurations(AdvancedApplicationConfiguration advancedConfigurations) {
        this.advancedConfigurations = advancedConfigurations;
    }

    /**
     **/
    public ApplicationPatchModel provisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {

        this.provisioningConfigurations = provisioningConfigurations;
        return this;
    }

    @ApiModelProperty()
    @JsonProperty("provisioningConfigurations")
    @Valid
    public ProvisioningConfiguration getProvisioningConfigurations() {
        return provisioningConfigurations;
    }
    public void setProvisioningConfigurations(ProvisioningConfiguration provisioningConfigurations) {
        this.provisioningConfigurations = provisioningConfigurations;
    }



    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationPatchModel applicationPatchModel = (ApplicationPatchModel) o;
        return Objects.equals(this.name, applicationPatchModel.name) &&
                Objects.equals(this.description, applicationPatchModel.description) &&
                Objects.equals(this.imageUrl, applicationPatchModel.imageUrl) &&
                Objects.equals(this.accessUrl, applicationPatchModel.accessUrl) &&
                Objects.equals(this.templateId, applicationPatchModel.templateId) &&
                Objects.equals(this.claimConfiguration, applicationPatchModel.claimConfiguration) &&
                Objects.equals(this.authenticationSequence, applicationPatchModel.authenticationSequence) &&
                Objects.equals(this.advancedConfigurations, applicationPatchModel.advancedConfigurations) &&
                Objects.equals(this.provisioningConfigurations, applicationPatchModel.provisioningConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, imageUrl, accessUrl, templateId, claimConfiguration, authenticationSequence, advancedConfigurations, provisioningConfigurations);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationPatchModel {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    accessUrl: ").append(toIndentedString(accessUrl)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    claimConfiguration: ").append(toIndentedString(claimConfiguration)).append("\n");
        sb.append("    authenticationSequence: ").append(toIndentedString(authenticationSequence)).append("\n");
        sb.append("    advancedConfigurations: ").append(toIndentedString(advancedConfigurations)).append("\n");
        sb.append("    provisioningConfigurations: ").append(toIndentedString(provisioningConfigurations)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString();
    }
}