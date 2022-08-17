// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudfront

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get ARNs, ids and S3 canonical user IDs of Amazon CloudFront origin access identities.
//
// ## Example Usage
// ### All origin access identities in the account
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfront.GetOriginAccessIdentities(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Origin access identities filtered by comment/name
//
// Origin access identities whose comments are `example-comment1`, `example-comment2`
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/cloudfront"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudfront.GetOriginAccessIdentities(ctx, &cloudfront.GetOriginAccessIdentitiesArgs{
//				Comments: []string{
//					"example-comment1",
//					"example-comment2",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOriginAccessIdentities(ctx *pulumi.Context, args *GetOriginAccessIdentitiesArgs, opts ...pulumi.InvokeOption) (*GetOriginAccessIdentitiesResult, error) {
	var rv GetOriginAccessIdentitiesResult
	err := ctx.Invoke("aws:cloudfront/getOriginAccessIdentities:getOriginAccessIdentities", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOriginAccessIdentities.
type GetOriginAccessIdentitiesArgs struct {
	// Filter origin access identities by comment.
	Comments []string `pulumi:"comments"`
}

// A collection of values returned by getOriginAccessIdentities.
type GetOriginAccessIdentitiesResult struct {
	Comments []string `pulumi:"comments"`
	// Set of ARNs of the matched origin access identities.
	IamArns []string `pulumi:"iamArns"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of ids of the matched origin access identities.
	Ids []string `pulumi:"ids"`
	// Set of S3 canonical user IDs of the matched origin access identities.
	S3CanonicalUserIds []string `pulumi:"s3CanonicalUserIds"`
}

func GetOriginAccessIdentitiesOutput(ctx *pulumi.Context, args GetOriginAccessIdentitiesOutputArgs, opts ...pulumi.InvokeOption) GetOriginAccessIdentitiesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOriginAccessIdentitiesResult, error) {
			args := v.(GetOriginAccessIdentitiesArgs)
			r, err := GetOriginAccessIdentities(ctx, &args, opts...)
			var s GetOriginAccessIdentitiesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOriginAccessIdentitiesResultOutput)
}

// A collection of arguments for invoking getOriginAccessIdentities.
type GetOriginAccessIdentitiesOutputArgs struct {
	// Filter origin access identities by comment.
	Comments pulumi.StringArrayInput `pulumi:"comments"`
}

func (GetOriginAccessIdentitiesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOriginAccessIdentitiesArgs)(nil)).Elem()
}

// A collection of values returned by getOriginAccessIdentities.
type GetOriginAccessIdentitiesResultOutput struct{ *pulumi.OutputState }

func (GetOriginAccessIdentitiesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOriginAccessIdentitiesResult)(nil)).Elem()
}

func (o GetOriginAccessIdentitiesResultOutput) ToGetOriginAccessIdentitiesResultOutput() GetOriginAccessIdentitiesResultOutput {
	return o
}

func (o GetOriginAccessIdentitiesResultOutput) ToGetOriginAccessIdentitiesResultOutputWithContext(ctx context.Context) GetOriginAccessIdentitiesResultOutput {
	return o
}

func (o GetOriginAccessIdentitiesResultOutput) Comments() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOriginAccessIdentitiesResult) []string { return v.Comments }).(pulumi.StringArrayOutput)
}

// Set of ARNs of the matched origin access identities.
func (o GetOriginAccessIdentitiesResultOutput) IamArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOriginAccessIdentitiesResult) []string { return v.IamArns }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOriginAccessIdentitiesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOriginAccessIdentitiesResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of ids of the matched origin access identities.
func (o GetOriginAccessIdentitiesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOriginAccessIdentitiesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

// Set of S3 canonical user IDs of the matched origin access identities.
func (o GetOriginAccessIdentitiesResultOutput) S3CanonicalUserIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOriginAccessIdentitiesResult) []string { return v.S3CanonicalUserIds }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOriginAccessIdentitiesResultOutput{})
}