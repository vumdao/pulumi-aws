// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Neptune.Outputs
{

    [OutputType]
    public sealed class ClusterServerlessV2ScalingConfiguration
    {
        public readonly double? MaxCapacity;
        public readonly double? MinCapacity;

        [OutputConstructor]
        private ClusterServerlessV2ScalingConfiguration(
            double? maxCapacity,

            double? minCapacity)
        {
            MaxCapacity = maxCapacity;
            MinCapacity = minCapacity;
        }
    }
}