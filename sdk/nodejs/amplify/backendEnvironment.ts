// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amplify Backend Environment resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleApp = new aws.amplify.App("exampleApp", {});
 * const exampleBackendEnvironment = new aws.amplify.BackendEnvironment("exampleBackendEnvironment", {
 *     appId: exampleApp.id,
 *     environmentName: "example",
 *     deploymentArtifacts: "app-example-deployment",
 *     stackName: "amplify-app-example",
 * });
 * ```
 *
 * ## Import
 *
 * Amplify backend environment can be imported using `app_id` and `environment_name`, e.g.
 *
 * ```sh
 *  $ pulumi import aws:amplify/backendEnvironment:BackendEnvironment example d2ypk4k47z8u6/example
 * ```
 */
export class BackendEnvironment extends pulumi.CustomResource {
    /**
     * Get an existing BackendEnvironment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BackendEnvironmentState, opts?: pulumi.CustomResourceOptions): BackendEnvironment {
        return new BackendEnvironment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:amplify/backendEnvironment:BackendEnvironment';

    /**
     * Returns true if the given object is an instance of BackendEnvironment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BackendEnvironment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BackendEnvironment.__pulumiType;
    }

    /**
     * The unique ID for an Amplify app.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The name of deployment artifacts.
     */
    public readonly deploymentArtifacts!: pulumi.Output<string>;
    /**
     * The name for the backend environment.
     */
    public readonly environmentName!: pulumi.Output<string>;
    /**
     * The AWS CloudFormation stack name of a backend environment.
     */
    public readonly stackName!: pulumi.Output<string>;

    /**
     * Create a BackendEnvironment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BackendEnvironmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BackendEnvironmentArgs | BackendEnvironmentState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BackendEnvironmentState | undefined;
            inputs["appId"] = state ? state.appId : undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["deploymentArtifacts"] = state ? state.deploymentArtifacts : undefined;
            inputs["environmentName"] = state ? state.environmentName : undefined;
            inputs["stackName"] = state ? state.stackName : undefined;
        } else {
            const args = argsOrState as BackendEnvironmentArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.environmentName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentName'");
            }
            inputs["appId"] = args ? args.appId : undefined;
            inputs["deploymentArtifacts"] = args ? args.deploymentArtifacts : undefined;
            inputs["environmentName"] = args ? args.environmentName : undefined;
            inputs["stackName"] = args ? args.stackName : undefined;
            inputs["arn"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(BackendEnvironment.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BackendEnvironment resources.
 */
export interface BackendEnvironmentState {
    /**
     * The unique ID for an Amplify app.
     */
    appId?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     */
    arn?: pulumi.Input<string>;
    /**
     * The name of deployment artifacts.
     */
    deploymentArtifacts?: pulumi.Input<string>;
    /**
     * The name for the backend environment.
     */
    environmentName?: pulumi.Input<string>;
    /**
     * The AWS CloudFormation stack name of a backend environment.
     */
    stackName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BackendEnvironment resource.
 */
export interface BackendEnvironmentArgs {
    /**
     * The unique ID for an Amplify app.
     */
    appId: pulumi.Input<string>;
    /**
     * The name of deployment artifacts.
     */
    deploymentArtifacts?: pulumi.Input<string>;
    /**
     * The name for the backend environment.
     */
    environmentName: pulumi.Input<string>;
    /**
     * The AWS CloudFormation stack name of a backend environment.
     */
    stackName?: pulumi.Input<string>;
}