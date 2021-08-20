// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package chime

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type VoiceConnectorGroupConnector struct {
	// The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
	Priority int `pulumi:"priority"`
	// The Amazon Chime Voice Connector ID.
	VoiceConnectorId string `pulumi:"voiceConnectorId"`
}

// VoiceConnectorGroupConnectorInput is an input type that accepts VoiceConnectorGroupConnectorArgs and VoiceConnectorGroupConnectorOutput values.
// You can construct a concrete instance of `VoiceConnectorGroupConnectorInput` via:
//
//          VoiceConnectorGroupConnectorArgs{...}
type VoiceConnectorGroupConnectorInput interface {
	pulumi.Input

	ToVoiceConnectorGroupConnectorOutput() VoiceConnectorGroupConnectorOutput
	ToVoiceConnectorGroupConnectorOutputWithContext(context.Context) VoiceConnectorGroupConnectorOutput
}

type VoiceConnectorGroupConnectorArgs struct {
	// The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
	Priority pulumi.IntInput `pulumi:"priority"`
	// The Amazon Chime Voice Connector ID.
	VoiceConnectorId pulumi.StringInput `pulumi:"voiceConnectorId"`
}

func (VoiceConnectorGroupConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*VoiceConnectorGroupConnector)(nil)).Elem()
}

func (i VoiceConnectorGroupConnectorArgs) ToVoiceConnectorGroupConnectorOutput() VoiceConnectorGroupConnectorOutput {
	return i.ToVoiceConnectorGroupConnectorOutputWithContext(context.Background())
}

func (i VoiceConnectorGroupConnectorArgs) ToVoiceConnectorGroupConnectorOutputWithContext(ctx context.Context) VoiceConnectorGroupConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VoiceConnectorGroupConnectorOutput)
}

// VoiceConnectorGroupConnectorArrayInput is an input type that accepts VoiceConnectorGroupConnectorArray and VoiceConnectorGroupConnectorArrayOutput values.
// You can construct a concrete instance of `VoiceConnectorGroupConnectorArrayInput` via:
//
//          VoiceConnectorGroupConnectorArray{ VoiceConnectorGroupConnectorArgs{...} }
type VoiceConnectorGroupConnectorArrayInput interface {
	pulumi.Input

	ToVoiceConnectorGroupConnectorArrayOutput() VoiceConnectorGroupConnectorArrayOutput
	ToVoiceConnectorGroupConnectorArrayOutputWithContext(context.Context) VoiceConnectorGroupConnectorArrayOutput
}

type VoiceConnectorGroupConnectorArray []VoiceConnectorGroupConnectorInput

func (VoiceConnectorGroupConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VoiceConnectorGroupConnector)(nil)).Elem()
}

func (i VoiceConnectorGroupConnectorArray) ToVoiceConnectorGroupConnectorArrayOutput() VoiceConnectorGroupConnectorArrayOutput {
	return i.ToVoiceConnectorGroupConnectorArrayOutputWithContext(context.Background())
}

func (i VoiceConnectorGroupConnectorArray) ToVoiceConnectorGroupConnectorArrayOutputWithContext(ctx context.Context) VoiceConnectorGroupConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VoiceConnectorGroupConnectorArrayOutput)
}

type VoiceConnectorGroupConnectorOutput struct{ *pulumi.OutputState }

func (VoiceConnectorGroupConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*VoiceConnectorGroupConnector)(nil)).Elem()
}

func (o VoiceConnectorGroupConnectorOutput) ToVoiceConnectorGroupConnectorOutput() VoiceConnectorGroupConnectorOutput {
	return o
}

func (o VoiceConnectorGroupConnectorOutput) ToVoiceConnectorGroupConnectorOutputWithContext(ctx context.Context) VoiceConnectorGroupConnectorOutput {
	return o
}

// The priority associated with the Amazon Chime Voice Connector, with 1 being the highest priority. Higher priority Amazon Chime Voice Connectors are attempted first.
func (o VoiceConnectorGroupConnectorOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v VoiceConnectorGroupConnector) int { return v.Priority }).(pulumi.IntOutput)
}

// The Amazon Chime Voice Connector ID.
func (o VoiceConnectorGroupConnectorOutput) VoiceConnectorId() pulumi.StringOutput {
	return o.ApplyT(func(v VoiceConnectorGroupConnector) string { return v.VoiceConnectorId }).(pulumi.StringOutput)
}

type VoiceConnectorGroupConnectorArrayOutput struct{ *pulumi.OutputState }

func (VoiceConnectorGroupConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]VoiceConnectorGroupConnector)(nil)).Elem()
}

func (o VoiceConnectorGroupConnectorArrayOutput) ToVoiceConnectorGroupConnectorArrayOutput() VoiceConnectorGroupConnectorArrayOutput {
	return o
}

func (o VoiceConnectorGroupConnectorArrayOutput) ToVoiceConnectorGroupConnectorArrayOutputWithContext(ctx context.Context) VoiceConnectorGroupConnectorArrayOutput {
	return o
}

func (o VoiceConnectorGroupConnectorArrayOutput) Index(i pulumi.IntInput) VoiceConnectorGroupConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) VoiceConnectorGroupConnector {
		return vs[0].([]VoiceConnectorGroupConnector)[vs[1].(int)]
	}).(VoiceConnectorGroupConnectorOutput)
}

func init() {
	pulumi.RegisterOutputType(VoiceConnectorGroupConnectorOutput{})
	pulumi.RegisterOutputType(VoiceConnectorGroupConnectorArrayOutput{})
}