// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package codestarconnections

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about CodeStar Connection.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/codestarconnections"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := codestarconnections.LookupConnection(ctx, &codestarconnections.LookupConnectionArgs{
// 			Arn: aws_codestarconnections_connection.Example.Arn,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	var rv LookupConnectionResult
	err := ctx.Invoke("aws:codestarconnections/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// The CodeStar Connection ARN.
	Arn string `pulumi:"arn"`
	// Map of key-value resource tags to associate with the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	Arn string `pulumi:"arn"`
	// The CodeStar Connection status. Possible values are `PENDING`, `AVAILABLE` and `ERROR`.
	ConnectionStatus string `pulumi:"connectionStatus"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the CodeStar Connection. The name is unique in the calling AWS account.
	Name string `pulumi:"name"`
	// The name of the external provider where your third-party code repository is configured. Possible values are `Bitbucket`, `GitHub`, or `GitHubEnterpriseServer`.
	ProviderType string `pulumi:"providerType"`
	// Map of key-value resource tags to associate with the resource.
	Tags map[string]string `pulumi:"tags"`
}