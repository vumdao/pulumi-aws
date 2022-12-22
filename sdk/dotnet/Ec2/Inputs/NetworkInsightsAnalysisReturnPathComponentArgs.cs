// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class NetworkInsightsAnalysisReturnPathComponentArgs : global::Pulumi.ResourceArgs
    {
        [Input("aclRules")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs>? _aclRules;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs> AclRules
        {
            get => _aclRules ?? (_aclRules = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAclRuleArgs>());
            set => _aclRules = value;
        }

        [Input("additionalDetails")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs>? _additionalDetails;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs> AdditionalDetails
        {
            get => _additionalDetails ?? (_additionalDetails = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAdditionalDetailArgs>());
            set => _additionalDetails = value;
        }

        [Input("attachedTos")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs>? _attachedTos;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs> AttachedTos
        {
            get => _attachedTos ?? (_attachedTos = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentAttachedToArgs>());
            set => _attachedTos = value;
        }

        [Input("components")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs>? _components;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs> Components
        {
            get => _components ?? (_components = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentComponentArgs>());
            set => _components = value;
        }

        [Input("destinationVpcs")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs>? _destinationVpcs;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs> DestinationVpcs
        {
            get => _destinationVpcs ?? (_destinationVpcs = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentDestinationVpcArgs>());
            set => _destinationVpcs = value;
        }

        [Input("inboundHeaders")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs>? _inboundHeaders;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs> InboundHeaders
        {
            get => _inboundHeaders ?? (_inboundHeaders = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentInboundHeaderArgs>());
            set => _inboundHeaders = value;
        }

        [Input("outboundHeaders")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs>? _outboundHeaders;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs> OutboundHeaders
        {
            get => _outboundHeaders ?? (_outboundHeaders = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentOutboundHeaderArgs>());
            set => _outboundHeaders = value;
        }

        [Input("routeTableRoutes")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs>? _routeTableRoutes;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs> RouteTableRoutes
        {
            get => _routeTableRoutes ?? (_routeTableRoutes = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentRouteTableRouteArgs>());
            set => _routeTableRoutes = value;
        }

        [Input("securityGroupRules")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs>? _securityGroupRules;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs> SecurityGroupRules
        {
            get => _securityGroupRules ?? (_securityGroupRules = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSecurityGroupRuleArgs>());
            set => _securityGroupRules = value;
        }

        [Input("sequenceNumber")]
        public Input<int>? SequenceNumber { get; set; }

        [Input("sourceVpcs")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs>? _sourceVpcs;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs> SourceVpcs
        {
            get => _sourceVpcs ?? (_sourceVpcs = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSourceVpcArgs>());
            set => _sourceVpcs = value;
        }

        [Input("subnets")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs>? _subnets;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentSubnetArgs>());
            set => _subnets = value;
        }

        [Input("transitGatewayRouteTableRoutes")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs>? _transitGatewayRouteTableRoutes;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs> TransitGatewayRouteTableRoutes
        {
            get => _transitGatewayRouteTableRoutes ?? (_transitGatewayRouteTableRoutes = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayRouteTableRouteArgs>());
            set => _transitGatewayRouteTableRoutes = value;
        }

        [Input("transitGateways")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs>? _transitGateways;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs> TransitGateways
        {
            get => _transitGateways ?? (_transitGateways = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentTransitGatewayArgs>());
            set => _transitGateways = value;
        }

        [Input("vpcs")]
        private InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs>? _vpcs;
        public InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs> Vpcs
        {
            get => _vpcs ?? (_vpcs = new InputList<Inputs.NetworkInsightsAnalysisReturnPathComponentVpcArgs>());
            set => _vpcs = value;
        }

        public NetworkInsightsAnalysisReturnPathComponentArgs()
        {
        }
        public static new NetworkInsightsAnalysisReturnPathComponentArgs Empty => new NetworkInsightsAnalysisReturnPathComponentArgs();
    }
}