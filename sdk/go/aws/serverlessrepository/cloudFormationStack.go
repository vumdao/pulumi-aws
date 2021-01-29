// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package serverlessrepository

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Deploys an Application CloudFormation Stack from the Serverless Application Repository.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/serverlessrepository"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		currentPartition, err := aws.GetPartition(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		currentRegion, err := aws.GetRegion(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = serverlessrepository.NewCloudFormationStack(ctx, "postgres_rotator", &serverlessrepository.CloudFormationStackArgs{
// 			ApplicationId: pulumi.String("arn:aws:serverlessrepo:us-east-1:297356227824:applications/SecretsManagerRDSPostgreSQLRotationSingleUser"),
// 			Capabilities: pulumi.StringArray{
// 				pulumi.String("CAPABILITY_IAM"),
// 				pulumi.String("CAPABILITY_RESOURCE_POLICY"),
// 			},
// 			Parameters: pulumi.StringMap{
// 				"endpoint":     pulumi.String(fmt.Sprintf("%v%v%v%v", "secretsmanager.", currentRegion.Name, ".", currentPartition.DnsSuffix)),
// 				"functionName": pulumi.String("func-postgres-rotator"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Serverless Application Repository Stack can be imported using the CloudFormation Stack name (with or without the `serverlessrepo-` prefix) or the CloudFormation Stack ID, e.g.
//
// ```sh
//  $ pulumi import aws:serverlessrepository/cloudFormationStack:CloudFormationStack example serverlessrepo-postgres-rotator
// ```
type CloudFormationStack struct {
	pulumi.CustomResourceState

	// The ARN of the application from the Serverless Application Repository.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
	Capabilities pulumi.StringArrayOutput `pulumi:"capabilities"`
	// The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of outputs from the stack.
	Outputs pulumi.StringMapOutput `pulumi:"outputs"`
	// A map of Parameter structures that specify input parameters for the stack.
	Parameters pulumi.StringMapOutput `pulumi:"parameters"`
	// The version of the application to deploy. If not supplied, deploys the latest version.
	SemanticVersion pulumi.StringOutput `pulumi:"semanticVersion"`
	// A list of tags to associate with this stack.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
}

// NewCloudFormationStack registers a new resource with the given unique name, arguments, and options.
func NewCloudFormationStack(ctx *pulumi.Context,
	name string, args *CloudFormationStackArgs, opts ...pulumi.ResourceOption) (*CloudFormationStack, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.Capabilities == nil {
		return nil, errors.New("invalid value for required argument 'Capabilities'")
	}
	var resource CloudFormationStack
	err := ctx.RegisterResource("aws:serverlessrepository/cloudFormationStack:CloudFormationStack", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCloudFormationStack gets an existing CloudFormationStack resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCloudFormationStack(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CloudFormationStackState, opts ...pulumi.ResourceOption) (*CloudFormationStack, error) {
	var resource CloudFormationStack
	err := ctx.ReadResource("aws:serverlessrepository/cloudFormationStack:CloudFormationStack", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CloudFormationStack resources.
type cloudFormationStackState struct {
	// The ARN of the application from the Serverless Application Repository.
	ApplicationId *string `pulumi:"applicationId"`
	// A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
	Capabilities []string `pulumi:"capabilities"`
	// The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
	Name *string `pulumi:"name"`
	// A map of outputs from the stack.
	Outputs map[string]string `pulumi:"outputs"`
	// A map of Parameter structures that specify input parameters for the stack.
	Parameters map[string]string `pulumi:"parameters"`
	// The version of the application to deploy. If not supplied, deploys the latest version.
	SemanticVersion *string `pulumi:"semanticVersion"`
	// A list of tags to associate with this stack.
	Tags map[string]string `pulumi:"tags"`
}

type CloudFormationStackState struct {
	// The ARN of the application from the Serverless Application Repository.
	ApplicationId pulumi.StringPtrInput
	// A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
	Capabilities pulumi.StringArrayInput
	// The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
	Name pulumi.StringPtrInput
	// A map of outputs from the stack.
	Outputs pulumi.StringMapInput
	// A map of Parameter structures that specify input parameters for the stack.
	Parameters pulumi.StringMapInput
	// The version of the application to deploy. If not supplied, deploys the latest version.
	SemanticVersion pulumi.StringPtrInput
	// A list of tags to associate with this stack.
	Tags pulumi.StringMapInput
}

func (CloudFormationStackState) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudFormationStackState)(nil)).Elem()
}

type cloudFormationStackArgs struct {
	// The ARN of the application from the Serverless Application Repository.
	ApplicationId string `pulumi:"applicationId"`
	// A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
	Capabilities []string `pulumi:"capabilities"`
	// The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
	Name *string `pulumi:"name"`
	// A map of Parameter structures that specify input parameters for the stack.
	Parameters map[string]string `pulumi:"parameters"`
	// The version of the application to deploy. If not supplied, deploys the latest version.
	SemanticVersion *string `pulumi:"semanticVersion"`
	// A list of tags to associate with this stack.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a CloudFormationStack resource.
type CloudFormationStackArgs struct {
	// The ARN of the application from the Serverless Application Repository.
	ApplicationId pulumi.StringInput
	// A list of capabilities. Valid values are `CAPABILITY_IAM`, `CAPABILITY_NAMED_IAM`, `CAPABILITY_RESOURCE_POLICY`, or `CAPABILITY_AUTO_EXPAND`
	Capabilities pulumi.StringArrayInput
	// The name of the stack to create. The resource deployed in AWS will be prefixed with `serverlessrepo-`
	Name pulumi.StringPtrInput
	// A map of Parameter structures that specify input parameters for the stack.
	Parameters pulumi.StringMapInput
	// The version of the application to deploy. If not supplied, deploys the latest version.
	SemanticVersion pulumi.StringPtrInput
	// A list of tags to associate with this stack.
	Tags pulumi.StringMapInput
}

func (CloudFormationStackArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*cloudFormationStackArgs)(nil)).Elem()
}

type CloudFormationStackInput interface {
	pulumi.Input

	ToCloudFormationStackOutput() CloudFormationStackOutput
	ToCloudFormationStackOutputWithContext(ctx context.Context) CloudFormationStackOutput
}

func (*CloudFormationStack) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudFormationStack)(nil))
}

func (i *CloudFormationStack) ToCloudFormationStackOutput() CloudFormationStackOutput {
	return i.ToCloudFormationStackOutputWithContext(context.Background())
}

func (i *CloudFormationStack) ToCloudFormationStackOutputWithContext(ctx context.Context) CloudFormationStackOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudFormationStackOutput)
}

func (i *CloudFormationStack) ToCloudFormationStackPtrOutput() CloudFormationStackPtrOutput {
	return i.ToCloudFormationStackPtrOutputWithContext(context.Background())
}

func (i *CloudFormationStack) ToCloudFormationStackPtrOutputWithContext(ctx context.Context) CloudFormationStackPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudFormationStackPtrOutput)
}

type CloudFormationStackPtrInput interface {
	pulumi.Input

	ToCloudFormationStackPtrOutput() CloudFormationStackPtrOutput
	ToCloudFormationStackPtrOutputWithContext(ctx context.Context) CloudFormationStackPtrOutput
}

type cloudFormationStackPtrType CloudFormationStackArgs

func (*cloudFormationStackPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudFormationStack)(nil))
}

func (i *cloudFormationStackPtrType) ToCloudFormationStackPtrOutput() CloudFormationStackPtrOutput {
	return i.ToCloudFormationStackPtrOutputWithContext(context.Background())
}

func (i *cloudFormationStackPtrType) ToCloudFormationStackPtrOutputWithContext(ctx context.Context) CloudFormationStackPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudFormationStackPtrOutput)
}

// CloudFormationStackArrayInput is an input type that accepts CloudFormationStackArray and CloudFormationStackArrayOutput values.
// You can construct a concrete instance of `CloudFormationStackArrayInput` via:
//
//          CloudFormationStackArray{ CloudFormationStackArgs{...} }
type CloudFormationStackArrayInput interface {
	pulumi.Input

	ToCloudFormationStackArrayOutput() CloudFormationStackArrayOutput
	ToCloudFormationStackArrayOutputWithContext(context.Context) CloudFormationStackArrayOutput
}

type CloudFormationStackArray []CloudFormationStackInput

func (CloudFormationStackArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*CloudFormationStack)(nil))
}

func (i CloudFormationStackArray) ToCloudFormationStackArrayOutput() CloudFormationStackArrayOutput {
	return i.ToCloudFormationStackArrayOutputWithContext(context.Background())
}

func (i CloudFormationStackArray) ToCloudFormationStackArrayOutputWithContext(ctx context.Context) CloudFormationStackArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudFormationStackArrayOutput)
}

// CloudFormationStackMapInput is an input type that accepts CloudFormationStackMap and CloudFormationStackMapOutput values.
// You can construct a concrete instance of `CloudFormationStackMapInput` via:
//
//          CloudFormationStackMap{ "key": CloudFormationStackArgs{...} }
type CloudFormationStackMapInput interface {
	pulumi.Input

	ToCloudFormationStackMapOutput() CloudFormationStackMapOutput
	ToCloudFormationStackMapOutputWithContext(context.Context) CloudFormationStackMapOutput
}

type CloudFormationStackMap map[string]CloudFormationStackInput

func (CloudFormationStackMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*CloudFormationStack)(nil))
}

func (i CloudFormationStackMap) ToCloudFormationStackMapOutput() CloudFormationStackMapOutput {
	return i.ToCloudFormationStackMapOutputWithContext(context.Background())
}

func (i CloudFormationStackMap) ToCloudFormationStackMapOutputWithContext(ctx context.Context) CloudFormationStackMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CloudFormationStackMapOutput)
}

type CloudFormationStackOutput struct {
	*pulumi.OutputState
}

func (CloudFormationStackOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CloudFormationStack)(nil))
}

func (o CloudFormationStackOutput) ToCloudFormationStackOutput() CloudFormationStackOutput {
	return o
}

func (o CloudFormationStackOutput) ToCloudFormationStackOutputWithContext(ctx context.Context) CloudFormationStackOutput {
	return o
}

func (o CloudFormationStackOutput) ToCloudFormationStackPtrOutput() CloudFormationStackPtrOutput {
	return o.ToCloudFormationStackPtrOutputWithContext(context.Background())
}

func (o CloudFormationStackOutput) ToCloudFormationStackPtrOutputWithContext(ctx context.Context) CloudFormationStackPtrOutput {
	return o.ApplyT(func(v CloudFormationStack) *CloudFormationStack {
		return &v
	}).(CloudFormationStackPtrOutput)
}

type CloudFormationStackPtrOutput struct {
	*pulumi.OutputState
}

func (CloudFormationStackPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CloudFormationStack)(nil))
}

func (o CloudFormationStackPtrOutput) ToCloudFormationStackPtrOutput() CloudFormationStackPtrOutput {
	return o
}

func (o CloudFormationStackPtrOutput) ToCloudFormationStackPtrOutputWithContext(ctx context.Context) CloudFormationStackPtrOutput {
	return o
}

type CloudFormationStackArrayOutput struct{ *pulumi.OutputState }

func (CloudFormationStackArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]CloudFormationStack)(nil))
}

func (o CloudFormationStackArrayOutput) ToCloudFormationStackArrayOutput() CloudFormationStackArrayOutput {
	return o
}

func (o CloudFormationStackArrayOutput) ToCloudFormationStackArrayOutputWithContext(ctx context.Context) CloudFormationStackArrayOutput {
	return o
}

func (o CloudFormationStackArrayOutput) Index(i pulumi.IntInput) CloudFormationStackOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) CloudFormationStack {
		return vs[0].([]CloudFormationStack)[vs[1].(int)]
	}).(CloudFormationStackOutput)
}

type CloudFormationStackMapOutput struct{ *pulumi.OutputState }

func (CloudFormationStackMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]CloudFormationStack)(nil))
}

func (o CloudFormationStackMapOutput) ToCloudFormationStackMapOutput() CloudFormationStackMapOutput {
	return o
}

func (o CloudFormationStackMapOutput) ToCloudFormationStackMapOutputWithContext(ctx context.Context) CloudFormationStackMapOutput {
	return o
}

func (o CloudFormationStackMapOutput) MapIndex(k pulumi.StringInput) CloudFormationStackOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) CloudFormationStack {
		return vs[0].(map[string]CloudFormationStack)[vs[1].(string)]
	}).(CloudFormationStackOutput)
}

func init() {
	pulumi.RegisterOutputType(CloudFormationStackOutput{})
	pulumi.RegisterOutputType(CloudFormationStackPtrOutput{})
	pulumi.RegisterOutputType(CloudFormationStackArrayOutput{})
	pulumi.RegisterOutputType(CloudFormationStackMapOutput{})
}