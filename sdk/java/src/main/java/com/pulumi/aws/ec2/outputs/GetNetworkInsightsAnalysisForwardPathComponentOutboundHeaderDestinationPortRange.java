// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange {
    private Integer from;
    private Integer to;

    private GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange() {}
    public Integer from() {
        return this.from;
    }
    public Integer to() {
        return this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer from;
        private Integer to;
        public Builder() {}
        public Builder(GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder from(Integer from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        @CustomType.Setter
        public Builder to(Integer to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }
        public GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange build() {
            final var o = new GetNetworkInsightsAnalysisForwardPathComponentOutboundHeaderDestinationPortRange();
            o.from = from;
            o.to = to;
            return o;
        }
    }
}