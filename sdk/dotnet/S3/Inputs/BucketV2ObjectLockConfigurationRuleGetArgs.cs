// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketV2ObjectLockConfigurationRuleGetArgs : Pulumi.ResourceArgs
    {
        [Input("defaultRetentions")]
        private InputList<Inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionGetArgs>? _defaultRetentions;

        /// <summary>
        /// The default retention period applied to new objects placed in this bucket.
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_object_lock_configuration resource instead")]
        public InputList<Inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionGetArgs> DefaultRetentions
        {
            get => _defaultRetentions ?? (_defaultRetentions = new InputList<Inputs.BucketV2ObjectLockConfigurationRuleDefaultRetentionGetArgs>());
            set => _defaultRetentions = value;
        }

        public BucketV2ObjectLockConfigurationRuleGetArgs()
        {
        }
    }
}