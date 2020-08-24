// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an EC2 Transit Gateway Peering Attachment.
// For examples of custom route table association and propagation, see the [EC2 Transit Gateway Networking Examples Guide](https://docs.aws.amazon.com/vpc/latest/tgw/TGW_Scenarios.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/ec2transitgateway"
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/providers"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := providers.Newaws(ctx, "local", &providers.awsArgs{
// 			Region: pulumi.String("us-east-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = providers.Newaws(ctx, "peer", &providers.awsArgs{
// 			Region: pulumi.String("us-west-2"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		peerRegion, err := aws.GetRegion(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		localTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "localTransitGateway", &ec2transitgateway.TransitGatewayArgs{
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("Local TGW"),
// 			},
// 		}, pulumi.Provider(aws.Local))
// 		if err != nil {
// 			return err
// 		}
// 		peerTransitGateway, err := ec2transitgateway.NewTransitGateway(ctx, "peerTransitGateway", &ec2transitgateway.TransitGatewayArgs{
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("Peer TGW"),
// 			},
// 		}, pulumi.Provider(aws.Peer))
// 		if err != nil {
// 			return err
// 		}
// 		_, err = ec2transitgateway.NewPeeringAttachment(ctx, "example", &ec2transitgateway.PeeringAttachmentArgs{
// 			PeerAccountId:        peerTransitGateway.OwnerId,
// 			PeerRegion:           pulumi.String(peerRegion.Name),
// 			PeerTransitGatewayId: peerTransitGateway.ID(),
// 			TransitGatewayId:     localTransitGateway.ID(),
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("TGW Peering Requestor"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type PeeringAttachment struct {
	pulumi.CustomResourceState

	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
	PeerAccountId pulumi.StringOutput `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringOutput `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringOutput `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringOutput `pulumi:"transitGatewayId"`
}

// NewPeeringAttachment registers a new resource with the given unique name, arguments, and options.
func NewPeeringAttachment(ctx *pulumi.Context,
	name string, args *PeeringAttachmentArgs, opts ...pulumi.ResourceOption) (*PeeringAttachment, error) {
	if args == nil || args.PeerRegion == nil {
		return nil, errors.New("missing required argument 'PeerRegion'")
	}
	if args == nil || args.PeerTransitGatewayId == nil {
		return nil, errors.New("missing required argument 'PeerTransitGatewayId'")
	}
	if args == nil || args.TransitGatewayId == nil {
		return nil, errors.New("missing required argument 'TransitGatewayId'")
	}
	if args == nil {
		args = &PeeringAttachmentArgs{}
	}
	var resource PeeringAttachment
	err := ctx.RegisterResource("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPeeringAttachment gets an existing PeeringAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPeeringAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PeeringAttachmentState, opts ...pulumi.ResourceOption) (*PeeringAttachment, error) {
	var resource PeeringAttachment
	err := ctx.ReadResource("aws:ec2transitgateway/peeringAttachment:PeeringAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PeeringAttachment resources.
type peeringAttachmentState struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
	PeerAccountId *string `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion *string `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId *string `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId *string `pulumi:"transitGatewayId"`
}

type PeeringAttachmentState struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
	PeerAccountId pulumi.StringPtrInput
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringPtrInput
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringPtrInput
	// Key-value tags for the EC2 Transit Gateway Peering Attachment.
	Tags pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringPtrInput
}

func (PeeringAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*peeringAttachmentState)(nil)).Elem()
}

type peeringAttachmentArgs struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
	PeerAccountId *string `pulumi:"peerAccountId"`
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion string `pulumi:"peerRegion"`
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId string `pulumi:"peerTransitGatewayId"`
	// Key-value tags for the EC2 Transit Gateway Peering Attachment.
	Tags map[string]string `pulumi:"tags"`
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId string `pulumi:"transitGatewayId"`
}

// The set of arguments for constructing a PeeringAttachment resource.
type PeeringAttachmentArgs struct {
	// Account ID of EC2 Transit Gateway to peer with. Defaults to the account ID the current provider is currently connected to.
	PeerAccountId pulumi.StringPtrInput
	// Region of EC2 Transit Gateway to peer with.
	PeerRegion pulumi.StringInput
	// Identifier of EC2 Transit Gateway to peer with.
	PeerTransitGatewayId pulumi.StringInput
	// Key-value tags for the EC2 Transit Gateway Peering Attachment.
	Tags pulumi.StringMapInput
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId pulumi.StringInput
}

func (PeeringAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*peeringAttachmentArgs)(nil)).Elem()
}