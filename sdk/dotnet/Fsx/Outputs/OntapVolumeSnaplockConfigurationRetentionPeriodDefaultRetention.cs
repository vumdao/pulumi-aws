// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Outputs
{

    [OutputType]
    public sealed class OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention
    {
        public readonly string? Type;
        public readonly int? Value;

        [OutputConstructor]
        private OntapVolumeSnaplockConfigurationRetentionPeriodDefaultRetention(
            string? type,

            int? value)
        {
            Type = type;
            Value = value;
        }
    }
}
