// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    /**
     * The tag name.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The tag name.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The ID of the EC2 resource to manage the tag for.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The ID of the EC2 resource to manage the tag for.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The value of the tag.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value of the tag.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private TagArgs() {}

    private TagArgs(TagArgs $) {
        this.key = $.key;
        this.resourceId = $.resourceId;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagArgs $;

        public Builder() {
            $ = new TagArgs();
        }

        public Builder(TagArgs defaults) {
            $ = new TagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The tag name.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The tag name.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param resourceId The ID of the EC2 resource to manage the tag for.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the EC2 resource to manage the tag for.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param value The value of the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the tag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}