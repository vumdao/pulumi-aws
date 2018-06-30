// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";

/**
 * Provides an EC2 placement group. Read more about placement groups
 * in [AWS Docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html).
 */
export class PlacementGroup extends pulumi.CustomResource {
    /**
     * Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PlacementGroupState): PlacementGroup {
        return new PlacementGroup(name, <any>state, { id });
    }

    /**
     * The name of the placement group.
     */
    public readonly name: pulumi.Output<string>;
    /**
     * The placement strategy.
     */
    public readonly strategy: pulumi.Output<string>;

    /**
     * Create a PlacementGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PlacementGroupArgs, opts?: pulumi.ResourceOptions)
    constructor(name: string, argsOrState?: PlacementGroupArgs | PlacementGroupState, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: PlacementGroupState = argsOrState as PlacementGroupState | undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["strategy"] = state ? state.strategy : undefined;
        } else {
            const args = argsOrState as PlacementGroupArgs | undefined;
            if (!args || args.strategy === undefined) {
                throw new Error("Missing required property 'strategy'");
            }
            inputs["name"] = args ? args.name : undefined;
            inputs["strategy"] = args ? args.strategy : undefined;
        }
        super("aws:ec2/placementGroup:PlacementGroup", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PlacementGroup resources.
 */
export interface PlacementGroupState {
    /**
     * The name of the placement group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The placement strategy.
     */
    readonly strategy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PlacementGroup resource.
 */
export interface PlacementGroupArgs {
    /**
     * The name of the placement group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The placement strategy.
     */
    readonly strategy: pulumi.Input<string>;
}