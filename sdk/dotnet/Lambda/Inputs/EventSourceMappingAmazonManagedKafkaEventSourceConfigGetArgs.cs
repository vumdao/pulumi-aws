// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Lambda.Inputs
{

    public sealed class EventSourceMappingAmazonManagedKafkaEventSourceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A Kafka consumer group ID between 1 and 200 characters for use when creating this event source mapping. If one is not specified, this value will be automatically generated. See [SelfManagedKafkaEventSourceConfig Syntax](https://docs.aws.amazon.com/lambda/latest/dg/API_SelfManagedKafkaEventSourceConfig.html).
        /// </summary>
        [Input("consumerGroupId")]
        public Input<string>? ConsumerGroupId { get; set; }

        public EventSourceMappingAmazonManagedKafkaEventSourceConfigGetArgs()
        {
        }
        public static new EventSourceMappingAmazonManagedKafkaEventSourceConfigGetArgs Empty => new EventSourceMappingAmazonManagedKafkaEventSourceConfigGetArgs();
    }
}