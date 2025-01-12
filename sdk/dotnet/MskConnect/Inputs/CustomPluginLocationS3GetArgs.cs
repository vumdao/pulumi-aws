// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.MskConnect.Inputs
{

    public sealed class CustomPluginLocationS3GetArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketArn", required: true)]
        public Input<string> BucketArn { get; set; } = null!;

        [Input("fileKey", required: true)]
        public Input<string> FileKey { get; set; } = null!;

        [Input("objectVersion")]
        public Input<string>? ObjectVersion { get; set; }

        public CustomPluginLocationS3GetArgs()
        {
        }
        public static new CustomPluginLocationS3GetArgs Empty => new CustomPluginLocationS3GetArgs();
    }
}
