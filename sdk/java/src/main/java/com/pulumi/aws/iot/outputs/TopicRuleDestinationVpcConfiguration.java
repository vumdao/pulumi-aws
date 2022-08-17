// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleDestinationVpcConfiguration {
    /**
     * @return The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * 
     */
    private final String roleArn;
    /**
     * @return The security groups of the VPC destination.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * @return The subnet IDs of the VPC destination.
     * 
     */
    private final List<String> subnetIds;
    /**
     * @return The ID of the VPC.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private TopicRuleDestinationVpcConfiguration(
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.roleArn = roleArn;
        this.securityGroups = securityGroups;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * @return The ARN of a role that has permission to create and attach to elastic network interfaces (ENIs).
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The security groups of the VPC destination.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The subnet IDs of the VPC destination.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return The ID of the VPC.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private @Nullable List<String> securityGroups;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public TopicRuleDestinationVpcConfiguration build() {
            return new TopicRuleDestinationVpcConfiguration(roleArn, securityGroups, subnetIds, vpcId);
        }
    }
}