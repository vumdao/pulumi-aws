// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.shield.ProactiveEngagementArgs;
import com.pulumi.aws.shield.inputs.ProactiveEngagementState;
import com.pulumi.aws.shield.outputs.ProactiveEngagementEmergencyContact;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing a AWS Shield Proactive Engagement.
 * Proactive engagement authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT and to initiate proactive customer support.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.shield.DrtAccessRoleArnAssociation;
 * import com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs;
 * import com.pulumi.aws.shield.ProtectionGroup;
 * import com.pulumi.aws.shield.ProtectionGroupArgs;
 * import com.pulumi.aws.shield.ProactiveEngagement;
 * import com.pulumi.aws.shield.ProactiveEngagementArgs;
 * import com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var example = new Role("example", RoleArgs.builder()
 *             .name(awsShieldDrtAccessRoleArn)
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Version", "2012-10-17"),
 *                     jsonProperty("Statement", jsonArray(jsonObject(
 *                         jsonProperty("Sid", ""),
 *                         jsonProperty("Effect", "Allow"),
 *                         jsonProperty("Principal", jsonObject(
 *                             jsonProperty("Service", "drt.shield.amazonaws.com")
 *                         )),
 *                         jsonProperty("Action", "sts:AssumeRole")
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var exampleRolePolicyAttachment = new RolePolicyAttachment("exampleRolePolicyAttachment", RolePolicyAttachmentArgs.builder()
 *             .role(example.name())
 *             .policyArn("arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy")
 *             .build());
 * 
 *         var exampleDrtAccessRoleArnAssociation = new DrtAccessRoleArnAssociation("exampleDrtAccessRoleArnAssociation", DrtAccessRoleArnAssociationArgs.builder()
 *             .roleArn(example.arn())
 *             .build());
 * 
 *         var test = new ProtectionGroup("test", ProtectionGroupArgs.builder()
 *             .protectionGroupId("example")
 *             .aggregation("MAX")
 *             .pattern("ALL")
 *             .build());
 * 
 *         var testProactiveEngagement = new ProactiveEngagement("testProactiveEngagement", ProactiveEngagementArgs.builder()
 *             .enabled(true)
 *             .emergencyContacts(            
 *                 ProactiveEngagementEmergencyContactArgs.builder()
 *                     .contactNotes("Notes")
 *                     .emailAddress("test{@literal @}company.com")
 *                     .phoneNumber("+12358132134")
 *                     .build(),
 *                 ProactiveEngagementEmergencyContactArgs.builder()
 *                     .contactNotes("Notes 2")
 *                     .emailAddress("test2{@literal @}company.com")
 *                     .phoneNumber("+12358132134")
 *                     .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(testAwsShieldDrtAccessRoleArnAssociation)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Shield proactive engagement using the AWS account ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:shield/proactiveEngagement:ProactiveEngagement example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:shield/proactiveEngagement:ProactiveEngagement")
public class ProactiveEngagement extends com.pulumi.resources.CustomResource {
    /**
     * One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergency_contacts`.
     * 
     */
    @Export(name="emergencyContacts", refs={List.class,ProactiveEngagementEmergencyContact.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProactiveEngagementEmergencyContact>> emergencyContacts;

    /**
     * @return One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergency_contacts`.
     * 
     */
    public Output<Optional<List<ProactiveEngagementEmergencyContact>>> emergencyContacts() {
        return Codegen.optional(this.emergencyContacts);
    }
    /**
     * Boolean value indicating if Proactive Engagement should be enabled or not.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Boolean value indicating if Proactive Engagement should be enabled or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProactiveEngagement(String name) {
        this(name, ProactiveEngagementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProactiveEngagement(String name, ProactiveEngagementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProactiveEngagement(String name, ProactiveEngagementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/proactiveEngagement:ProactiveEngagement", name, args == null ? ProactiveEngagementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProactiveEngagement(String name, Output<String> id, @Nullable ProactiveEngagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/proactiveEngagement:ProactiveEngagement", name, state, makeResourceOptions(options, id));
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
    public static ProactiveEngagement get(String name, Output<String> id, @Nullable ProactiveEngagementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProactiveEngagement(name, id, state, options);
    }
}
