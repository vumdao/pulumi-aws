// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkFirewall.Outputs
{

    [OutputType]
    public sealed class GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionResult
    {
        public readonly ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionResult> Dimensions;

        [OutputConstructor]
        private GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionResult(ImmutableArray<Outputs.GetFirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionResult> dimensions)
        {
            Dimensions = dimensions;
        }
    }
}