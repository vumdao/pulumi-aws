// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package networkmanager

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve information about sites.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/networkmanager"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := networkmanager.GetSites(ctx, &networkmanager.GetSitesArgs{
//				GlobalNetworkId: _var.Global_network_id,
//				Tags: map[string]interface{}{
//					"Env": "test",
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
func GetSites(ctx *pulumi.Context, args *GetSitesArgs, opts ...pulumi.InvokeOption) (*GetSitesResult, error) {
	var rv GetSitesResult
	err := ctx.Invoke("aws:networkmanager/getSites:getSites", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSites.
type GetSitesArgs struct {
	// The ID of the Global Network of the sites to retrieve.
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// Restricts the list to the sites with these tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getSites.
type GetSitesResult struct {
	GlobalNetworkId string `pulumi:"globalNetworkId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The IDs of the sites.
	Ids  []string          `pulumi:"ids"`
	Tags map[string]string `pulumi:"tags"`
}

func GetSitesOutput(ctx *pulumi.Context, args GetSitesOutputArgs, opts ...pulumi.InvokeOption) GetSitesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetSitesResult, error) {
			args := v.(GetSitesArgs)
			r, err := GetSites(ctx, &args, opts...)
			var s GetSitesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetSitesResultOutput)
}

// A collection of arguments for invoking getSites.
type GetSitesOutputArgs struct {
	// The ID of the Global Network of the sites to retrieve.
	GlobalNetworkId pulumi.StringInput `pulumi:"globalNetworkId"`
	// Restricts the list to the sites with these tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetSitesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSitesArgs)(nil)).Elem()
}

// A collection of values returned by getSites.
type GetSitesResultOutput struct{ *pulumi.OutputState }

func (GetSitesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSitesResult)(nil)).Elem()
}

func (o GetSitesResultOutput) ToGetSitesResultOutput() GetSitesResultOutput {
	return o
}

func (o GetSitesResultOutput) ToGetSitesResultOutputWithContext(ctx context.Context) GetSitesResultOutput {
	return o
}

func (o GetSitesResultOutput) GlobalNetworkId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSitesResult) string { return v.GlobalNetworkId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSitesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSitesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The IDs of the sites.
func (o GetSitesResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetSitesResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetSitesResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetSitesResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSitesResultOutput{})
}