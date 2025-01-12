// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketObjectv2OverrideProviderDefaultTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectv2OverrideProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectv2OverrideProviderArgs Empty = new BucketObjectv2OverrideProviderArgs();

    /**
     * Override the provider `default_tags` configuration block.
     * 
     */
    @Import(name="defaultTags")
    private @Nullable Output<BucketObjectv2OverrideProviderDefaultTagsArgs> defaultTags;

    /**
     * @return Override the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<BucketObjectv2OverrideProviderDefaultTagsArgs>> defaultTags() {
        return Optional.ofNullable(this.defaultTags);
    }

    private BucketObjectv2OverrideProviderArgs() {}

    private BucketObjectv2OverrideProviderArgs(BucketObjectv2OverrideProviderArgs $) {
        this.defaultTags = $.defaultTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectv2OverrideProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectv2OverrideProviderArgs $;

        public Builder() {
            $ = new BucketObjectv2OverrideProviderArgs();
        }

        public Builder(BucketObjectv2OverrideProviderArgs defaults) {
            $ = new BucketObjectv2OverrideProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultTags Override the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder defaultTags(@Nullable Output<BucketObjectv2OverrideProviderDefaultTagsArgs> defaultTags) {
            $.defaultTags = defaultTags;
            return this;
        }

        /**
         * @param defaultTags Override the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder defaultTags(BucketObjectv2OverrideProviderDefaultTagsArgs defaultTags) {
            return defaultTags(Output.of(defaultTags));
        }

        public BucketObjectv2OverrideProviderArgs build() {
            return $;
        }
    }

}
