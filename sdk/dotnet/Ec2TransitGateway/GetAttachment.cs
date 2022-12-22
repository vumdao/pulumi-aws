// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2TransitGateway
{
    public static class GetAttachment
    {
        /// <summary>
        /// Get information on an EC2 Transit Gateway's attachment to a resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2TransitGateway.GetAttachment.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2TransitGateway.Inputs.GetAttachmentFilterInputArgs
        ///             {
        ///                 Name = "transit-gateway-id",
        ///                 Values = new[]
        ///                 {
        ///                     aws_ec2_transit_gateway.Example.Id,
        ///                 },
        ///             },
        ///             new Aws.Ec2TransitGateway.Inputs.GetAttachmentFilterInputArgs
        ///             {
        ///                 Name = "resource-type",
        ///                 Values = new[]
        ///                 {
        ///                     "peering",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAttachmentResult> InvokeAsync(GetAttachmentArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAttachmentResult>("aws:ec2transitgateway/getAttachment:getAttachment", args ?? new GetAttachmentArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on an EC2 Transit Gateway's attachment to a resource.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Ec2TransitGateway.GetAttachment.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ec2TransitGateway.Inputs.GetAttachmentFilterInputArgs
        ///             {
        ///                 Name = "transit-gateway-id",
        ///                 Values = new[]
        ///                 {
        ///                     aws_ec2_transit_gateway.Example.Id,
        ///                 },
        ///             },
        ///             new Aws.Ec2TransitGateway.Inputs.GetAttachmentFilterInputArgs
        ///             {
        ///                 Name = "resource-type",
        ///                 Values = new[]
        ///                 {
        ///                     "peering",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAttachmentResult> Invoke(GetAttachmentInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAttachmentResult>("aws:ec2transitgateway/getAttachment:getAttachment", args ?? new GetAttachmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAttachmentArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetAttachmentFilterArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public List<Inputs.GetAttachmentFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAttachmentFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value tags for the attachment.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// ID of the attachment.
        /// </summary>
        [Input("transitGatewayAttachmentId")]
        public string? TransitGatewayAttachmentId { get; set; }

        public GetAttachmentArgs()
        {
        }
        public static new GetAttachmentArgs Empty => new GetAttachmentArgs();
    }

    public sealed class GetAttachmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetAttachmentFilterInputArgs>? _filters;

        /// <summary>
        /// One or more configuration blocks containing name-values filters. Detailed below.
        /// </summary>
        public InputList<Inputs.GetAttachmentFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAttachmentFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value tags for the attachment.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// ID of the attachment.
        /// </summary>
        [Input("transitGatewayAttachmentId")]
        public Input<string>? TransitGatewayAttachmentId { get; set; }

        public GetAttachmentInvokeArgs()
        {
        }
        public static new GetAttachmentInvokeArgs Empty => new GetAttachmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetAttachmentResult
    {
        /// <summary>
        /// ARN of the attachment.
        /// </summary>
        public readonly string Arn;
        public readonly ImmutableArray<Outputs.GetAttachmentFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// ID of the resource.
        /// </summary>
        public readonly string ResourceId;
        /// <summary>
        /// ID of the AWS account that owns the resource.
        /// </summary>
        public readonly string ResourceOwnerId;
        /// <summary>
        /// Resource type.
        /// </summary>
        public readonly string ResourceType;
        /// <summary>
        /// Attachment state.
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Key-value tags for the attachment.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        public readonly string TransitGatewayAttachmentId;
        /// <summary>
        /// ID of the transit gateway.
        /// </summary>
        public readonly string TransitGatewayId;
        /// <summary>
        /// The ID of the AWS account that owns the transit gateway.
        /// </summary>
        public readonly string TransitGatewayOwnerId;

        [OutputConstructor]
        private GetAttachmentResult(
            string arn,

            ImmutableArray<Outputs.GetAttachmentFilterResult> filters,

            string id,

            string resourceId,

            string resourceOwnerId,

            string resourceType,

            string state,

            ImmutableDictionary<string, string> tags,

            string transitGatewayAttachmentId,

            string transitGatewayId,

            string transitGatewayOwnerId)
        {
            Arn = arn;
            Filters = filters;
            Id = id;
            ResourceId = resourceId;
            ResourceOwnerId = resourceOwnerId;
            ResourceType = resourceType;
            State = state;
            Tags = tags;
            TransitGatewayAttachmentId = transitGatewayAttachmentId;
            TransitGatewayId = transitGatewayId;
            TransitGatewayOwnerId = transitGatewayOwnerId;
        }
    }
}