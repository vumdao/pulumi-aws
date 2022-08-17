// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenIdConnectProviderState extends com.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectProviderState Empty = new OpenIdConnectProviderState();

    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this provider.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
     * 
     */
    @Import(name="clientIdLists")
    private @Nullable Output<List<String>> clientIdLists;

    /**
     * @return A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
     * 
     */
    public Optional<Output<List<String>>> clientIdLists() {
        return Optional.ofNullable(this.clientIdLists);
    }

    /**
     * Map of resource tags for the IAM OIDC provider. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of resource tags for the IAM OIDC provider. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
     * 
     */
    @Import(name="thumbprintLists")
    private @Nullable Output<List<String>> thumbprintLists;

    /**
     * @return A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
     * 
     */
    public Optional<Output<List<String>>> thumbprintLists() {
        return Optional.ofNullable(this.thumbprintLists);
    }

    /**
     * The URL of the identity provider. Corresponds to the _iss_ claim.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the identity provider. Corresponds to the _iss_ claim.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private OpenIdConnectProviderState() {}

    private OpenIdConnectProviderState(OpenIdConnectProviderState $) {
        this.arn = $.arn;
        this.clientIdLists = $.clientIdLists;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.thumbprintLists = $.thumbprintLists;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdConnectProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdConnectProviderState $;

        public Builder() {
            $ = new OpenIdConnectProviderState();
        }

        public Builder(OpenIdConnectProviderState defaults) {
            $ = new OpenIdConnectProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN assigned by AWS for this provider.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN assigned by AWS for this provider.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param clientIdLists A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
         * 
         * @return builder
         * 
         */
        public Builder clientIdLists(@Nullable Output<List<String>> clientIdLists) {
            $.clientIdLists = clientIdLists;
            return this;
        }

        /**
         * @param clientIdLists A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
         * 
         * @return builder
         * 
         */
        public Builder clientIdLists(List<String> clientIdLists) {
            return clientIdLists(Output.of(clientIdLists));
        }

        /**
         * @param clientIdLists A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that&#39;s sent as the client_id parameter on OAuth requests.)
         * 
         * @return builder
         * 
         */
        public Builder clientIdLists(String... clientIdLists) {
            return clientIdLists(List.of(clientIdLists));
        }

        /**
         * @param tags Map of resource tags for the IAM OIDC provider. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of resource tags for the IAM OIDC provider. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
         * @param thumbprintLists A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
         * 
         * @return builder
         * 
         */
        public Builder thumbprintLists(@Nullable Output<List<String>> thumbprintLists) {
            $.thumbprintLists = thumbprintLists;
            return this;
        }

        /**
         * @param thumbprintLists A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
         * 
         * @return builder
         * 
         */
        public Builder thumbprintLists(List<String> thumbprintLists) {
            return thumbprintLists(Output.of(thumbprintLists));
        }

        /**
         * @param thumbprintLists A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider&#39;s server certificate(s).
         * 
         * @return builder
         * 
         */
        public Builder thumbprintLists(String... thumbprintLists) {
            return thumbprintLists(List.of(thumbprintLists));
        }

        /**
         * @param url The URL of the identity provider. Corresponds to the _iss_ claim.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the identity provider. Corresponds to the _iss_ claim.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public OpenIdConnectProviderState build() {
            return $;
        }
    }

}