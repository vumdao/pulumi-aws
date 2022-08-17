// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type authentication.
        /// </summary>
        [Input("authCodeUrl", required: true)]
        public Input<string> AuthCodeUrl { get; set; } = null!;

        [Input("oauthScopes", required: true)]
        private InputList<string>? _oauthScopes;

        /// <summary>
        /// The OAuth scopes required for OAuth type authentication.
        /// </summary>
        public InputList<string> OauthScopes
        {
            get => _oauthScopes ?? (_oauthScopes = new InputList<string>());
            set => _oauthScopes = value;
        }

        /// <summary>
        /// The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access token using refresh token.
        /// </summary>
        [Input("tokenUrl", required: true)]
        public Input<string> TokenUrl { get; set; } = null!;

        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesSapoDataOauthPropertiesArgs();
    }
}