// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codestarnotifications.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleTargetArgs Empty = new NotificationRuleTargetArgs();

    /**
     * The ARN of notification rule target. For example, a SNS Topic ARN.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The ARN of notification rule target. For example, a SNS Topic ARN.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of the notification target. Default value is `SNS`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the notification target. Default value is `SNS`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NotificationRuleTargetArgs() {}

    private NotificationRuleTargetArgs(NotificationRuleTargetArgs $) {
        this.address = $.address;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleTargetArgs $;

        public Builder() {
            $ = new NotificationRuleTargetArgs();
        }

        public Builder(NotificationRuleTargetArgs defaults) {
            $ = new NotificationRuleTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The ARN of notification rule target. For example, a SNS Topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The ARN of notification rule target. For example, a SNS Topic ARN.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param status The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type The type of the notification target. Default value is `SNS`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the notification target. Default value is `SNS`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationRuleTargetArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            return $;
        }
    }

}