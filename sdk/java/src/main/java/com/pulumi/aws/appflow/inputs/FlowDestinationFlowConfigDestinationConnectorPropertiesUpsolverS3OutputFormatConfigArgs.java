// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs;
import com.pulumi.aws.appflow.inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs Empty = new FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs();

    /**
     * The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    @Import(name="aggregationConfig")
    private @Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs> aggregationConfig;

    /**
     * @return The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
     * 
     */
    public Optional<Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs>> aggregationConfig() {
        return Optional.ofNullable(this.aggregationConfig);
    }

    /**
     * Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    @Import(name="fileType")
    private @Nullable Output<String> fileType;

    /**
     * @return Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
     * 
     */
    public Optional<Output<String>> fileType() {
        return Optional.ofNullable(this.fileType);
    }

    /**
     * Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    @Import(name="prefixConfig", required=true)
    private Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs> prefixConfig;

    /**
     * @return Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
     * 
     */
    public Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs> prefixConfig() {
        return this.prefixConfig;
    }

    private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs() {}

    private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs $) {
        this.aggregationConfig = $.aggregationConfig;
        this.fileType = $.fileType;
        this.prefixConfig = $.prefixConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs $;

        public Builder() {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs();
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs defaults) {
            $ = new FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregationConfig The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder aggregationConfig(@Nullable Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs> aggregationConfig) {
            $.aggregationConfig = aggregationConfig;
            return this;
        }

        /**
         * @param aggregationConfig The aggregation settings that you can use to customize the output format of your flow data. See Aggregation Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder aggregationConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigAggregationConfigArgs aggregationConfig) {
            return aggregationConfig(Output.of(aggregationConfig));
        }

        /**
         * @param fileType Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
         * 
         * @return builder
         * 
         */
        public Builder fileType(@Nullable Output<String> fileType) {
            $.fileType = fileType;
            return this;
        }

        /**
         * @param fileType Indicates the file type that Amazon AppFlow places in the Upsolver Amazon S3 bucket. Valid values are `CSV`, `JSON`, and `PARQUET`.
         * 
         * @return builder
         * 
         */
        public Builder fileType(String fileType) {
            return fileType(Output.of(fileType));
        }

        /**
         * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder prefixConfig(Output<FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs> prefixConfig) {
            $.prefixConfig = prefixConfig;
            return this;
        }

        /**
         * @param prefixConfig Determines the prefix that Amazon AppFlow applies to the folder name in the Amazon S3 bucket. You can name folders according to the flow frequency and date. See Prefix Config for more details.
         * 
         * @return builder
         * 
         */
        public Builder prefixConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigPrefixConfigArgs prefixConfig) {
            return prefixConfig(Output.of(prefixConfig));
        }

        public FlowDestinationFlowConfigDestinationConnectorPropertiesUpsolverS3OutputFormatConfigArgs build() {
            $.prefixConfig = Objects.requireNonNull($.prefixConfig, "expected parameter 'prefixConfig' to be non-null");
            return $;
        }
    }

}