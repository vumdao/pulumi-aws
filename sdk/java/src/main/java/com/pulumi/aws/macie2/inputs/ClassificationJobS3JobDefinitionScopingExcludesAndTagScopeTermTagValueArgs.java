// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs Empty = new ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs();

    /**
     * The tag key.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The tag key.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The tag value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The tag value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs() {}

    private ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs(ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The tag key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The tag value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClassificationJobS3JobDefinitionScopingExcludesAndTagScopeTermTagValueArgs build() {
            return $;
        }
    }

}