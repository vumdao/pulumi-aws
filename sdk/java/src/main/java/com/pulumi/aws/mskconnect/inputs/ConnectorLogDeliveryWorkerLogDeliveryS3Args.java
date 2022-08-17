// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorLogDeliveryWorkerLogDeliveryS3Args extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorLogDeliveryWorkerLogDeliveryS3Args Empty = new ConnectorLogDeliveryWorkerLogDeliveryS3Args();

    /**
     * The name of the S3 bucket that is the destination for log delivery.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the S3 bucket that is the destination for log delivery.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether connector logs get sent to the specified Amazon S3 destination.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The S3 prefix that is the destination for log delivery.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The S3 prefix that is the destination for log delivery.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    private ConnectorLogDeliveryWorkerLogDeliveryS3Args() {}

    private ConnectorLogDeliveryWorkerLogDeliveryS3Args(ConnectorLogDeliveryWorkerLogDeliveryS3Args $) {
        this.bucket = $.bucket;
        this.enabled = $.enabled;
        this.prefix = $.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorLogDeliveryWorkerLogDeliveryS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorLogDeliveryWorkerLogDeliveryS3Args $;

        public Builder() {
            $ = new ConnectorLogDeliveryWorkerLogDeliveryS3Args();
        }

        public Builder(ConnectorLogDeliveryWorkerLogDeliveryS3Args defaults) {
            $ = new ConnectorLogDeliveryWorkerLogDeliveryS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the S3 bucket that is the destination for log delivery.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the S3 bucket that is the destination for log delivery.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param enabled Specifies whether connector logs get sent to the specified Amazon S3 destination.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether connector logs get sent to the specified Amazon S3 destination.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param prefix The S3 prefix that is the destination for log delivery.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The S3 prefix that is the destination for log delivery.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public ConnectorLogDeliveryWorkerLogDeliveryS3Args build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}