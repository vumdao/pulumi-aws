// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ec2.VpcIpamPool` provides details about an IPAM pool.
//
// This resource can prove useful when an ipam pool was created in another root
// module and you need the pool's id as an input variable. For example, pools
// can be shared via RAM and used to create vpcs with CIDRs from that pool.
//
// ## Example Usage
//
// The following example shows an account that has only 1 pool, perhaps shared
// via RAM, and using that pool id to create a VPC with a CIDR derived from
// AWS IPAM.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testVpcIamPool, err := ec2.GetVpcIamPool(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec2.NewVpc(ctx, "testVpc", &ec2.VpcArgs{
// 			Ipv4IpamPoolId:    pulumi.String(testVpcIamPool.Id),
// 			Ipv4NetmaskLength: pulumi.Int(28),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetVpcIamPool(ctx *pulumi.Context, args *GetVpcIamPoolArgs, opts ...pulumi.InvokeOption) (*GetVpcIamPoolResult, error) {
	var rv GetVpcIamPoolResult
	err := ctx.Invoke("aws:ec2/getVpcIamPool:getVpcIamPool", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcIamPool.
type GetVpcIamPoolArgs struct {
	// Tags that are required to create resources in using this pool.
	AllocationResourceTags map[string]string `pulumi:"allocationResourceTags"`
	// Custom filter block as described below.
	Filters []GetVpcIamPoolFilter `pulumi:"filters"`
	// -
	Id         *string `pulumi:"id"`
	IpamPoolId *string `pulumi:"ipamPoolId"`
	// A map of tags to assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getVpcIamPool.
type GetVpcIamPoolResult struct {
	// The IP protocol assigned to this pool.
	AddressFamily string `pulumi:"addressFamily"`
	// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
	AllocationDefaultNetmaskLength int `pulumi:"allocationDefaultNetmaskLength"`
	// The maximum netmask length that will be required for CIDR allocations in this pool.
	AllocationMaxNetmaskLength int `pulumi:"allocationMaxNetmaskLength"`
	// The minimum netmask length that will be required for CIDR allocations in this pool.
	AllocationMinNetmaskLength int `pulumi:"allocationMinNetmaskLength"`
	// Tags that are required to create resources in using this pool.
	AllocationResourceTags map[string]string `pulumi:"allocationResourceTags"`
	// Amazon Resource Name (ARN) of the pool
	Arn string `pulumi:"arn"`
	// If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
	AutoImport bool `pulumi:"autoImport"`
	// Limits which service in AWS that the pool can be used in. "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
	AwsService string `pulumi:"awsService"`
	// A description for the IPAM pool.
	Description string                `pulumi:"description"`
	Filters     []GetVpcIamPoolFilter `pulumi:"filters"`
	Id          *string               `pulumi:"id"`
	IpamPoolId  *string               `pulumi:"ipamPoolId"`
	// The ID of the scope the pool belongs to.
	IpamScopeId   string `pulumi:"ipamScopeId"`
	IpamScopeType string `pulumi:"ipamScopeType"`
	// Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region.
	Locale    string `pulumi:"locale"`
	PoolDepth int    `pulumi:"poolDepth"`
	// Defines whether or not IPv6 pool space is publicly ∂advertisable over the internet.
	PubliclyAdvertisable bool `pulumi:"publiclyAdvertisable"`
	// The ID of the source IPAM pool.
	SourceIpamPoolId string `pulumi:"sourceIpamPoolId"`
	State            string `pulumi:"state"`
	// A map of tags to assigned to the resource.
	Tags map[string]string `pulumi:"tags"`
}

func GetVpcIamPoolOutput(ctx *pulumi.Context, args GetVpcIamPoolOutputArgs, opts ...pulumi.InvokeOption) GetVpcIamPoolResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVpcIamPoolResult, error) {
			args := v.(GetVpcIamPoolArgs)
			r, err := GetVpcIamPool(ctx, &args, opts...)
			return *r, err
		}).(GetVpcIamPoolResultOutput)
}

// A collection of arguments for invoking getVpcIamPool.
type GetVpcIamPoolOutputArgs struct {
	// Tags that are required to create resources in using this pool.
	AllocationResourceTags pulumi.StringMapInput `pulumi:"allocationResourceTags"`
	// Custom filter block as described below.
	Filters GetVpcIamPoolFilterArrayInput `pulumi:"filters"`
	// -
	Id         pulumi.StringPtrInput `pulumi:"id"`
	IpamPoolId pulumi.StringPtrInput `pulumi:"ipamPoolId"`
	// A map of tags to assigned to the resource.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (GetVpcIamPoolOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcIamPoolArgs)(nil)).Elem()
}

// A collection of values returned by getVpcIamPool.
type GetVpcIamPoolResultOutput struct{ *pulumi.OutputState }

func (GetVpcIamPoolResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcIamPoolResult)(nil)).Elem()
}

func (o GetVpcIamPoolResultOutput) ToGetVpcIamPoolResultOutput() GetVpcIamPoolResultOutput {
	return o
}

func (o GetVpcIamPoolResultOutput) ToGetVpcIamPoolResultOutputWithContext(ctx context.Context) GetVpcIamPoolResultOutput {
	return o
}

// The IP protocol assigned to this pool.
func (o GetVpcIamPoolResultOutput) AddressFamily() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.AddressFamily }).(pulumi.StringOutput)
}

// A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
func (o GetVpcIamPoolResultOutput) AllocationDefaultNetmaskLength() pulumi.IntOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) int { return v.AllocationDefaultNetmaskLength }).(pulumi.IntOutput)
}

// The maximum netmask length that will be required for CIDR allocations in this pool.
func (o GetVpcIamPoolResultOutput) AllocationMaxNetmaskLength() pulumi.IntOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) int { return v.AllocationMaxNetmaskLength }).(pulumi.IntOutput)
}

// The minimum netmask length that will be required for CIDR allocations in this pool.
func (o GetVpcIamPoolResultOutput) AllocationMinNetmaskLength() pulumi.IntOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) int { return v.AllocationMinNetmaskLength }).(pulumi.IntOutput)
}

// Tags that are required to create resources in using this pool.
func (o GetVpcIamPoolResultOutput) AllocationResourceTags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) map[string]string { return v.AllocationResourceTags }).(pulumi.StringMapOutput)
}

// Amazon Resource Name (ARN) of the pool
func (o GetVpcIamPoolResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.Arn }).(pulumi.StringOutput)
}

// If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
func (o GetVpcIamPoolResultOutput) AutoImport() pulumi.BoolOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) bool { return v.AutoImport }).(pulumi.BoolOutput)
}

// Limits which service in AWS that the pool can be used in. "ec2", for example, allows users to use space for Elastic IP addresses and VPCs.
func (o GetVpcIamPoolResultOutput) AwsService() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.AwsService }).(pulumi.StringOutput)
}

// A description for the IPAM pool.
func (o GetVpcIamPoolResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetVpcIamPoolResultOutput) Filters() GetVpcIamPoolFilterArrayOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) []GetVpcIamPoolFilter { return v.Filters }).(GetVpcIamPoolFilterArrayOutput)
}

func (o GetVpcIamPoolResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o GetVpcIamPoolResultOutput) IpamPoolId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) *string { return v.IpamPoolId }).(pulumi.StringPtrOutput)
}

// The ID of the scope the pool belongs to.
func (o GetVpcIamPoolResultOutput) IpamScopeId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.IpamScopeId }).(pulumi.StringOutput)
}

func (o GetVpcIamPoolResultOutput) IpamScopeType() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.IpamScopeType }).(pulumi.StringOutput)
}

// Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region.
func (o GetVpcIamPoolResultOutput) Locale() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.Locale }).(pulumi.StringOutput)
}

func (o GetVpcIamPoolResultOutput) PoolDepth() pulumi.IntOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) int { return v.PoolDepth }).(pulumi.IntOutput)
}

// Defines whether or not IPv6 pool space is publicly ∂advertisable over the internet.
func (o GetVpcIamPoolResultOutput) PubliclyAdvertisable() pulumi.BoolOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) bool { return v.PubliclyAdvertisable }).(pulumi.BoolOutput)
}

// The ID of the source IPAM pool.
func (o GetVpcIamPoolResultOutput) SourceIpamPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.SourceIpamPoolId }).(pulumi.StringOutput)
}

func (o GetVpcIamPoolResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) string { return v.State }).(pulumi.StringOutput)
}

// A map of tags to assigned to the resource.
func (o GetVpcIamPoolResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v GetVpcIamPoolResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcIamPoolResultOutput{})
}