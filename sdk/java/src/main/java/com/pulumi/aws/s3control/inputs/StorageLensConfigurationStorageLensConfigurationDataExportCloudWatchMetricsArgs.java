// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs Empty = new StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs();

    /**
     * Whether CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether CloudWatch publishing for S3 Storage Lens metrics is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs() {}

    private StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs(StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs $;

        public Builder() {
            $ = new StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs();
        }

        public Builder(StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs defaults) {
            $ = new StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether CloudWatch publishing for S3 Storage Lens metrics is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether CloudWatch publishing for S3 Storage Lens metrics is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}