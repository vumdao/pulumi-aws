// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppConfig
{
    /// <summary>
    /// Provides an Amazon AppIntegrations Event Integration resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.AppConfig.EventIntegration("example", new()
    ///     {
    ///         Description = "Example Description",
    ///         EventFilter = new Aws.AppConfig.Inputs.EventIntegrationEventFilterArgs
    ///         {
    ///             Source = "aws.partner/examplepartner.com",
    ///         },
    ///         EventbridgeBus = "default",
    ///         Tags = 
    ///         {
    ///             { "Name", "Example Event Integration" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Amazon AppIntegrations Event Integrations can be imported using the `name` e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:appconfig/eventIntegration:EventIntegration example example-name
    /// ```
    /// </summary>
    [AwsResourceType("aws:appconfig/eventIntegration:EventIntegration")]
    public partial class EventIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Event Integration.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Specifies the description of the Event Integration.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A block that defines the configuration information for the event filter. The Event Filter block is documented below.
        /// </summary>
        [Output("eventFilter")]
        public Output<Outputs.EventIntegrationEventFilter> EventFilter { get; private set; } = null!;

        /// <summary>
        /// Specifies the EventBridge bus.
        /// </summary>
        [Output("eventbridgeBus")]
        public Output<string> EventbridgeBus { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Event Integration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a EventIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EventIntegration(string name, EventIntegrationArgs args, CustomResourceOptions? options = null)
            : base("aws:appconfig/eventIntegration:EventIntegration", name, args ?? new EventIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EventIntegration(string name, Input<string> id, EventIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("aws:appconfig/eventIntegration:EventIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing EventIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EventIntegration Get(string name, Input<string> id, EventIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new EventIntegration(name, id, state, options);
        }
    }

    public sealed class EventIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the description of the Event Integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A block that defines the configuration information for the event filter. The Event Filter block is documented below.
        /// </summary>
        [Input("eventFilter", required: true)]
        public Input<Inputs.EventIntegrationEventFilterArgs> EventFilter { get; set; } = null!;

        /// <summary>
        /// Specifies the EventBridge bus.
        /// </summary>
        [Input("eventbridgeBus", required: true)]
        public Input<string> EventbridgeBus { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Event Integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public EventIntegrationArgs()
        {
        }
        public static new EventIntegrationArgs Empty => new EventIntegrationArgs();
    }

    public sealed class EventIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Event Integration.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Specifies the description of the Event Integration.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A block that defines the configuration information for the event filter. The Event Filter block is documented below.
        /// </summary>
        [Input("eventFilter")]
        public Input<Inputs.EventIntegrationEventFilterGetArgs>? EventFilter { get; set; }

        /// <summary>
        /// Specifies the EventBridge bus.
        /// </summary>
        [Input("eventbridgeBus")]
        public Input<string>? EventbridgeBus { get; set; }

        /// <summary>
        /// Specifies the name of the Event Integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Event Integration. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public EventIntegrationState()
        {
        }
        public static new EventIntegrationState Empty => new EventIntegrationState();
    }
}