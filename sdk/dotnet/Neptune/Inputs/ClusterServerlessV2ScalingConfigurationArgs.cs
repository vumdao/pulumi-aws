// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Neptune.Inputs
{

    public sealed class ClusterServerlessV2ScalingConfigurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxCapacity")]
        public Input<double>? MaxCapacity { get; set; }

        [Input("minCapacity")]
        public Input<double>? MinCapacity { get; set; }

        public ClusterServerlessV2ScalingConfigurationArgs()
        {
        }
        public static new ClusterServerlessV2ScalingConfigurationArgs Empty => new ClusterServerlessV2ScalingConfigurationArgs();
    }
}