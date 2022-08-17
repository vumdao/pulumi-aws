// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentConfigMinimumHealthyHostsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigMinimumHealthyHostsArgs Empty = new DeploymentConfigMinimumHealthyHostsArgs();

    /**
     * The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
     * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    /**
     * @return The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
     * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
     * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
     * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
     * 
     */
    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private DeploymentConfigMinimumHealthyHostsArgs() {}

    private DeploymentConfigMinimumHealthyHostsArgs(DeploymentConfigMinimumHealthyHostsArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentConfigMinimumHealthyHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentConfigMinimumHealthyHostsArgs $;

        public Builder() {
            $ = new DeploymentConfigMinimumHealthyHostsArgs();
        }

        public Builder(DeploymentConfigMinimumHealthyHostsArgs defaults) {
            $ = new DeploymentConfigMinimumHealthyHostsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type can either be `FLEET_PERCENT` or `HOST_COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
         * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
         * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
         * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value when the type is `FLEET_PERCENT` represents the minimum number of healthy instances as
         * a percentage of the total number of instances in the deployment. If you specify FLEET_PERCENT, at the start of the
         * deployment, AWS CodeDeploy converts the percentage to the equivalent number of instance and rounds up fractional instances.
         * When the type is `HOST_COUNT`, the value represents the minimum number of healthy instances as an absolute value.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public DeploymentConfigMinimumHealthyHostsArgs build() {
            return $;
        }
    }

}