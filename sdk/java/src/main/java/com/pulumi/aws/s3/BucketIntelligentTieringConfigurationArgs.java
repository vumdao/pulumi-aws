// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationFilterArgs;
import com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationTieringArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketIntelligentTieringConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketIntelligentTieringConfigurationArgs Empty = new BucketIntelligentTieringConfigurationArgs();

    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter;

    /**
     * @return A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    public Optional<Output<BucketIntelligentTieringConfigurationFilterArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @Import(name="tierings", required=true)
    private Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings;

    /**
     * @return The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    public Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings() {
        return this.tierings;
    }

    private BucketIntelligentTieringConfigurationArgs() {}

    private BucketIntelligentTieringConfigurationArgs(BucketIntelligentTieringConfigurationArgs $) {
        this.bucket = $.bucket;
        this.filter = $.filter;
        this.name = $.name;
        this.status = $.status;
        this.tierings = $.tierings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketIntelligentTieringConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIntelligentTieringConfigurationArgs $;

        public Builder() {
            $ = new BucketIntelligentTieringConfigurationArgs();
        }

        public Builder(BucketIntelligentTieringConfigurationArgs defaults) {
            $ = new BucketIntelligentTieringConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket this intelligent tiering configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket this intelligent tiering configuration is associated with.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param filter A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<BucketIntelligentTieringConfigurationFilterArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(BucketIntelligentTieringConfigurationFilterArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param name The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param status Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(Output<List<BucketIntelligentTieringConfigurationTieringArgs>> tierings) {
            $.tierings = tierings;
            return this;
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(List<BucketIntelligentTieringConfigurationTieringArgs> tierings) {
            return tierings(Output.of(tierings));
        }

        /**
         * @param tierings The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder tierings(BucketIntelligentTieringConfigurationTieringArgs... tierings) {
            return tierings(List.of(tierings));
        }

        public BucketIntelligentTieringConfigurationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.tierings = Objects.requireNonNull($.tierings, "expected parameter 'tierings' to be non-null");
            return $;
        }
    }

}