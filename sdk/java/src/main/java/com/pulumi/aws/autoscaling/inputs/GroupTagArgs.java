// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GroupTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupTagArgs Empty = new GroupTagArgs();

    /**
     * Key
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Key
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Enables propagation of the tag to
     * Amazon EC2 instances launched via this ASG
     * 
     */
    @Import(name="propagateAtLaunch", required=true)
    private Output<Boolean> propagateAtLaunch;

    /**
     * @return Enables propagation of the tag to
     * Amazon EC2 instances launched via this ASG
     * 
     */
    public Output<Boolean> propagateAtLaunch() {
        return this.propagateAtLaunch;
    }

    /**
     * Value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GroupTagArgs() {}

    private GroupTagArgs(GroupTagArgs $) {
        this.key = $.key;
        this.propagateAtLaunch = $.propagateAtLaunch;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupTagArgs $;

        public Builder() {
            $ = new GroupTagArgs();
        }

        public Builder(GroupTagArgs defaults) {
            $ = new GroupTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param propagateAtLaunch Enables propagation of the tag to
         * Amazon EC2 instances launched via this ASG
         * 
         * @return builder
         * 
         */
        public Builder propagateAtLaunch(Output<Boolean> propagateAtLaunch) {
            $.propagateAtLaunch = propagateAtLaunch;
            return this;
        }

        /**
         * @param propagateAtLaunch Enables propagation of the tag to
         * Amazon EC2 instances launched via this ASG
         * 
         * @return builder
         * 
         */
        public Builder propagateAtLaunch(Boolean propagateAtLaunch) {
            return propagateAtLaunch(Output.of(propagateAtLaunch));
        }

        /**
         * @param value Value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GroupTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.propagateAtLaunch = Objects.requireNonNull($.propagateAtLaunch, "expected parameter 'propagateAtLaunch' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}