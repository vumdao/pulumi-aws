// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceState Empty = new ResourceState();

    /**
     * Amazon Resource Name (ARN) of the resource.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the resource.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Flag to enable AWS LakeFormation hybrid access permission mode.
     * 
     * &gt; **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
     * 
     */
    @Import(name="hybridAccessEnabled")
    private @Nullable Output<Boolean> hybridAccessEnabled;

    /**
     * @return Flag to enable AWS LakeFormation hybrid access permission mode.
     * 
     * &gt; **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
     * 
     */
    public Optional<Output<Boolean>> hybridAccessEnabled() {
        return Optional.ofNullable(this.hybridAccessEnabled);
    }

    /**
     * Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    /**
     * @return Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    /**
     * Role that has read/write access to the resource.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return Role that has read/write access to the resource.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
     * 
     */
    @Import(name="useServiceLinkedRole")
    private @Nullable Output<Boolean> useServiceLinkedRole;

    /**
     * @return Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
     * 
     */
    public Optional<Output<Boolean>> useServiceLinkedRole() {
        return Optional.ofNullable(this.useServiceLinkedRole);
    }

    @Import(name="withFederation")
    private @Nullable Output<Boolean> withFederation;

    public Optional<Output<Boolean>> withFederation() {
        return Optional.ofNullable(this.withFederation);
    }

    private ResourceState() {}

    private ResourceState(ResourceState $) {
        this.arn = $.arn;
        this.hybridAccessEnabled = $.hybridAccessEnabled;
        this.lastModified = $.lastModified;
        this.roleArn = $.roleArn;
        this.useServiceLinkedRole = $.useServiceLinkedRole;
        this.withFederation = $.withFederation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceState $;

        public Builder() {
            $ = new ResourceState();
        }

        public Builder(ResourceState defaults) {
            $ = new ResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the resource.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param hybridAccessEnabled Flag to enable AWS LakeFormation hybrid access permission mode.
         * 
         * &gt; **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
         * 
         * @return builder
         * 
         */
        public Builder hybridAccessEnabled(@Nullable Output<Boolean> hybridAccessEnabled) {
            $.hybridAccessEnabled = hybridAccessEnabled;
            return this;
        }

        /**
         * @param hybridAccessEnabled Flag to enable AWS LakeFormation hybrid access permission mode.
         * 
         * &gt; **NOTE:** AWS does not support registering an S3 location with an IAM role and subsequently updating the S3 location registration to a service-linked role.
         * 
         * @return builder
         * 
         */
        public Builder hybridAccessEnabled(Boolean hybridAccessEnabled) {
            return hybridAccessEnabled(Output.of(hybridAccessEnabled));
        }

        /**
         * @param lastModified Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param lastModified Date and time the resource was last modified in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        /**
         * @param roleArn Role that has read/write access to the resource.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn Role that has read/write access to the resource.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param useServiceLinkedRole Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder useServiceLinkedRole(@Nullable Output<Boolean> useServiceLinkedRole) {
            $.useServiceLinkedRole = useServiceLinkedRole;
            return this;
        }

        /**
         * @param useServiceLinkedRole Designates an AWS Identity and Access Management (IAM) service-linked role by registering this role with the Data Catalog.
         * 
         * @return builder
         * 
         */
        public Builder useServiceLinkedRole(Boolean useServiceLinkedRole) {
            return useServiceLinkedRole(Output.of(useServiceLinkedRole));
        }

        public Builder withFederation(@Nullable Output<Boolean> withFederation) {
            $.withFederation = withFederation;
            return this;
        }

        public Builder withFederation(Boolean withFederation) {
            return withFederation(Output.of(withFederation));
        }

        public ResourceState build() {
            return $;
        }
    }

}
