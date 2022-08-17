// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package iot

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// IoT topic rule destinations can be imported using the `arn`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:iot/topicRuleDestination:TopicRuleDestination example arn:aws:iot:us-west-2:123456789012:ruledestination/vpc/2ce781c8-68a6-4c52-9c62-63fe489ecc60
//
// ```
type TopicRuleDestination struct {
	pulumi.CustomResourceState

	// The ARN of the topic rule destination
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Whether or not to enable the destination. Default: `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
	VpcConfiguration TopicRuleDestinationVpcConfigurationOutput `pulumi:"vpcConfiguration"`
}

// NewTopicRuleDestination registers a new resource with the given unique name, arguments, and options.
func NewTopicRuleDestination(ctx *pulumi.Context,
	name string, args *TopicRuleDestinationArgs, opts ...pulumi.ResourceOption) (*TopicRuleDestination, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.VpcConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'VpcConfiguration'")
	}
	var resource TopicRuleDestination
	err := ctx.RegisterResource("aws:iot/topicRuleDestination:TopicRuleDestination", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTopicRuleDestination gets an existing TopicRuleDestination resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTopicRuleDestination(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TopicRuleDestinationState, opts ...pulumi.ResourceOption) (*TopicRuleDestination, error) {
	var resource TopicRuleDestination
	err := ctx.ReadResource("aws:iot/topicRuleDestination:TopicRuleDestination", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TopicRuleDestination resources.
type topicRuleDestinationState struct {
	// The ARN of the topic rule destination
	Arn *string `pulumi:"arn"`
	// Whether or not to enable the destination. Default: `true`.
	Enabled *bool `pulumi:"enabled"`
	// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
	VpcConfiguration *TopicRuleDestinationVpcConfiguration `pulumi:"vpcConfiguration"`
}

type TopicRuleDestinationState struct {
	// The ARN of the topic rule destination
	Arn pulumi.StringPtrInput
	// Whether or not to enable the destination. Default: `true`.
	Enabled pulumi.BoolPtrInput
	// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
	VpcConfiguration TopicRuleDestinationVpcConfigurationPtrInput
}

func (TopicRuleDestinationState) ElementType() reflect.Type {
	return reflect.TypeOf((*topicRuleDestinationState)(nil)).Elem()
}

type topicRuleDestinationArgs struct {
	// Whether or not to enable the destination. Default: `true`.
	Enabled *bool `pulumi:"enabled"`
	// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
	VpcConfiguration TopicRuleDestinationVpcConfiguration `pulumi:"vpcConfiguration"`
}

// The set of arguments for constructing a TopicRuleDestination resource.
type TopicRuleDestinationArgs struct {
	// Whether or not to enable the destination. Default: `true`.
	Enabled pulumi.BoolPtrInput
	// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
	VpcConfiguration TopicRuleDestinationVpcConfigurationInput
}

func (TopicRuleDestinationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*topicRuleDestinationArgs)(nil)).Elem()
}

type TopicRuleDestinationInput interface {
	pulumi.Input

	ToTopicRuleDestinationOutput() TopicRuleDestinationOutput
	ToTopicRuleDestinationOutputWithContext(ctx context.Context) TopicRuleDestinationOutput
}

func (*TopicRuleDestination) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicRuleDestination)(nil)).Elem()
}

func (i *TopicRuleDestination) ToTopicRuleDestinationOutput() TopicRuleDestinationOutput {
	return i.ToTopicRuleDestinationOutputWithContext(context.Background())
}

func (i *TopicRuleDestination) ToTopicRuleDestinationOutputWithContext(ctx context.Context) TopicRuleDestinationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleDestinationOutput)
}

// TopicRuleDestinationArrayInput is an input type that accepts TopicRuleDestinationArray and TopicRuleDestinationArrayOutput values.
// You can construct a concrete instance of `TopicRuleDestinationArrayInput` via:
//
//	TopicRuleDestinationArray{ TopicRuleDestinationArgs{...} }
type TopicRuleDestinationArrayInput interface {
	pulumi.Input

	ToTopicRuleDestinationArrayOutput() TopicRuleDestinationArrayOutput
	ToTopicRuleDestinationArrayOutputWithContext(context.Context) TopicRuleDestinationArrayOutput
}

type TopicRuleDestinationArray []TopicRuleDestinationInput

func (TopicRuleDestinationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicRuleDestination)(nil)).Elem()
}

func (i TopicRuleDestinationArray) ToTopicRuleDestinationArrayOutput() TopicRuleDestinationArrayOutput {
	return i.ToTopicRuleDestinationArrayOutputWithContext(context.Background())
}

func (i TopicRuleDestinationArray) ToTopicRuleDestinationArrayOutputWithContext(ctx context.Context) TopicRuleDestinationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleDestinationArrayOutput)
}

// TopicRuleDestinationMapInput is an input type that accepts TopicRuleDestinationMap and TopicRuleDestinationMapOutput values.
// You can construct a concrete instance of `TopicRuleDestinationMapInput` via:
//
//	TopicRuleDestinationMap{ "key": TopicRuleDestinationArgs{...} }
type TopicRuleDestinationMapInput interface {
	pulumi.Input

	ToTopicRuleDestinationMapOutput() TopicRuleDestinationMapOutput
	ToTopicRuleDestinationMapOutputWithContext(context.Context) TopicRuleDestinationMapOutput
}

type TopicRuleDestinationMap map[string]TopicRuleDestinationInput

func (TopicRuleDestinationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicRuleDestination)(nil)).Elem()
}

func (i TopicRuleDestinationMap) ToTopicRuleDestinationMapOutput() TopicRuleDestinationMapOutput {
	return i.ToTopicRuleDestinationMapOutputWithContext(context.Background())
}

func (i TopicRuleDestinationMap) ToTopicRuleDestinationMapOutputWithContext(ctx context.Context) TopicRuleDestinationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TopicRuleDestinationMapOutput)
}

type TopicRuleDestinationOutput struct{ *pulumi.OutputState }

func (TopicRuleDestinationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TopicRuleDestination)(nil)).Elem()
}

func (o TopicRuleDestinationOutput) ToTopicRuleDestinationOutput() TopicRuleDestinationOutput {
	return o
}

func (o TopicRuleDestinationOutput) ToTopicRuleDestinationOutputWithContext(ctx context.Context) TopicRuleDestinationOutput {
	return o
}

// The ARN of the topic rule destination
func (o TopicRuleDestinationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *TopicRuleDestination) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Whether or not to enable the destination. Default: `true`.
func (o TopicRuleDestinationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TopicRuleDestination) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
func (o TopicRuleDestinationOutput) VpcConfiguration() TopicRuleDestinationVpcConfigurationOutput {
	return o.ApplyT(func(v *TopicRuleDestination) TopicRuleDestinationVpcConfigurationOutput { return v.VpcConfiguration }).(TopicRuleDestinationVpcConfigurationOutput)
}

type TopicRuleDestinationArrayOutput struct{ *pulumi.OutputState }

func (TopicRuleDestinationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TopicRuleDestination)(nil)).Elem()
}

func (o TopicRuleDestinationArrayOutput) ToTopicRuleDestinationArrayOutput() TopicRuleDestinationArrayOutput {
	return o
}

func (o TopicRuleDestinationArrayOutput) ToTopicRuleDestinationArrayOutputWithContext(ctx context.Context) TopicRuleDestinationArrayOutput {
	return o
}

func (o TopicRuleDestinationArrayOutput) Index(i pulumi.IntInput) TopicRuleDestinationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TopicRuleDestination {
		return vs[0].([]*TopicRuleDestination)[vs[1].(int)]
	}).(TopicRuleDestinationOutput)
}

type TopicRuleDestinationMapOutput struct{ *pulumi.OutputState }

func (TopicRuleDestinationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TopicRuleDestination)(nil)).Elem()
}

func (o TopicRuleDestinationMapOutput) ToTopicRuleDestinationMapOutput() TopicRuleDestinationMapOutput {
	return o
}

func (o TopicRuleDestinationMapOutput) ToTopicRuleDestinationMapOutputWithContext(ctx context.Context) TopicRuleDestinationMapOutput {
	return o
}

func (o TopicRuleDestinationMapOutput) MapIndex(k pulumi.StringInput) TopicRuleDestinationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TopicRuleDestination {
		return vs[0].(map[string]*TopicRuleDestination)[vs[1].(string)]
	}).(TopicRuleDestinationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleDestinationInput)(nil)).Elem(), &TopicRuleDestination{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleDestinationArrayInput)(nil)).Elem(), TopicRuleDestinationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TopicRuleDestinationMapInput)(nil)).Elem(), TopicRuleDestinationMap{})
	pulumi.RegisterOutputType(TopicRuleDestinationOutput{})
	pulumi.RegisterOutputType(TopicRuleDestinationArrayOutput{})
	pulumi.RegisterOutputType(TopicRuleDestinationMapOutput{})
}