// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExperienceConfigurationUserIdentityConfiguration {
    /**
     * @return The AWS SSO field name that contains the identifiers of your users, such as their emails.
     * 
     */
    private final String identityAttributeName;

    @CustomType.Constructor
    private GetExperienceConfigurationUserIdentityConfiguration(@CustomType.Parameter("identityAttributeName") String identityAttributeName) {
        this.identityAttributeName = identityAttributeName;
    }

    /**
     * @return The AWS SSO field name that contains the identifiers of your users, such as their emails.
     * 
     */
    public String identityAttributeName() {
        return this.identityAttributeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperienceConfigurationUserIdentityConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identityAttributeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperienceConfigurationUserIdentityConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityAttributeName = defaults.identityAttributeName;
        }

        public Builder identityAttributeName(String identityAttributeName) {
            this.identityAttributeName = Objects.requireNonNull(identityAttributeName);
            return this;
        }        public GetExperienceConfigurationUserIdentityConfiguration build() {
            return new GetExperienceConfigurationUserIdentityConfiguration(identityAttributeName);
        }
    }
}