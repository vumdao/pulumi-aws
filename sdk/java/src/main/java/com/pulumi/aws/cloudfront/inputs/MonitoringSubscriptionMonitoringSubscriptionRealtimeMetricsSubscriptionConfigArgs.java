// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs Empty = new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs();

    /**
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
     */
    @Import(name="realtimeMetricsSubscriptionStatus", required=true)
    private Output<String> realtimeMetricsSubscriptionStatus;

    /**
     * @return A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
     * 
     */
    public Output<String> realtimeMetricsSubscriptionStatus() {
        return this.realtimeMetricsSubscriptionStatus;
    }

    private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs() {}

    private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs $) {
        this.realtimeMetricsSubscriptionStatus = $.realtimeMetricsSubscriptionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs $;

        public Builder() {
            $ = new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs();
        }

        public Builder(MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs defaults) {
            $ = new MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param realtimeMetricsSubscriptionStatus A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
         * 
         * @return builder
         * 
         */
        public Builder realtimeMetricsSubscriptionStatus(Output<String> realtimeMetricsSubscriptionStatus) {
            $.realtimeMetricsSubscriptionStatus = realtimeMetricsSubscriptionStatus;
            return this;
        }

        /**
         * @param realtimeMetricsSubscriptionStatus A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution. Valid values are `Enabled` and `Disabled`. See below.
         * 
         * @return builder
         * 
         */
        public Builder realtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
            return realtimeMetricsSubscriptionStatus(Output.of(realtimeMetricsSubscriptionStatus));
        }

        public MonitoringSubscriptionMonitoringSubscriptionRealtimeMetricsSubscriptionConfigArgs build() {
            $.realtimeMetricsSubscriptionStatus = Objects.requireNonNull($.realtimeMetricsSubscriptionStatus, "expected parameter 'realtimeMetricsSubscriptionStatus' to be non-null");
            return $;
        }
    }

}