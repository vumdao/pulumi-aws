// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Outputs
{

    [OutputType]
    public sealed class InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig
    {
        /// <summary>
        /// The type of encryption. Valid Values: `KMS`.
        /// </summary>
        public readonly string EncryptionType;
        /// <summary>
        /// The full ARN of the encryption key. Be sure to provide the full ARN of the encryption key, not just the ID.
        /// </summary>
        public readonly string KeyId;

        [OutputConstructor]
        private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig(
            string encryptionType,

            string keyId)
        {
            EncryptionType = encryptionType;
            KeyId = keyId;
        }
    }
}