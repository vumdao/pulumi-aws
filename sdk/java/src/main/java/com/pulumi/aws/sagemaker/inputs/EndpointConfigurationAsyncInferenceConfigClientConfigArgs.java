// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigClientConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigClientConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigClientConfigArgs();

    /**
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    @Import(name="maxConcurrentInvocationsPerInstance")
    private @Nullable Output<Integer> maxConcurrentInvocationsPerInstance;

    /**
     * @return The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentInvocationsPerInstance() {
        return Optional.ofNullable(this.maxConcurrentInvocationsPerInstance);
    }

    private EndpointConfigurationAsyncInferenceConfigClientConfigArgs() {}

    private EndpointConfigurationAsyncInferenceConfigClientConfigArgs(EndpointConfigurationAsyncInferenceConfigClientConfigArgs $) {
        this.maxConcurrentInvocationsPerInstance = $.maxConcurrentInvocationsPerInstance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationAsyncInferenceConfigClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationAsyncInferenceConfigClientConfigArgs $;

        public Builder() {
            $ = new EndpointConfigurationAsyncInferenceConfigClientConfigArgs();
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigClientConfigArgs defaults) {
            $ = new EndpointConfigurationAsyncInferenceConfigClientConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentInvocationsPerInstance(@Nullable Output<Integer> maxConcurrentInvocationsPerInstance) {
            $.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return this;
        }

        /**
         * @param maxConcurrentInvocationsPerInstance The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentInvocationsPerInstance(Integer maxConcurrentInvocationsPerInstance) {
            return maxConcurrentInvocationsPerInstance(Output.of(maxConcurrentInvocationsPerInstance));
        }

        public EndpointConfigurationAsyncInferenceConfigClientConfigArgs build() {
            return $;
        }
    }

}