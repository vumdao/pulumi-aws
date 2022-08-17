// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.aws.ebs.inputs.GetSnapshotIdsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotIdsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotIdsPlainArgs Empty = new GetSnapshotIdsPlainArgs();

    /**
     * One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSnapshotIdsFilter> filters;

    /**
     * @return One or more name/value pairs to filter off of. There are
     * several valid keys, for a full reference, check out
     * [describe-volumes in the AWS CLI reference][1].
     * 
     */
    public Optional<List<GetSnapshotIdsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
     * 
     */
    @Import(name="owners")
    private @Nullable List<String> owners;

    /**
     * @return Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
     * 
     */
    public Optional<List<String>> owners() {
        return Optional.ofNullable(this.owners);
    }

    /**
     * One or more AWS accounts IDs that can create volumes from the snapshot.
     * 
     */
    @Import(name="restorableByUserIds")
    private @Nullable List<String> restorableByUserIds;

    /**
     * @return One or more AWS accounts IDs that can create volumes from the snapshot.
     * 
     */
    public Optional<List<String>> restorableByUserIds() {
        return Optional.ofNullable(this.restorableByUserIds);
    }

    private GetSnapshotIdsPlainArgs() {}

    private GetSnapshotIdsPlainArgs(GetSnapshotIdsPlainArgs $) {
        this.filters = $.filters;
        this.owners = $.owners;
        this.restorableByUserIds = $.restorableByUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotIdsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotIdsPlainArgs $;

        public Builder() {
            $ = new GetSnapshotIdsPlainArgs();
        }

        public Builder(GetSnapshotIdsPlainArgs defaults) {
            $ = new GetSnapshotIdsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-volumes in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSnapshotIdsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more name/value pairs to filter off of. There are
         * several valid keys, for a full reference, check out
         * [describe-volumes in the AWS CLI reference][1].
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSnapshotIdsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param owners Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
         * 
         * @return builder
         * 
         */
        public Builder owners(@Nullable List<String> owners) {
            $.owners = owners;
            return this;
        }

        /**
         * @param owners Returns the snapshots owned by the specified owner id. Multiple owners can be specified.
         * 
         * @return builder
         * 
         */
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }

        /**
         * @param restorableByUserIds One or more AWS accounts IDs that can create volumes from the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder restorableByUserIds(@Nullable List<String> restorableByUserIds) {
            $.restorableByUserIds = restorableByUserIds;
            return this;
        }

        /**
         * @param restorableByUserIds One or more AWS accounts IDs that can create volumes from the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder restorableByUserIds(String... restorableByUserIds) {
            return restorableByUserIds(List.of(restorableByUserIds));
        }

        public GetSnapshotIdsPlainArgs build() {
            return $;
        }
    }

}