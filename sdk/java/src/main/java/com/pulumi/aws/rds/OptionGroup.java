// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.OptionGroupArgs;
import com.pulumi.aws.rds.inputs.OptionGroupState;
import com.pulumi.aws.rds.outputs.OptionGroupOption;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB option group resource. Documentation of the available options for various RDS engines can be found at:
 * 
 * * [MariaDB Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MariaDB.Options.html)
 * * [Microsoft SQL Server Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.SQLServer.Options.html)
 * * [MySQL Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.MySQL.Options.html)
 * * [Oracle Options](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.Options.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.OptionGroup;
 * import com.pulumi.aws.rds.OptionGroupArgs;
 * import com.pulumi.aws.rds.inputs.OptionGroupOptionArgs;
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
 *         var example = new OptionGroup(&#34;example&#34;, OptionGroupArgs.builder()        
 *             .optionGroupDescription(&#34;Option Group&#34;)
 *             .engineName(&#34;sqlserver-ee&#34;)
 *             .majorEngineVersion(&#34;11.00&#34;)
 *             .options(            
 *                 OptionGroupOptionArgs.builder()
 *                     .optionName(&#34;Timezone&#34;)
 *                     .optionSettings(OptionGroupOptionOptionSettingArgs.builder()
 *                         .name(&#34;TIME_ZONE&#34;)
 *                         .value(&#34;UTC&#34;)
 *                         .build())
 *                     .build(),
 *                 OptionGroupOptionArgs.builder()
 *                     .optionName(&#34;SQLSERVER_BACKUP_RESTORE&#34;)
 *                     .optionSettings(OptionGroupOptionOptionSettingArgs.builder()
 *                         .name(&#34;IAM_ROLE_ARN&#34;)
 *                         .value(aws_iam_role.example().arn())
 *                         .build())
 *                     .build(),
 *                 OptionGroupOptionArgs.builder()
 *                     .optionName(&#34;TDE&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **Note**: Any modifications to the `aws.rds.OptionGroup` are set to happen immediately as we default to applying immediately.
 * 
 * &gt; **WARNING:** You can perform a destroy on a `aws.rds.OptionGroup`, as long as it is not associated with any Amazon RDS resource. An option group can be associated with a DB instance, a manual DB snapshot, or an automated DB snapshot.
 * 
 * If you try to delete an option group that is associated with an Amazon RDS resource, an error similar to the following is returned:
 * 
 * &gt; An error occurred (InvalidOptionGroupStateFault) when calling the DeleteOptionGroup operation: The option group &#39;optionGroupName&#39; cannot be deleted because it is in use.
 * 
 * More information about this can be found [here](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithOptionGroups.html#USER_WorkingWithOptionGroups.Delete).
 * 
 * ## Import
 * 
 * DB Option groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/optionGroup:OptionGroup example mysql-option-group
 * ```
 * 
 */
@ResourceType(type="aws:rds/optionGroup:OptionGroup")
public class OptionGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the db option group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the db option group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the name of the engine that this option group should be associated with.
     * 
     */
    @Export(name="engineName", type=String.class, parameters={})
    private Output<String> engineName;

    /**
     * @return Specifies the name of the engine that this option group should be associated with.
     * 
     */
    public Output<String> engineName() {
        return this.engineName;
    }
    /**
     * Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    @Export(name="majorEngineVersion", type=String.class, parameters={})
    private Output<String> majorEngineVersion;

    /**
     * @return Specifies the major version of the engine that this option group should be associated with.
     * 
     */
    public Output<String> majorEngineVersion() {
        return this.majorEngineVersion;
    }
    /**
     * The Name of the setting.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Name of the setting.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The description of the option group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="optionGroupDescription", type=String.class, parameters={})
    private Output<String> optionGroupDescription;

    /**
     * @return The description of the option group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> optionGroupDescription() {
        return this.optionGroupDescription;
    }
    /**
     * A list of Options to apply.
     * 
     */
    @Export(name="options", type=List.class, parameters={OptionGroupOption.class})
    private Output</* @Nullable */ List<OptionGroupOption>> options;

    /**
     * @return A list of Options to apply.
     * 
     */
    public Output<Optional<List<OptionGroupOption>>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OptionGroup(String name) {
        this(name, OptionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OptionGroup(String name, OptionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OptionGroup(String name, OptionGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/optionGroup:OptionGroup", name, args == null ? OptionGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OptionGroup(String name, Output<String> id, @Nullable OptionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/optionGroup:OptionGroup", name, state, makeResourceOptions(options, id));
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
    public static OptionGroup get(String name, Output<String> id, @Nullable OptionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OptionGroup(name, id, state, options);
    }
}