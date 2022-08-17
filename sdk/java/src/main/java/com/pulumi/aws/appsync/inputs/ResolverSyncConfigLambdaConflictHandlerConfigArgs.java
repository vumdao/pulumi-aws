// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverSyncConfigLambdaConflictHandlerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverSyncConfigLambdaConflictHandlerConfigArgs Empty = new ResolverSyncConfigLambdaConflictHandlerConfigArgs();

    /**
     * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    @Import(name="lambdaConflictHandlerArn")
    private @Nullable Output<String> lambdaConflictHandlerArn;

    /**
     * @return The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    public Optional<Output<String>> lambdaConflictHandlerArn() {
        return Optional.ofNullable(this.lambdaConflictHandlerArn);
    }

    private ResolverSyncConfigLambdaConflictHandlerConfigArgs() {}

    private ResolverSyncConfigLambdaConflictHandlerConfigArgs(ResolverSyncConfigLambdaConflictHandlerConfigArgs $) {
        this.lambdaConflictHandlerArn = $.lambdaConflictHandlerArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverSyncConfigLambdaConflictHandlerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverSyncConfigLambdaConflictHandlerConfigArgs $;

        public Builder() {
            $ = new ResolverSyncConfigLambdaConflictHandlerConfigArgs();
        }

        public Builder(ResolverSyncConfigLambdaConflictHandlerConfigArgs defaults) {
            $ = new ResolverSyncConfigLambdaConflictHandlerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerArn(@Nullable Output<String> lambdaConflictHandlerArn) {
            $.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
            return this;
        }

        /**
         * @param lambdaConflictHandlerArn The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
         * 
         * @return builder
         * 
         */
        public Builder lambdaConflictHandlerArn(String lambdaConflictHandlerArn) {
            return lambdaConflictHandlerArn(Output.of(lambdaConflictHandlerArn));
        }

        public ResolverSyncConfigLambdaConflictHandlerConfigArgs build() {
            return $;
        }
    }

}