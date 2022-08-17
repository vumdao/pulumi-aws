// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager
{
    public static class GetConnections
    {
        /// <summary>
        /// Retrieve information about connections.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkManager.GetConnections.Invoke(new()
        ///     {
        ///         GlobalNetworkId = @var.Global_network_id,
        ///         Tags = 
        ///         {
        ///             { "Env", "test" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetConnectionsResult> InvokeAsync(GetConnectionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetConnectionsResult>("aws:networkmanager/getConnections:getConnections", args ?? new GetConnectionsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve information about connections.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.NetworkManager.GetConnections.Invoke(new()
        ///     {
        ///         GlobalNetworkId = @var.Global_network_id,
        ///         Tags = 
        ///         {
        ///             { "Env", "test" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetConnectionsResult> Invoke(GetConnectionsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetConnectionsResult>("aws:networkmanager/getConnections:getConnections", args ?? new GetConnectionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the device of the connections to retrieve.
        /// </summary>
        [Input("deviceId")]
        public string? DeviceId { get; set; }

        /// <summary>
        /// The ID of the Global Network of the connections to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public string GlobalNetworkId { get; set; } = null!;

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Restricts the list to the connections with these tags.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetConnectionsArgs()
        {
        }
        public static new GetConnectionsArgs Empty => new GetConnectionsArgs();
    }

    public sealed class GetConnectionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the device of the connections to retrieve.
        /// </summary>
        [Input("deviceId")]
        public Input<string>? DeviceId { get; set; }

        /// <summary>
        /// The ID of the Global Network of the connections to retrieve.
        /// </summary>
        [Input("globalNetworkId", required: true)]
        public Input<string> GlobalNetworkId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Restricts the list to the connections with these tags.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetConnectionsInvokeArgs()
        {
        }
        public static new GetConnectionsInvokeArgs Empty => new GetConnectionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionsResult
    {
        public readonly string? DeviceId;
        public readonly string GlobalNetworkId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IDs of the connections.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string>? Tags;

        [OutputConstructor]
        private GetConnectionsResult(
            string? deviceId,

            string globalNetworkId,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string>? tags)
        {
            DeviceId = deviceId;
            GlobalNetworkId = globalNetworkId;
            Id = id;
            Ids = ids;
            Tags = tags;
        }
    }
}