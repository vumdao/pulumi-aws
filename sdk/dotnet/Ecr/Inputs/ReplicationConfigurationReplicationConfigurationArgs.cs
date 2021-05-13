// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecr.Inputs
{

    public sealed class ReplicationConfigurationReplicationConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The replication rules for a replication configuration. See Rule.
        /// </summary>
        [Input("rule", required: true)]
        public Input<Inputs.ReplicationConfigurationReplicationConfigurationRuleArgs> Rule { get; set; } = null!;

        public ReplicationConfigurationReplicationConfigurationArgs()
        {
        }
    }
}