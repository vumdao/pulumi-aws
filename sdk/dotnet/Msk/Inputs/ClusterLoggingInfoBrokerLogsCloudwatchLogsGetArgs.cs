// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Inputs
{

    public sealed class ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("logGroup")]
        public Input<string>? LogGroup { get; set; }

        public ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs()
        {
        }
        public static new ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs Empty => new ClusterLoggingInfoBrokerLogsCloudwatchLogsGetArgs();
    }
}
