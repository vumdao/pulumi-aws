// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.aws.networkmanager.inputs.CoreNetworkEdgeArgs;
import com.pulumi.aws.networkmanager.inputs.CoreNetworkSegmentArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CoreNetworkState extends com.pulumi.resources.ResourceArgs {

    public static final CoreNetworkState Empty = new CoreNetworkState();

    /**
     * Core Network Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Core Network Amazon Resource Name (ARN).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Timestamp when a core network was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return Timestamp when a core network was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Description of the Core Network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Core Network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * One or more blocks detailing the edges within a core network. Detailed below.
     * 
     */
    @Import(name="edges")
    private @Nullable Output<List<CoreNetworkEdgeArgs>> edges;

    /**
     * @return One or more blocks detailing the edges within a core network. Detailed below.
     * 
     */
    public Optional<Output<List<CoreNetworkEdgeArgs>>> edges() {
        return Optional.ofNullable(this.edges);
    }

    /**
     * The ID of the global network that a core network will be a part of.
     * 
     */
    @Import(name="globalNetworkId")
    private @Nullable Output<String> globalNetworkId;

    /**
     * @return The ID of the global network that a core network will be a part of.
     * 
     */
    public Optional<Output<String>> globalNetworkId() {
        return Optional.ofNullable(this.globalNetworkId);
    }

    /**
     * Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     * 
     */
    @Import(name="policyDocument")
    private @Nullable Output<String> policyDocument;

    /**
     * @return Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
     * 
     */
    public Optional<Output<String>> policyDocument() {
        return Optional.ofNullable(this.policyDocument);
    }

    /**
     * One or more blocks detailing the segments within a core network. Detailed below.
     * 
     */
    @Import(name="segments")
    private @Nullable Output<List<CoreNetworkSegmentArgs>> segments;

    /**
     * @return One or more blocks detailing the segments within a core network. Detailed below.
     * 
     */
    public Optional<Output<List<CoreNetworkSegmentArgs>>> segments() {
        return Optional.ofNullable(this.segments);
    }

    /**
     * Current state of a core network.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return Current state of a core network.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    private CoreNetworkState() {}

    private CoreNetworkState(CoreNetworkState $) {
        this.arn = $.arn;
        this.createdAt = $.createdAt;
        this.description = $.description;
        this.edges = $.edges;
        this.globalNetworkId = $.globalNetworkId;
        this.policyDocument = $.policyDocument;
        this.segments = $.segments;
        this.state = $.state;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CoreNetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CoreNetworkState $;

        public Builder() {
            $ = new CoreNetworkState();
        }

        public Builder(CoreNetworkState defaults) {
            $ = new CoreNetworkState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Core Network Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Core Network Amazon Resource Name (ARN).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param createdAt Timestamp when a core network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt Timestamp when a core network was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param description Description of the Core Network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Core Network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param edges One or more blocks detailing the edges within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder edges(@Nullable Output<List<CoreNetworkEdgeArgs>> edges) {
            $.edges = edges;
            return this;
        }

        /**
         * @param edges One or more blocks detailing the edges within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder edges(List<CoreNetworkEdgeArgs> edges) {
            return edges(Output.of(edges));
        }

        /**
         * @param edges One or more blocks detailing the edges within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder edges(CoreNetworkEdgeArgs... edges) {
            return edges(List.of(edges));
        }

        /**
         * @param globalNetworkId The ID of the global network that a core network will be a part of.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(@Nullable Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the global network that a core network will be a part of.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param policyDocument Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(@Nullable Output<String> policyDocument) {
            $.policyDocument = policyDocument;
            return this;
        }

        /**
         * @param policyDocument Policy document for creating a core network. Note that updating this argument will result in the new policy document version being set as the `LATEST` and `LIVE` policy document. Refer to the [Core network policies documentation](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder policyDocument(String policyDocument) {
            return policyDocument(Output.of(policyDocument));
        }

        /**
         * @param segments One or more blocks detailing the segments within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder segments(@Nullable Output<List<CoreNetworkSegmentArgs>> segments) {
            $.segments = segments;
            return this;
        }

        /**
         * @param segments One or more blocks detailing the segments within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder segments(List<CoreNetworkSegmentArgs> segments) {
            return segments(Output.of(segments));
        }

        /**
         * @param segments One or more blocks detailing the segments within a core network. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder segments(CoreNetworkSegmentArgs... segments) {
            return segments(List.of(segments));
        }

        /**
         * @param state Current state of a core network.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state Current state of a core network.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the Core Network. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public CoreNetworkState build() {
            return $;
        }
    }

}