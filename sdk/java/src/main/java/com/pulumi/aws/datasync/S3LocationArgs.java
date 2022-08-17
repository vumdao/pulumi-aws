// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class S3LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final S3LocationArgs Empty = new S3LocationArgs();

    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Import(name="agentArns")
    private @Nullable Output<List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Optional<Output<List<String>>> agentArns() {
        return Optional.ofNullable(this.agentArns);
    }

    /**
     * Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    @Import(name="s3BucketArn", required=true)
    private Output<String> s3BucketArn;

    /**
     * @return Amazon Resource Name (ARN) of the S3 Bucket.
     * 
     */
    public Output<String> s3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * Configuration block containing information for connecting to S3.
     * 
     */
    @Import(name="s3Config", required=true)
    private Output<S3LocationS3ConfigArgs> s3Config;

    /**
     * @return Configuration block containing information for connecting to S3.
     * 
     */
    public Output<S3LocationS3ConfigArgs> s3Config() {
        return this.s3Config;
    }

    /**
     * The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    @Import(name="s3StorageClass")
    private @Nullable Output<String> s3StorageClass;

    /**
     * @return The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
     * 
     */
    public Optional<Output<String>> s3StorageClass() {
        return Optional.ofNullable(this.s3StorageClass);
    }

    /**
     * Prefix to perform actions as source or destination.
     * 
     */
    @Import(name="subdirectory", required=true)
    private Output<String> subdirectory;

    /**
     * @return Prefix to perform actions as source or destination.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }

    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private S3LocationArgs() {}

    private S3LocationArgs(S3LocationArgs $) {
        this.agentArns = $.agentArns;
        this.s3BucketArn = $.s3BucketArn;
        this.s3Config = $.s3Config;
        this.s3StorageClass = $.s3StorageClass;
        this.subdirectory = $.subdirectory;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(S3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private S3LocationArgs $;

        public Builder() {
            $ = new S3LocationArgs();
        }

        public Builder(S3LocationArgs defaults) {
            $ = new S3LocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(@Nullable Output<List<String>> agentArns) {
            $.agentArns = agentArns;
            return this;
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(List<String> agentArns) {
            return agentArns(Output.of(agentArns));
        }

        /**
         * @param agentArns A list of DataSync Agent ARNs with which this location will be associated.
         * 
         * @return builder
         * 
         */
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }

        /**
         * @param s3BucketArn Amazon Resource Name (ARN) of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(Output<String> s3BucketArn) {
            $.s3BucketArn = s3BucketArn;
            return this;
        }

        /**
         * @param s3BucketArn Amazon Resource Name (ARN) of the S3 Bucket.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketArn(String s3BucketArn) {
            return s3BucketArn(Output.of(s3BucketArn));
        }

        /**
         * @param s3Config Configuration block containing information for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3Config(Output<S3LocationS3ConfigArgs> s3Config) {
            $.s3Config = s3Config;
            return this;
        }

        /**
         * @param s3Config Configuration block containing information for connecting to S3.
         * 
         * @return builder
         * 
         */
        public Builder s3Config(S3LocationS3ConfigArgs s3Config) {
            return s3Config(Output.of(s3Config));
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(@Nullable Output<String> s3StorageClass) {
            $.s3StorageClass = s3StorageClass;
            return this;
        }

        /**
         * @param s3StorageClass The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
         * 
         * @return builder
         * 
         */
        public Builder s3StorageClass(String s3StorageClass) {
            return s3StorageClass(Output.of(s3StorageClass));
        }

        /**
         * @param subdirectory Prefix to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(Output<String> subdirectory) {
            $.subdirectory = subdirectory;
            return this;
        }

        /**
         * @param subdirectory Prefix to perform actions as source or destination.
         * 
         * @return builder
         * 
         */
        public Builder subdirectory(String subdirectory) {
            return subdirectory(Output.of(subdirectory));
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public S3LocationArgs build() {
            $.s3BucketArn = Objects.requireNonNull($.s3BucketArn, "expected parameter 's3BucketArn' to be non-null");
            $.s3Config = Objects.requireNonNull($.s3Config, "expected parameter 's3Config' to be non-null");
            $.subdirectory = Objects.requireNonNull($.subdirectory, "expected parameter 'subdirectory' to be non-null");
            return $;
        }
    }

}