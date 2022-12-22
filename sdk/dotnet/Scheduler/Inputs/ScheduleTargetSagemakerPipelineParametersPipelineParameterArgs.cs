// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Scheduler.Inputs
{

    public sealed class ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parameter to start execution of a SageMaker Model Building Pipeline.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Value of parameter to start execution of a SageMaker Model Building Pipeline.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs()
        {
        }
        public static new ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs Empty => new ScheduleTargetSagemakerPipelineParametersPipelineParameterArgs();
    }
}