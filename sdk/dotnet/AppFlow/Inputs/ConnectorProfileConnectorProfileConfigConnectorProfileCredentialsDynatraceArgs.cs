// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API tokens used by Dynatrace API to authenticate various API calls.
        /// </summary>
        [Input("apiToken", required: true)]
        public Input<string> ApiToken { get; set; } = null!;

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsDynatraceArgs();
    }
}