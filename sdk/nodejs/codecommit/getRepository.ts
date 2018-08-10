// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";

/**
 * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
 */
export function getRepository(args: GetRepositoryArgs, opts?: pulumi.InvokeOptions): Promise<GetRepositoryResult> {
    return pulumi.runtime.invoke("aws:codecommit/getRepository:getRepository", {
        "repositoryName": args.repositoryName,
    }, opts);
}

/**
 * A collection of arguments for invoking getRepository.
 */
export interface GetRepositoryArgs {
    /**
     * The name for the repository. This needs to be less than 100 characters.
     */
    readonly repositoryName: string;
}

/**
 * A collection of values returned by getRepository.
 */
export interface GetRepositoryResult {
    /**
     * The ARN of the repository
     */
    readonly arn: string;
    /**
     * The URL to use for cloning the repository over HTTPS.
     */
    readonly cloneUrlHttp: string;
    /**
     * The URL to use for cloning the repository over SSH.
     */
    readonly cloneUrlSsh: string;
    /**
     * The ID of the repository
     */
    readonly repositoryId: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}