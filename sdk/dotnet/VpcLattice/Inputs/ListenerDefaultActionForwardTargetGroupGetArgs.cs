// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VpcLattice.Inputs
{

    public sealed class ListenerDefaultActionForwardTargetGroupGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("targetGroupIdentifier")]
        public Input<string>? TargetGroupIdentifier { get; set; }

        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public ListenerDefaultActionForwardTargetGroupGetArgs()
        {
        }
        public static new ListenerDefaultActionForwardTargetGroupGetArgs Empty => new ListenerDefaultActionForwardTargetGroupGetArgs();
    }
}
