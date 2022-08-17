// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Managed Grafana workspace data source.
 *
 * ## Example Usage
 * ### Basic configuration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.grafana.getWorkspace({
 *     workspaceId: "g-2054c75a02",
 * }));
 * ```
 */
export function getWorkspace(args: GetWorkspaceArgs, opts?: pulumi.InvokeOptions): Promise<GetWorkspaceResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:grafana/getWorkspace:getWorkspace", {
        "tags": args.tags,
        "workspaceId": args.workspaceId,
    }, opts);
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceArgs {
    /**
     * The tags assigned to the resource
     */
    tags?: {[key: string]: string};
    /**
     * The Grafana workspace ID.
     */
    workspaceId: string;
}

/**
 * A collection of values returned by getWorkspace.
 */
export interface GetWorkspaceResult {
    /**
     * (Required) The type of account access for the workspace. Valid values are `CURRENT_ACCOUNT` and `ORGANIZATION`. If `ORGANIZATION` is specified, then `organizationalUnits` must also be present.
     */
    readonly accountAccessType: string;
    /**
     * The Amazon Resource Name (ARN) of the Grafana workspace.
     */
    readonly arn: string;
    /**
     * (Required) The authentication providers for the workspace. Valid values are `AWS_SSO`, `SAML`, or both.
     */
    readonly authenticationProviders: string[];
    /**
     * The creation date of the Grafana workspace.
     */
    readonly createdDate: string;
    /**
     * The data sources for the workspace.
     */
    readonly dataSources: string[];
    /**
     * The workspace description.
     */
    readonly description: string;
    /**
     * The endpoint of the Grafana workspace.
     */
    readonly endpoint: string;
    /**
     * The version of Grafana running on the workspace.
     */
    readonly grafanaVersion: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The last updated date of the Grafana workspace.
     */
    readonly lastUpdatedDate: string;
    /**
     * The Grafana workspace name.
     */
    readonly name: string;
    /**
     * The notification destinations.
     */
    readonly notificationDestinations: string[];
    /**
     * The role name that the workspace uses to access resources through Amazon Organizations.
     */
    readonly organizationRoleName: string;
    /**
     * The Amazon Organizations organizational units that the workspace is authorized to use data sources from.
     */
    readonly organizationalUnits: string[];
    /**
     * The permission type of the workspace.
     */
    readonly permissionType: string;
    /**
     * The IAM role ARN that the workspace assumes.
     */
    readonly roleArn: string;
    readonly samlConfigurationStatus: string;
    /**
     * The AWS CloudFormation stack set name that provisions IAM roles to be used by the workspace.
     */
    readonly stackSetName: string;
    /**
     * The status of the Grafana workspace.
     */
    readonly status: string;
    /**
     * The tags assigned to the resource
     */
    readonly tags: {[key: string]: string};
    readonly workspaceId: string;
}

export function getWorkspaceOutput(args: GetWorkspaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetWorkspaceResult> {
    return pulumi.output(args).apply(a => getWorkspace(a, opts))
}

/**
 * A collection of arguments for invoking getWorkspace.
 */
export interface GetWorkspaceOutputArgs {
    /**
     * The tags assigned to the resource
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The Grafana workspace ID.
     */
    workspaceId: pulumi.Input<string>;
}