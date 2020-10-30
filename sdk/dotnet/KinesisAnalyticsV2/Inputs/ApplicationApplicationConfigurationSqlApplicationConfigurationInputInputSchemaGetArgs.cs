// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.KinesisAnalyticsV2.Inputs
{

    public sealed class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs : Pulumi.ResourceArgs
    {
        [Input("recordColumns", required: true)]
        private InputList<Inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnGetArgs>? _recordColumns;

        /// <summary>
        /// Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
        /// </summary>
        public InputList<Inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnGetArgs> RecordColumns
        {
            get => _recordColumns ?? (_recordColumns = new InputList<Inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnGetArgs>());
            set => _recordColumns = value;
        }

        /// <summary>
        /// Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
        /// </summary>
        [Input("recordEncoding")]
        public Input<string>? RecordEncoding { get; set; }

        /// <summary>
        /// Specifies the format of the records on the streaming source.
        /// </summary>
        [Input("recordFormat", required: true)]
        public Input<Inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatGetArgs> RecordFormat { get; set; } = null!;

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaGetArgs()
        {
        }
    }
}