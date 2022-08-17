// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
        /// </summary>
        [Input("errorHandlingConfig")]
        public Input<Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfigGetArgs>? ErrorHandlingConfig { get; set; }

        [Input("idFieldNames")]
        private InputList<string>? _idFieldNames;

        /// <summary>
        /// The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete.
        /// </summary>
        public InputList<string> IdFieldNames
        {
            get => _idFieldNames ?? (_idFieldNames = new InputList<string>());
            set => _idFieldNames = value;
        }

        /// <summary>
        /// The object path specified in the SAPOData flow source.
        /// </summary>
        [Input("objectPath", required: true)]
        public Input<string> ObjectPath { get; set; } = null!;

        /// <summary>
        /// Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
        /// </summary>
        [Input("successResponseHandlingConfig")]
        public Input<Inputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfigGetArgs>? SuccessResponseHandlingConfig { get; set; }

        /// <summary>
        /// This specifies the type of write operation to be performed in Zendesk. When the value is `UPSERT`, then `id_field_names` is required. Valid values are `INSERT`, `UPSERT`, `UPDATE`, and `DELETE`.
        /// </summary>
        [Input("writeOperationType")]
        public Input<string>? WriteOperationType { get; set; }

        public FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataGetArgs()
        {
        }
        public static new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataGetArgs Empty => new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataGetArgs();
    }
}