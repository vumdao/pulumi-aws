// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMfaDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMfaDeviceArgs Empty = new VirtualMfaDeviceArgs();

    /**
     * The path for the virtual MFA device.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path for the virtual MFA device.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    @Import(name="virtualMfaDeviceName", required=true)
    private Output<String> virtualMfaDeviceName;

    /**
     * @return The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    public Output<String> virtualMfaDeviceName() {
        return this.virtualMfaDeviceName;
    }

    private VirtualMfaDeviceArgs() {}

    private VirtualMfaDeviceArgs(VirtualMfaDeviceArgs $) {
        this.path = $.path;
        this.tags = $.tags;
        this.virtualMfaDeviceName = $.virtualMfaDeviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMfaDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMfaDeviceArgs $;

        public Builder() {
            $ = new VirtualMfaDeviceArgs();
        }

        public Builder(VirtualMfaDeviceArgs defaults) {
            $ = new VirtualMfaDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path The path for the virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path for the virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param tags Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualMfaDeviceName The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder virtualMfaDeviceName(Output<String> virtualMfaDeviceName) {
            $.virtualMfaDeviceName = virtualMfaDeviceName;
            return this;
        }

        /**
         * @param virtualMfaDeviceName The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
         * 
         * @return builder
         * 
         */
        public Builder virtualMfaDeviceName(String virtualMfaDeviceName) {
            return virtualMfaDeviceName(Output.of(virtualMfaDeviceName));
        }

        public VirtualMfaDeviceArgs build() {
            $.virtualMfaDeviceName = Objects.requireNonNull($.virtualMfaDeviceName, "expected parameter 'virtualMfaDeviceName' to be non-null");
            return $;
        }
    }

}