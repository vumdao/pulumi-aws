// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager.Inputs
{

    public sealed class GetCoreNetworkPolicyDocumentSegmentActionInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take for the chosen segment. Valid values `create-route` or `share`.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// A user-defined string describing the segment action.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("destinationCidrBlocks")]
        private InputList<string>? _destinationCidrBlocks;

        /// <summary>
        /// List of strings containing CIDRs. You can define the IPv4 and IPv6 CIDR notation for each AWS Region. For example, `10.1.0.0/16` or `2001:db8::/56`. This is an array of CIDR notation strings.
        /// </summary>
        public InputList<string> DestinationCidrBlocks
        {
            get => _destinationCidrBlocks ?? (_destinationCidrBlocks = new InputList<string>());
            set => _destinationCidrBlocks = value;
        }

        [Input("destinations")]
        private InputList<string>? _destinations;

        /// <summary>
        /// A list of strings. Valid values include `["blackhole"]` or a list of attachment ids.
        /// </summary>
        public InputList<string> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<string>());
            set => _destinations = value;
        }

        /// <summary>
        /// A string. This mode places the attachment and return routes in each of the `share_with` segments. Valid values include: `attachment-route`.
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The name of the segment.
        /// </summary>
        [Input("segment", required: true)]
        public Input<string> Segment { get; set; } = null!;

        [Input("shareWithExcepts")]
        private InputList<string>? _shareWithExcepts;

        /// <summary>
        /// A set subtraction of segments to not share with.
        /// </summary>
        public InputList<string> ShareWithExcepts
        {
            get => _shareWithExcepts ?? (_shareWithExcepts = new InputList<string>());
            set => _shareWithExcepts = value;
        }

        [Input("shareWiths")]
        private InputList<string>? _shareWiths;

        /// <summary>
        /// A list of strings to share with. Must be a substring is all segments. Valid values include: `["*"]` or `["&lt;segment-names&gt;"]`.
        /// </summary>
        public InputList<string> ShareWiths
        {
            get => _shareWiths ?? (_shareWiths = new InputList<string>());
            set => _shareWiths = value;
        }

        public GetCoreNetworkPolicyDocumentSegmentActionInputArgs()
        {
        }
        public static new GetCoreNetworkPolicyDocumentSegmentActionInputArgs Empty => new GetCoreNetworkPolicyDocumentSegmentActionInputArgs();
    }
}