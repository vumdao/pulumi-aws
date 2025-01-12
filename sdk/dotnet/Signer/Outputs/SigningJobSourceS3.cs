// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Signer.Outputs
{

    [OutputType]
    public sealed class SigningJobSourceS3
    {
        public readonly string Bucket;
        public readonly string Key;
        public readonly string Version;

        [OutputConstructor]
        private SigningJobSourceS3(
            string bucket,

            string key,

            string version)
        {
            Bucket = bucket;
            Key = key;
            Version = version;
        }
    }
}
