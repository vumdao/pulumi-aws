// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionDefaultCacheBehaviorFunctionAssociationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The specific event to trigger this function.
        /// Valid values: `viewer-request` or `viewer-response`
        /// </summary>
        [Input("eventType", required: true)]
        public Input<string> EventType { get; set; } = null!;

        /// <summary>
        /// ARN of the Cloudfront function.
        /// </summary>
        [Input("functionArn", required: true)]
        public Input<string> FunctionArn { get; set; } = null!;

        public DistributionDefaultCacheBehaviorFunctionAssociationGetArgs()
        {
        }
    }
}