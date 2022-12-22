// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResolverFirewallRuleGroupResult {
    private String arn;
    private String creationTime;
    private String creatorRequestId;
    private String firewallRuleGroupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String modificationTime;
    private String name;
    private String ownerId;
    private Integer ruleCount;
    private String shareStatus;
    private String status;
    private String statusMessage;

    private GetResolverFirewallRuleGroupResult() {}
    public String arn() {
        return this.arn;
    }
    public String creationTime() {
        return this.creationTime;
    }
    public String creatorRequestId() {
        return this.creatorRequestId;
    }
    public String firewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String modificationTime() {
        return this.modificationTime;
    }
    public String name() {
        return this.name;
    }
    public String ownerId() {
        return this.ownerId;
    }
    public Integer ruleCount() {
        return this.ruleCount;
    }
    public String shareStatus() {
        return this.shareStatus;
    }
    public String status() {
        return this.status;
    }
    public String statusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverFirewallRuleGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String creationTime;
        private String creatorRequestId;
        private String firewallRuleGroupId;
        private String id;
        private String modificationTime;
        private String name;
        private String ownerId;
        private Integer ruleCount;
        private String shareStatus;
        private String status;
        private String statusMessage;
        public Builder() {}
        public Builder(GetResolverFirewallRuleGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.creatorRequestId = defaults.creatorRequestId;
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.id = defaults.id;
    	      this.modificationTime = defaults.modificationTime;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.ruleCount = defaults.ruleCount;
    	      this.shareStatus = defaults.shareStatus;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        @CustomType.Setter
        public Builder creatorRequestId(String creatorRequestId) {
            this.creatorRequestId = Objects.requireNonNull(creatorRequestId);
            return this;
        }
        @CustomType.Setter
        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder modificationTime(String modificationTime) {
            this.modificationTime = Objects.requireNonNull(modificationTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder ruleCount(Integer ruleCount) {
            this.ruleCount = Objects.requireNonNull(ruleCount);
            return this;
        }
        @CustomType.Setter
        public Builder shareStatus(String shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public GetResolverFirewallRuleGroupResult build() {
            final var o = new GetResolverFirewallRuleGroupResult();
            o.arn = arn;
            o.creationTime = creationTime;
            o.creatorRequestId = creatorRequestId;
            o.firewallRuleGroupId = firewallRuleGroupId;
            o.id = id;
            o.modificationTime = modificationTime;
            o.name = name;
            o.ownerId = ownerId;
            o.ruleCount = ruleCount;
            o.shareStatus = shareStatus;
            o.status = status;
            o.statusMessage = statusMessage;
            return o;
        }
    }
}