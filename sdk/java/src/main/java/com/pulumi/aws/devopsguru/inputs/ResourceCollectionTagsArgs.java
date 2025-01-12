// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devopsguru.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ResourceCollectionTagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceCollectionTagsArgs Empty = new ResourceCollectionTagsArgs();

    /**
     * An AWS tag key that is used to identify the AWS resources that DevOps Guru analyzes. All AWS resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary. The key must begin with the prefix `DevOps-Guru-`. Any casing can be used for the prefix, but the associated tags __must use the same casing__ in their tag key.
     * 
     */
    @Import(name="appBoundaryKey", required=true)
    private Output<String> appBoundaryKey;

    /**
     * @return An AWS tag key that is used to identify the AWS resources that DevOps Guru analyzes. All AWS resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary. The key must begin with the prefix `DevOps-Guru-`. Any casing can be used for the prefix, but the associated tags __must use the same casing__ in their tag key.
     * 
     */
    public Output<String> appBoundaryKey() {
        return this.appBoundaryKey;
    }

    /**
     * Array of tag values. These can be used to further filter for specific resources within the application boundary. To analyze all resources tagged with the `app_boundary_key` regardless of the corresponding tag value, this array should be a single item containing a wildcard (`&#34;*&#34;`).
     * 
     */
    @Import(name="tagValues", required=true)
    private Output<List<String>> tagValues;

    /**
     * @return Array of tag values. These can be used to further filter for specific resources within the application boundary. To analyze all resources tagged with the `app_boundary_key` regardless of the corresponding tag value, this array should be a single item containing a wildcard (`&#34;*&#34;`).
     * 
     */
    public Output<List<String>> tagValues() {
        return this.tagValues;
    }

    private ResourceCollectionTagsArgs() {}

    private ResourceCollectionTagsArgs(ResourceCollectionTagsArgs $) {
        this.appBoundaryKey = $.appBoundaryKey;
        this.tagValues = $.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceCollectionTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCollectionTagsArgs $;

        public Builder() {
            $ = new ResourceCollectionTagsArgs();
        }

        public Builder(ResourceCollectionTagsArgs defaults) {
            $ = new ResourceCollectionTagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appBoundaryKey An AWS tag key that is used to identify the AWS resources that DevOps Guru analyzes. All AWS resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary. The key must begin with the prefix `DevOps-Guru-`. Any casing can be used for the prefix, but the associated tags __must use the same casing__ in their tag key.
         * 
         * @return builder
         * 
         */
        public Builder appBoundaryKey(Output<String> appBoundaryKey) {
            $.appBoundaryKey = appBoundaryKey;
            return this;
        }

        /**
         * @param appBoundaryKey An AWS tag key that is used to identify the AWS resources that DevOps Guru analyzes. All AWS resources in your account and Region tagged with this key make up your DevOps Guru application and analysis boundary. The key must begin with the prefix `DevOps-Guru-`. Any casing can be used for the prefix, but the associated tags __must use the same casing__ in their tag key.
         * 
         * @return builder
         * 
         */
        public Builder appBoundaryKey(String appBoundaryKey) {
            return appBoundaryKey(Output.of(appBoundaryKey));
        }

        /**
         * @param tagValues Array of tag values. These can be used to further filter for specific resources within the application boundary. To analyze all resources tagged with the `app_boundary_key` regardless of the corresponding tag value, this array should be a single item containing a wildcard (`&#34;*&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder tagValues(Output<List<String>> tagValues) {
            $.tagValues = tagValues;
            return this;
        }

        /**
         * @param tagValues Array of tag values. These can be used to further filter for specific resources within the application boundary. To analyze all resources tagged with the `app_boundary_key` regardless of the corresponding tag value, this array should be a single item containing a wildcard (`&#34;*&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder tagValues(List<String> tagValues) {
            return tagValues(Output.of(tagValues));
        }

        /**
         * @param tagValues Array of tag values. These can be used to further filter for specific resources within the application boundary. To analyze all resources tagged with the `app_boundary_key` regardless of the corresponding tag value, this array should be a single item containing a wildcard (`&#34;*&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder tagValues(String... tagValues) {
            return tagValues(List.of(tagValues));
        }

        public ResourceCollectionTagsArgs build() {
            if ($.appBoundaryKey == null) {
                throw new MissingRequiredPropertyException("ResourceCollectionTagsArgs", "appBoundaryKey");
            }
            if ($.tagValues == null) {
                throw new MissingRequiredPropertyException("ResourceCollectionTagsArgs", "tagValues");
            }
            return $;
        }
    }

}
