// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail;

import com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventDataStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventDataStoreArgs Empty = new EventDataStoreArgs();

    /**
     * The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * 
     */
    @Import(name="advancedEventSelectors")
    private @Nullable Output<List<EventDataStoreAdvancedEventSelectorArgs>> advancedEventSelectors;

    /**
     * @return The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * 
     */
    public Optional<Output<List<EventDataStoreAdvancedEventSelectorArgs>>> advancedEventSelectors() {
        return Optional.ofNullable(this.advancedEventSelectors);
    }

    /**
     * Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
     * 
     */
    @Import(name="multiRegionEnabled")
    private @Nullable Output<Boolean> multiRegionEnabled;

    /**
     * @return Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> multiRegionEnabled() {
        return Optional.ofNullable(this.multiRegionEnabled);
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
     * 
     */
    @Import(name="organizationEnabled")
    private @Nullable Output<Boolean> organizationEnabled;

    /**
     * @return Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> organizationEnabled() {
        return Optional.ofNullable(this.organizationEnabled);
    }

    /**
     * The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
     * 
     */
    @Import(name="retentionPeriod")
    private @Nullable Output<Integer> retentionPeriod;

    /**
     * @return The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
     * 
     */
    public Optional<Output<Integer>> retentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
     * 
     */
    @Import(name="terminationProtectionEnabled")
    private @Nullable Output<Boolean> terminationProtectionEnabled;

    /**
     * @return Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
     * 
     */
    public Optional<Output<Boolean>> terminationProtectionEnabled() {
        return Optional.ofNullable(this.terminationProtectionEnabled);
    }

    private EventDataStoreArgs() {}

    private EventDataStoreArgs(EventDataStoreArgs $) {
        this.advancedEventSelectors = $.advancedEventSelectors;
        this.multiRegionEnabled = $.multiRegionEnabled;
        this.name = $.name;
        this.organizationEnabled = $.organizationEnabled;
        this.retentionPeriod = $.retentionPeriod;
        this.tags = $.tags;
        this.terminationProtectionEnabled = $.terminationProtectionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventDataStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventDataStoreArgs $;

        public Builder() {
            $ = new EventDataStoreArgs();
        }

        public Builder(EventDataStoreArgs defaults) {
            $ = new EventDataStoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(@Nullable Output<List<EventDataStoreAdvancedEventSelectorArgs>> advancedEventSelectors) {
            $.advancedEventSelectors = advancedEventSelectors;
            return this;
        }

        /**
         * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(List<EventDataStoreAdvancedEventSelectorArgs> advancedEventSelectors) {
            return advancedEventSelectors(Output.of(advancedEventSelectors));
        }

        /**
         * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(EventDataStoreAdvancedEventSelectorArgs... advancedEventSelectors) {
            return advancedEventSelectors(List.of(advancedEventSelectors));
        }

        /**
         * @param multiRegionEnabled Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder multiRegionEnabled(@Nullable Output<Boolean> multiRegionEnabled) {
            $.multiRegionEnabled = multiRegionEnabled;
            return this;
        }

        /**
         * @param multiRegionEnabled Specifies whether the event data store includes events from all regions, or only from the region in which the event data store is created. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder multiRegionEnabled(Boolean multiRegionEnabled) {
            return multiRegionEnabled(Output.of(multiRegionEnabled));
        }

        /**
         * @param name Specifies the name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationEnabled Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder organizationEnabled(@Nullable Output<Boolean> organizationEnabled) {
            $.organizationEnabled = organizationEnabled;
            return this;
        }

        /**
         * @param organizationEnabled Specifies whether an event data store collects events logged for an organization in AWS Organizations. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder organizationEnabled(Boolean organizationEnabled) {
            return organizationEnabled(Output.of(organizationEnabled));
        }

        /**
         * @param retentionPeriod The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(@Nullable Output<Integer> retentionPeriod) {
            $.retentionPeriod = retentionPeriod;
            return this;
        }

        /**
         * @param retentionPeriod The retention period of the event data store, in days. You can set a retention period of up to 2555 days, the equivalent of seven years. Default: `2555`.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriod(Integer retentionPeriod) {
            return retentionPeriod(Output.of(retentionPeriod));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param terminationProtectionEnabled Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtectionEnabled(@Nullable Output<Boolean> terminationProtectionEnabled) {
            $.terminationProtectionEnabled = terminationProtectionEnabled;
            return this;
        }

        /**
         * @param terminationProtectionEnabled Specifies whether termination protection is enabled for the event data store. If termination protection is enabled, you cannot delete the event data store until termination protection is disabled. Default: `true`.
         * 
         * @return builder
         * 
         */
        public Builder terminationProtectionEnabled(Boolean terminationProtectionEnabled) {
            return terminationProtectionEnabled(Output.of(terminationProtectionEnabled));
        }

        public EventDataStoreArgs build() {
            return $;
        }
    }

}