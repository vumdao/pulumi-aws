// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Outputs
{

    [OutputType]
    public sealed class AnalyticsApplicationInputsSchemaRecordColumn
    {
        /// <summary>
        /// The Mapping reference to the data element.
        /// </summary>
        public readonly string? Mapping;
        /// <summary>
        /// Name of the column.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The SQL Type of the column.
        /// </summary>
        public readonly string SqlType;

        [OutputConstructor]
        private AnalyticsApplicationInputsSchemaRecordColumn(
            string? mapping,

            string name,

            string sqlType)
        {
            Mapping = mapping;
            Name = name;
            SqlType = sqlType;
        }
    }
}