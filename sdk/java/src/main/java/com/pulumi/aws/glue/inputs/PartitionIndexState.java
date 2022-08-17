// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.PartitionIndexPartitionIndexArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartitionIndexState extends com.pulumi.resources.ResourceArgs {

    public static final PartitionIndexState Empty = new PartitionIndexState();

    /**
     * The catalog ID where the table resides.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return The catalog ID where the table resides.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    /**
     * @return Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * 
     */
    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * Configuration block for a partition index. See `partition_index` below.
     * 
     */
    @Import(name="partitionIndex")
    private @Nullable Output<PartitionIndexPartitionIndexArgs> partitionIndex;

    /**
     * @return Configuration block for a partition index. See `partition_index` below.
     * 
     */
    public Optional<Output<PartitionIndexPartitionIndexArgs>> partitionIndex() {
        return Optional.ofNullable(this.partitionIndex);
    }

    /**
     * Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return Name of the table. For Hive compatibility, this must be entirely lowercase.
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private PartitionIndexState() {}

    private PartitionIndexState(PartitionIndexState $) {
        this.catalogId = $.catalogId;
        this.databaseName = $.databaseName;
        this.partitionIndex = $.partitionIndex;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartitionIndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartitionIndexState $;

        public Builder() {
            $ = new PartitionIndexState();
        }

        public Builder(PartitionIndexState defaults) {
            $ = new PartitionIndexState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId The catalog ID where the table resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId The catalog ID where the table resides.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param databaseName Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName Name of the metadata database where the table metadata resides. For Hive compatibility, this must be all lowercase.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param partitionIndex Configuration block for a partition index. See `partition_index` below.
         * 
         * @return builder
         * 
         */
        public Builder partitionIndex(@Nullable Output<PartitionIndexPartitionIndexArgs> partitionIndex) {
            $.partitionIndex = partitionIndex;
            return this;
        }

        /**
         * @param partitionIndex Configuration block for a partition index. See `partition_index` below.
         * 
         * @return builder
         * 
         */
        public Builder partitionIndex(PartitionIndexPartitionIndexArgs partitionIndex) {
            return partitionIndex(Output.of(partitionIndex));
        }

        /**
         * @param tableName Name of the table. For Hive compatibility, this must be entirely lowercase.
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName Name of the table. For Hive compatibility, this must be entirely lowercase.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public PartitionIndexState build() {
            return $;
        }
    }

}