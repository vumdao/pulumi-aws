// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpsWorks.Inputs
{

    public sealed class CustomLayerLoadBasedAutoScalingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The downscaling settings, as defined below, used for load-based autoscaling
        /// </summary>
        [Input("downscaling")]
        public Input<Inputs.CustomLayerLoadBasedAutoScalingDownscalingGetArgs>? Downscaling { get; set; }

        /// <summary>
        /// Whether load-based auto scaling is enabled for the layer.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// The upscaling settings, as defined below, used for load-based autoscaling
        /// </summary>
        [Input("upscaling")]
        public Input<Inputs.CustomLayerLoadBasedAutoScalingUpscalingGetArgs>? Upscaling { get; set; }

        public CustomLayerLoadBasedAutoScalingGetArgs()
        {
        }
        public static new CustomLayerLoadBasedAutoScalingGetArgs Empty => new CustomLayerLoadBasedAutoScalingGetArgs();
    }
}