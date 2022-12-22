// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcNetworkPerformanceMetricSubscriptionState extends com.pulumi.resources.ResourceArgs {

    public static final VpcNetworkPerformanceMetricSubscriptionState Empty = new VpcNetworkPerformanceMetricSubscriptionState();

    /**
     * The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
     * 
     */
    @Import(name="metric")
    private @Nullable Output<String> metric;

    /**
     * @return The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
     * 
     */
    public Optional<Output<String>> metric() {
        return Optional.ofNullable(this.metric);
    }

    /**
     * The data aggregation time for the subscription.
     * 
     */
    @Import(name="period")
    private @Nullable Output<String> period;

    /**
     * @return The data aggregation time for the subscription.
     * 
     */
    public Optional<Output<String>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
     * 
     */
    @Import(name="statistic")
    private @Nullable Output<String> statistic;

    /**
     * @return The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
     * 
     */
    public Optional<Output<String>> statistic() {
        return Optional.ofNullable(this.statistic);
    }

    private VpcNetworkPerformanceMetricSubscriptionState() {}

    private VpcNetworkPerformanceMetricSubscriptionState(VpcNetworkPerformanceMetricSubscriptionState $) {
        this.destination = $.destination;
        this.metric = $.metric;
        this.period = $.period;
        this.source = $.source;
        this.statistic = $.statistic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcNetworkPerformanceMetricSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcNetworkPerformanceMetricSubscriptionState $;

        public Builder() {
            $ = new VpcNetworkPerformanceMetricSubscriptionState();
        }

        public Builder(VpcNetworkPerformanceMetricSubscriptionState defaults) {
            $ = new VpcNetworkPerformanceMetricSubscriptionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param destination The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination The target Region or Availability Zone that the metric subscription is enabled for. For example, `eu-west-1`.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param metric The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
         * 
         * @return builder
         * 
         */
        public Builder metric(@Nullable Output<String> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric The metric used for the enabled subscription. Valid values: `aggregate-latency`. Default: `aggregate-latency`.
         * 
         * @return builder
         * 
         */
        public Builder metric(String metric) {
            return metric(Output.of(metric));
        }

        /**
         * @param period The data aggregation time for the subscription.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The data aggregation time for the subscription.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param source The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source Region or Availability Zone that the metric subscription is enabled for. For example, `us-east-1`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param statistic The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
         * 
         * @return builder
         * 
         */
        public Builder statistic(@Nullable Output<String> statistic) {
            $.statistic = statistic;
            return this;
        }

        /**
         * @param statistic The statistic used for the enabled subscription. Valid values: `p50`. Default: `p50`.
         * 
         * @return builder
         * 
         */
        public Builder statistic(String statistic) {
            return statistic(Output.of(statistic));
        }

        public VpcNetworkPerformanceMetricSubscriptionState build() {
            return $;
        }
    }

}