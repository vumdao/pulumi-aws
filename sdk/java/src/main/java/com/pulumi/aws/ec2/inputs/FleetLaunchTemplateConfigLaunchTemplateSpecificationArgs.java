// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs Empty = new FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs();

    /**
     * ID of the launch template.
     * 
     */
    @Import(name="launchTemplateId")
    private @Nullable Output<String> launchTemplateId;

    /**
     * @return ID of the launch template.
     * 
     */
    public Optional<Output<String>> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }

    /**
     * Name of the launch template.
     * 
     */
    @Import(name="launchTemplateName")
    private @Nullable Output<String> launchTemplateName;

    /**
     * @return Name of the launch template.
     * 
     */
    public Optional<Output<String>> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }

    /**
     * Version number of the launch template.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Version number of the launch template.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs() {}

    private FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs(FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs $) {
        this.launchTemplateId = $.launchTemplateId;
        this.launchTemplateName = $.launchTemplateName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs $;

        public Builder() {
            $ = new FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs();
        }

        public Builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs defaults) {
            $ = new FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param launchTemplateId ID of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            $.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * @param launchTemplateId ID of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(String launchTemplateId) {
            return launchTemplateId(Output.of(launchTemplateId));
        }

        /**
         * @param launchTemplateName Name of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateName(@Nullable Output<String> launchTemplateName) {
            $.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * @param launchTemplateName Name of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateName(String launchTemplateName) {
            return launchTemplateName(Output.of(launchTemplateName));
        }

        /**
         * @param version Version number of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version number of the launch template.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public FleetLaunchTemplateConfigLaunchTemplateSpecificationArgs build() {
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}