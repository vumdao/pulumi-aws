// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelMaintenanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelMaintenanceArgs Empty = new ChannelMaintenanceArgs();

    /**
     * The day of the week to use for maintenance.
     * 
     */
    @Import(name="maintenanceDay", required=true)
    private Output<String> maintenanceDay;

    /**
     * @return The day of the week to use for maintenance.
     * 
     */
    public Output<String> maintenanceDay() {
        return this.maintenanceDay;
    }

    /**
     * The hour maintenance will start.
     * 
     */
    @Import(name="maintenanceStartTime", required=true)
    private Output<String> maintenanceStartTime;

    /**
     * @return The hour maintenance will start.
     * 
     */
    public Output<String> maintenanceStartTime() {
        return this.maintenanceStartTime;
    }

    private ChannelMaintenanceArgs() {}

    private ChannelMaintenanceArgs(ChannelMaintenanceArgs $) {
        this.maintenanceDay = $.maintenanceDay;
        this.maintenanceStartTime = $.maintenanceStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelMaintenanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelMaintenanceArgs $;

        public Builder() {
            $ = new ChannelMaintenanceArgs();
        }

        public Builder(ChannelMaintenanceArgs defaults) {
            $ = new ChannelMaintenanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maintenanceDay The day of the week to use for maintenance.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceDay(Output<String> maintenanceDay) {
            $.maintenanceDay = maintenanceDay;
            return this;
        }

        /**
         * @param maintenanceDay The day of the week to use for maintenance.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceDay(String maintenanceDay) {
            return maintenanceDay(Output.of(maintenanceDay));
        }

        /**
         * @param maintenanceStartTime The hour maintenance will start.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceStartTime(Output<String> maintenanceStartTime) {
            $.maintenanceStartTime = maintenanceStartTime;
            return this;
        }

        /**
         * @param maintenanceStartTime The hour maintenance will start.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceStartTime(String maintenanceStartTime) {
            return maintenanceStartTime(Output.of(maintenanceStartTime));
        }

        public ChannelMaintenanceArgs build() {
            $.maintenanceDay = Objects.requireNonNull($.maintenanceDay, "expected parameter 'maintenanceDay' to be non-null");
            $.maintenanceStartTime = Objects.requireNonNull($.maintenanceStartTime, "expected parameter 'maintenanceStartTime' to be non-null");
            return $;
        }
    }

}