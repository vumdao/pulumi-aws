// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs Empty = new NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs();

    @Import(name="from")
    private @Nullable Output<Integer> from;

    public Optional<Output<Integer>> from() {
        return Optional.ofNullable(this.from);
    }

    @Import(name="to")
    private @Nullable Output<Integer> to;

    public Optional<Output<Integer>> to() {
        return Optional.ofNullable(this.to);
    }

    private NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs() {}

    private NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs(NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs $) {
        this.from = $.from;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs $;

        public Builder() {
            $ = new NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs();
        }

        public Builder(NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs defaults) {
            $ = new NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder from(@Nullable Output<Integer> from) {
            $.from = from;
            return this;
        }

        public Builder from(Integer from) {
            return from(Output.of(from));
        }

        public Builder to(@Nullable Output<Integer> to) {
            $.to = to;
            return this;
        }

        public Builder to(Integer to) {
            return to(Output.of(to));
        }

        public NetworkInsightsAnalysisForwardPathComponentInboundHeaderDestinationPortRangeArgs build() {
            return $;
        }
    }

}