// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs Empty = new ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs();

    /**
     * The name of the secret.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the secret.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the SSM Parameter Store.
     * 
     */
    @Import(name="valueFrom", required=true)
    private Output<String> valueFrom;

    /**
     * @return The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the SSM Parameter Store.
     * 
     */
    public Output<String> valueFrom() {
        return this.valueFrom;
    }

    private ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs() {}

    private ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs(ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs $) {
        this.name = $.name;
        this.valueFrom = $.valueFrom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs $;

        public Builder() {
            $ = new ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs();
        }

        public Builder(ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs defaults) {
            $ = new ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the secret.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param valueFrom The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the SSM Parameter Store.
         * 
         * @return builder
         * 
         */
        public Builder valueFrom(Output<String> valueFrom) {
            $.valueFrom = valueFrom;
            return this;
        }

        /**
         * @param valueFrom The secret to expose to the container. The supported values are either the full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the SSM Parameter Store.
         * 
         * @return builder
         * 
         */
        public Builder valueFrom(String valueFrom) {
            return valueFrom(Output.of(valueFrom));
        }

        public ServiceServiceConnectConfigurationLogConfigurationSecretOptionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.valueFrom = Objects.requireNonNull($.valueFrom, "expected parameter 'valueFrom' to be non-null");
            return $;
        }
    }

}