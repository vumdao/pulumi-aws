// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftdata;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshiftdata.StatementArgs;
import com.pulumi.aws.redshiftdata.inputs.StatementState;
import com.pulumi.aws.redshiftdata.outputs.StatementParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Executes a Redshift Data Statement.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshiftdata.Statement;
 * import com.pulumi.aws.redshiftdata.StatementArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new Statement(&#34;example&#34;, StatementArgs.builder()        
 *             .clusterIdentifier(aws_redshift_cluster.example().cluster_identifier())
 *             .database(aws_redshift_cluster.example().database_name())
 *             .dbUser(aws_redshift_cluster.example().master_username())
 *             .sql(&#34;CREATE GROUP group_name;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redshift Data Statements can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshiftdata/statement:Statement example example
 * ```
 * 
 */
@ResourceType(type="aws:redshiftdata/statement:Statement")
public class Statement extends com.pulumi.resources.CustomResource {
    /**
     * The cluster identifier.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The name of the database.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The name of the database.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * The database user name.
     * 
     */
    @Export(name="dbUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> dbUser;

    /**
     * @return The database user name.
     * 
     */
    public Output<Optional<String>> dbUser() {
        return Codegen.optional(this.dbUser);
    }
    @Export(name="parameters", type=List.class, parameters={StatementParameter.class})
    private Output</* @Nullable */ List<StatementParameter>> parameters;

    public Output<Optional<List<StatementParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The name or ARN of the secret that enables access to the database.
     * 
     */
    @Export(name="secretArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretArn;

    /**
     * @return The name or ARN of the secret that enables access to the database.
     * 
     */
    public Output<Optional<String>> secretArn() {
        return Codegen.optional(this.secretArn);
    }
    /**
     * The SQL statement text to run.
     * 
     */
    @Export(name="sql", type=String.class, parameters={})
    private Output<String> sql;

    /**
     * @return The SQL statement text to run.
     * 
     */
    public Output<String> sql() {
        return this.sql;
    }
    /**
     * The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    @Export(name="statementName", type=String.class, parameters={})
    private Output</* @Nullable */ String> statementName;

    /**
     * @return The name of the SQL statement. You can name the SQL statement when you create it to identify the query.
     * 
     */
    public Output<Optional<String>> statementName() {
        return Codegen.optional(this.statementName);
    }
    /**
     * A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * 
     */
    @Export(name="withEvent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> withEvent;

    /**
     * @return A value that indicates whether to send an event to the Amazon EventBridge event bus after the SQL statement runs.
     * 
     */
    public Output<Optional<Boolean>> withEvent() {
        return Codegen.optional(this.withEvent);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Statement(String name) {
        this(name, StatementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Statement(String name, StatementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Statement(String name, StatementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftdata/statement:Statement", name, args == null ? StatementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Statement(String name, Output<String> id, @Nullable StatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftdata/statement:Statement", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Statement get(String name, Output<String> id, @Nullable StatementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Statement(name, id, state, options);
    }
}