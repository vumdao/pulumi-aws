// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Backup.Inputs
{

    public sealed class FrameworkControlInputParameterGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of a parameter, for example, BackupPlanFrequency.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The value of parameter, for example, hourly.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public FrameworkControlInputParameterGetArgs()
        {
        }
        public static new FrameworkControlInputParameterGetArgs Empty => new FrameworkControlInputParameterGetArgs();
    }
}