// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionTargetActionResizeClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledActionTargetActionResizeClusterArgs Empty = new ScheduledActionTargetActionResizeClusterArgs();

    /**
     * A boolean value indicating whether the resize operation is using the classic resize process. Default: `false`.
     * 
     */
    @Import(name="classic")
    private @Nullable Output<Boolean> classic;

    /**
     * @return A boolean value indicating whether the resize operation is using the classic resize process. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> classic() {
        return Optional.ofNullable(this.classic);
    }

    /**
     * The identifier of the cluster to be resumed.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the cluster to be resumed.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The new cluster type for the specified cluster.
     * 
     */
    @Import(name="clusterType")
    private @Nullable Output<String> clusterType;

    /**
     * @return The new cluster type for the specified cluster.
     * 
     */
    public Optional<Output<String>> clusterType() {
        return Optional.ofNullable(this.clusterType);
    }

    /**
     * The new node type for the nodes you are adding.
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return The new node type for the nodes you are adding.
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * The new number of nodes for the cluster.
     * 
     */
    @Import(name="numberOfNodes")
    private @Nullable Output<Integer> numberOfNodes;

    /**
     * @return The new number of nodes for the cluster.
     * 
     */
    public Optional<Output<Integer>> numberOfNodes() {
        return Optional.ofNullable(this.numberOfNodes);
    }

    private ScheduledActionTargetActionResizeClusterArgs() {}

    private ScheduledActionTargetActionResizeClusterArgs(ScheduledActionTargetActionResizeClusterArgs $) {
        this.classic = $.classic;
        this.clusterIdentifier = $.clusterIdentifier;
        this.clusterType = $.clusterType;
        this.nodeType = $.nodeType;
        this.numberOfNodes = $.numberOfNodes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionTargetActionResizeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionTargetActionResizeClusterArgs $;

        public Builder() {
            $ = new ScheduledActionTargetActionResizeClusterArgs();
        }

        public Builder(ScheduledActionTargetActionResizeClusterArgs defaults) {
            $ = new ScheduledActionTargetActionResizeClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classic A boolean value indicating whether the resize operation is using the classic resize process. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder classic(@Nullable Output<Boolean> classic) {
            $.classic = classic;
            return this;
        }

        /**
         * @param classic A boolean value indicating whether the resize operation is using the classic resize process. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder classic(Boolean classic) {
            return classic(Output.of(classic));
        }

        /**
         * @param clusterIdentifier The identifier of the cluster to be resumed.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The identifier of the cluster to be resumed.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param clusterType The new cluster type for the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(@Nullable Output<String> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param clusterType The new cluster type for the specified cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            return clusterType(Output.of(clusterType));
        }

        /**
         * @param nodeType The new node type for the nodes you are adding.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The new node type for the nodes you are adding.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param numberOfNodes The new number of nodes for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(@Nullable Output<Integer> numberOfNodes) {
            $.numberOfNodes = numberOfNodes;
            return this;
        }

        /**
         * @param numberOfNodes The new number of nodes for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder numberOfNodes(Integer numberOfNodes) {
            return numberOfNodes(Output.of(numberOfNodes));
        }

        public ScheduledActionTargetActionResizeClusterArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}