// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecs.Outputs
{

    [OutputType]
    public sealed class CapacityProviderAutoScalingGroupProvider
    {
        /// <summary>
        /// - The Amazon Resource Name (ARN) of the associated auto scaling group.
        /// </summary>
        public readonly string AutoScalingGroupArn;
        /// <summary>
        /// - Nested argument defining the parameters of the auto scaling. Defined below.
        /// </summary>
        public readonly Outputs.CapacityProviderAutoScalingGroupProviderManagedScaling? ManagedScaling;
        /// <summary>
        /// - Enables or disables container-aware termination of instances in the auto scaling group when scale-in happens. Valid values are `ENABLED` and `DISABLED`.
        /// </summary>
        public readonly string? ManagedTerminationProtection;

        [OutputConstructor]
        private CapacityProviderAutoScalingGroupProvider(
            string autoScalingGroupArn,

            Outputs.CapacityProviderAutoScalingGroupProviderManagedScaling? managedScaling,

            string? managedTerminationProtection)
        {
            AutoScalingGroupArn = autoScalingGroupArn;
            ManagedScaling = managedScaling;
            ManagedTerminationProtection = managedTerminationProtection;
        }
    }
}