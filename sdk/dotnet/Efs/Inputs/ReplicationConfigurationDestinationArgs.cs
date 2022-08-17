// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs.Inputs
{

    public sealed class ReplicationConfigurationDestinationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The availability zone in which the replica should be created. If specified, the replica will be created with One Zone storage. If omitted, regional storage will be used.
        /// </summary>
        [Input("availabilityZoneName")]
        public Input<string>? AvailabilityZoneName { get; set; }

        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// The Key ID, ARN, alias, or alias ARN of the KMS key that should be used to encrypt the replica file system. If omitted, the default KMS key for EFS `/aws/elasticfilesystem` will be used.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The region in which the replica should be created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public ReplicationConfigurationDestinationArgs()
        {
        }
        public static new ReplicationConfigurationDestinationArgs Empty => new ReplicationConfigurationDestinationArgs();
    }
}