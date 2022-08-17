// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.inputs;

import com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsTableArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsTableWithColumnsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPermissionsArgs Empty = new GetPermissionsArgs();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    @Import(name="catalogResource")
    private @Nullable Output<Boolean> catalogResource;

    /**
     * @return Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> catalogResource() {
        return Optional.ofNullable(this.catalogResource);
    }

    /**
     * Configuration block for a data location resource. Detailed below.
     * 
     */
    @Import(name="dataLocation")
    private @Nullable Output<GetPermissionsDataLocationArgs> dataLocation;

    /**
     * @return Configuration block for a data location resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsDataLocationArgs>> dataLocation() {
        return Optional.ofNullable(this.dataLocation);
    }

    /**
     * Configuration block for a database resource. Detailed below.
     * 
     */
    @Import(name="database")
    private @Nullable Output<GetPermissionsDatabaseArgs> database;

    /**
     * @return Configuration block for a database resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsDatabaseArgs>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Configuration block for an LF-tag resource. Detailed below.
     * 
     */
    @Import(name="lfTag")
    private @Nullable Output<GetPermissionsLfTagArgs> lfTag;

    /**
     * @return Configuration block for an LF-tag resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsLfTagArgs>> lfTag() {
        return Optional.ofNullable(this.lfTag);
    }

    /**
     * Configuration block for an LF-tag policy resource. Detailed below.
     * 
     */
    @Import(name="lfTagPolicy")
    private @Nullable Output<GetPermissionsLfTagPolicyArgs> lfTagPolicy;

    /**
     * @return Configuration block for an LF-tag policy resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsLfTagPolicyArgs>> lfTagPolicy() {
        return Optional.ofNullable(this.lfTagPolicy);
    }

    /**
     * Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * Configuration block for a table resource. Detailed below.
     * 
     */
    @Import(name="table")
    private @Nullable Output<GetPermissionsTableArgs> table;

    /**
     * @return Configuration block for a table resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsTableArgs>> table() {
        return Optional.ofNullable(this.table);
    }

    /**
     * Configuration block for a table with columns resource. Detailed below.
     * 
     */
    @Import(name="tableWithColumns")
    private @Nullable Output<GetPermissionsTableWithColumnsArgs> tableWithColumns;

    /**
     * @return Configuration block for a table with columns resource. Detailed below.
     * 
     */
    public Optional<Output<GetPermissionsTableWithColumnsArgs>> tableWithColumns() {
        return Optional.ofNullable(this.tableWithColumns);
    }

    private GetPermissionsArgs() {}

    private GetPermissionsArgs(GetPermissionsArgs $) {
        this.catalogId = $.catalogId;
        this.catalogResource = $.catalogResource;
        this.dataLocation = $.dataLocation;
        this.database = $.database;
        this.lfTag = $.lfTag;
        this.lfTagPolicy = $.lfTagPolicy;
        this.principal = $.principal;
        this.table = $.table;
        this.tableWithColumns = $.tableWithColumns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPermissionsArgs $;

        public Builder() {
            $ = new GetPermissionsArgs();
        }

        public Builder(GetPermissionsArgs defaults) {
            $ = new GetPermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        /**
         * @param catalogId Identifier for the Data Catalog. By default, it is the account ID of the caller.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        /**
         * @param catalogResource Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder catalogResource(@Nullable Output<Boolean> catalogResource) {
            $.catalogResource = catalogResource;
            return this;
        }

        /**
         * @param catalogResource Whether the permissions are to be granted for the Data Catalog. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder catalogResource(Boolean catalogResource) {
            return catalogResource(Output.of(catalogResource));
        }

        /**
         * @param dataLocation Configuration block for a data location resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(@Nullable Output<GetPermissionsDataLocationArgs> dataLocation) {
            $.dataLocation = dataLocation;
            return this;
        }

        /**
         * @param dataLocation Configuration block for a data location resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder dataLocation(GetPermissionsDataLocationArgs dataLocation) {
            return dataLocation(Output.of(dataLocation));
        }

        /**
         * @param database Configuration block for a database resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<GetPermissionsDatabaseArgs> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Configuration block for a database resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder database(GetPermissionsDatabaseArgs database) {
            return database(Output.of(database));
        }

        /**
         * @param lfTag Configuration block for an LF-tag resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lfTag(@Nullable Output<GetPermissionsLfTagArgs> lfTag) {
            $.lfTag = lfTag;
            return this;
        }

        /**
         * @param lfTag Configuration block for an LF-tag resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lfTag(GetPermissionsLfTagArgs lfTag) {
            return lfTag(Output.of(lfTag));
        }

        /**
         * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lfTagPolicy(@Nullable Output<GetPermissionsLfTagPolicyArgs> lfTagPolicy) {
            $.lfTagPolicy = lfTagPolicy;
            return this;
        }

        /**
         * @param lfTagPolicy Configuration block for an LF-tag policy resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder lfTagPolicy(GetPermissionsLfTagPolicyArgs lfTagPolicy) {
            return lfTagPolicy(Output.of(lfTagPolicy));
        }

        /**
         * @param principal Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal Principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param table Configuration block for a table resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder table(@Nullable Output<GetPermissionsTableArgs> table) {
            $.table = table;
            return this;
        }

        /**
         * @param table Configuration block for a table resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder table(GetPermissionsTableArgs table) {
            return table(Output.of(table));
        }

        /**
         * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder tableWithColumns(@Nullable Output<GetPermissionsTableWithColumnsArgs> tableWithColumns) {
            $.tableWithColumns = tableWithColumns;
            return this;
        }

        /**
         * @param tableWithColumns Configuration block for a table with columns resource. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder tableWithColumns(GetPermissionsTableWithColumnsArgs tableWithColumns) {
            return tableWithColumns(Output.of(tableWithColumns));
        }

        public GetPermissionsArgs build() {
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            return $;
        }
    }

}