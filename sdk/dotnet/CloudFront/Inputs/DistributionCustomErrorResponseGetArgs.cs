// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionCustomErrorResponseGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("errorCachingMinTtl")]
        public Input<int>? ErrorCachingMinTtl { get; set; }

        [Input("errorCode", required: true)]
        public Input<int> ErrorCode { get; set; } = null!;

        [Input("responseCode")]
        public Input<int>? ResponseCode { get; set; }

        [Input("responsePagePath")]
        public Input<string>? ResponsePagePath { get; set; }

        public DistributionCustomErrorResponseGetArgs()
        {
        }
        public static new DistributionCustomErrorResponseGetArgs Empty => new DistributionCustomErrorResponseGetArgs();
    }
}
