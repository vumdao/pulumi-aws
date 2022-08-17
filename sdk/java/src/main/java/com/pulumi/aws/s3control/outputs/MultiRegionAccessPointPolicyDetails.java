// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MultiRegionAccessPointPolicyDetails {
    /**
     * @return The name of the Multi-Region Access Point.
     * 
     */
    private final String name;
    /**
     * @return A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
     * 
     */
    private final String policy;

    @CustomType.Constructor
    private MultiRegionAccessPointPolicyDetails(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") String policy) {
        this.name = name;
        this.policy = policy;
    }

    /**
     * @return The name of the Multi-Region Access Point.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
     * 
     */
    public String policy() {
        return this.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPolicyDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPolicyDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }        public MultiRegionAccessPointPolicyDetails build() {
            return new MultiRegionAccessPointPolicyDetails(name, policy);
        }
    }
}