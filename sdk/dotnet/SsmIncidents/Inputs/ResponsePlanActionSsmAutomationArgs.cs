// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsmIncidents.Inputs
{

    public sealed class ResponsePlanActionSsmAutomationArgs : global::Pulumi.ResourceArgs
    {
        [Input("documentName", required: true)]
        public Input<string> DocumentName { get; set; } = null!;

        [Input("documentVersion")]
        public Input<string>? DocumentVersion { get; set; }

        [Input("dynamicParameters")]
        private InputMap<string>? _dynamicParameters;
        public InputMap<string> DynamicParameters
        {
            get => _dynamicParameters ?? (_dynamicParameters = new InputMap<string>());
            set => _dynamicParameters = value;
        }

        [Input("parameters")]
        private InputList<Inputs.ResponsePlanActionSsmAutomationParameterArgs>? _parameters;
        public InputList<Inputs.ResponsePlanActionSsmAutomationParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.ResponsePlanActionSsmAutomationParameterArgs>());
            set => _parameters = value;
        }

        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("targetAccount")]
        public Input<string>? TargetAccount { get; set; }

        public ResponsePlanActionSsmAutomationArgs()
        {
        }
        public static new ResponsePlanActionSsmAutomationArgs Empty => new ResponsePlanActionSsmAutomationArgs();
    }
}
