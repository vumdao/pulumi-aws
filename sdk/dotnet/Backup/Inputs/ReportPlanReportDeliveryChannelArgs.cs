// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Backup.Inputs
{

    public sealed class ReportPlanReportDeliveryChannelArgs : global::Pulumi.ResourceArgs
    {
        [Input("formats")]
        private InputList<string>? _formats;

        /// <summary>
        /// A list of the format of your reports: CSV, JSON, or both. If not specified, the default format is CSV.
        /// </summary>
        public InputList<string> Formats
        {
            get => _formats ?? (_formats = new InputList<string>());
            set => _formats = value;
        }

        /// <summary>
        /// The unique name of the S3 bucket that receives your reports.
        /// </summary>
        [Input("s3BucketName", required: true)]
        public Input<string> S3BucketName { get; set; } = null!;

        /// <summary>
        /// The prefix for where Backup Audit Manager delivers your reports to Amazon S3. The prefix is this part of the following path: s3://your-bucket-name/prefix/Backup/us-west-2/year/month/day/report-name. If not specified, there is no prefix.
        /// </summary>
        [Input("s3KeyPrefix")]
        public Input<string>? S3KeyPrefix { get; set; }

        public ReportPlanReportDeliveryChannelArgs()
        {
        }
        public static new ReportPlanReportDeliveryChannelArgs Empty => new ReportPlanReportDeliveryChannelArgs();
    }
}