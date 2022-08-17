// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayRouteState extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteState Empty = new GatewayRouteState();

    /**
     * The ARN of the gateway route.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the gateway route.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The creation date of the gateway route.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The creation date of the gateway route.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * The last update date of the gateway route.
     * 
     */
    @Import(name="lastUpdatedDate")
    private @Nullable Output<String> lastUpdatedDate;

    /**
     * @return The last update date of the gateway route.
     * 
     */
    public Optional<Output<String>> lastUpdatedDate() {
        return Optional.ofNullable(this.lastUpdatedDate);
    }

    /**
     * The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="meshName")
    private @Nullable Output<String> meshName;

    /**
     * @return The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> meshName() {
        return Optional.ofNullable(this.meshName);
    }

    /**
     * The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    @Import(name="meshOwner")
    private @Nullable Output<String> meshOwner;

    /**
     * @return The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
     * 
     */
    public Optional<Output<String>> meshOwner() {
        return Optional.ofNullable(this.meshOwner);
    }

    /**
     * The name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource owner&#39;s AWS account ID.
     * 
     */
    @Import(name="resourceOwner")
    private @Nullable Output<String> resourceOwner;

    /**
     * @return The resource owner&#39;s AWS account ID.
     * 
     */
    public Optional<Output<String>> resourceOwner() {
        return Optional.ofNullable(this.resourceOwner);
    }

    /**
     * The gateway route specification to apply.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<GatewayRouteSpecArgs> spec;

    /**
     * @return The gateway route specification to apply.
     * 
     */
    public Optional<Output<GatewayRouteSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualGatewayName")
    private @Nullable Output<String> virtualGatewayName;

    /**
     * @return The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    public Optional<Output<String>> virtualGatewayName() {
        return Optional.ofNullable(this.virtualGatewayName);
    }

    private GatewayRouteState() {}

    private GatewayRouteState(GatewayRouteState $) {
        this.arn = $.arn;
        this.createdDate = $.createdDate;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.meshName = $.meshName;
        this.meshOwner = $.meshOwner;
        this.name = $.name;
        this.resourceOwner = $.resourceOwner;
        this.spec = $.spec;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.virtualGatewayName = $.virtualGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteState $;

        public Builder() {
            $ = new GatewayRouteState();
        }

        public Builder(GatewayRouteState defaults) {
            $ = new GatewayRouteState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param createdDate The creation date of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The creation date of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param lastUpdatedDate The last update date of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @param lastUpdatedDate The last update date of the gateway route.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        /**
         * @param meshName The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(@Nullable Output<String> meshName) {
            $.meshName = meshName;
            return this;
        }

        /**
         * @param meshName The name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder meshName(String meshName) {
            return meshName(Output.of(meshName));
        }

        /**
         * @param meshOwner The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            $.meshOwner = meshOwner;
            return this;
        }

        /**
         * @param meshOwner The AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
         * 
         * @return builder
         * 
         */
        public Builder meshOwner(String meshOwner) {
            return meshOwner(Output.of(meshOwner));
        }

        /**
         * @param name The name to use for the gateway route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to use for the gateway route. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceOwner The resource owner&#39;s AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            $.resourceOwner = resourceOwner;
            return this;
        }

        /**
         * @param resourceOwner The resource owner&#39;s AWS account ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceOwner(String resourceOwner) {
            return resourceOwner(Output.of(resourceOwner));
        }

        /**
         * @param spec The gateway route specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<GatewayRouteSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec The gateway route specification to apply.
         * 
         * @return builder
         * 
         */
        public Builder spec(GatewayRouteSpecArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param virtualGatewayName The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayName(@Nullable Output<String> virtualGatewayName) {
            $.virtualGatewayName = virtualGatewayName;
            return this;
        }

        /**
         * @param virtualGatewayName The name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualGatewayName(String virtualGatewayName) {
            return virtualGatewayName(Output.of(virtualGatewayName));
        }

        public GatewayRouteState build() {
            return $;
        }
    }

}