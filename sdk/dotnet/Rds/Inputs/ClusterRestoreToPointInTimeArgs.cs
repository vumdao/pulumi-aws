// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds.Inputs
{

    public sealed class ClusterRestoreToPointInTimeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Date and time in UTC format to restore the database cluster to. Conflicts with `use_latest_restorable_time`.
        /// </summary>
        [Input("restoreToTime")]
        public Input<string>? RestoreToTime { get; set; }

        /// <summary>
        /// Type of restore to be performed.
        /// Valid options are `full-copy` (default) and `copy-on-write`.
        /// </summary>
        [Input("restoreType")]
        public Input<string>? RestoreType { get; set; }

        /// <summary>
        /// The identifier of the source database cluster from which to restore.
        /// </summary>
        [Input("sourceClusterIdentifier", required: true)]
        public Input<string> SourceClusterIdentifier { get; set; } = null!;

        /// <summary>
        /// Set to true to restore the database cluster to the latest restorable backup time. Defaults to false. Conflicts with `restore_to_time`.
        /// </summary>
        [Input("useLatestRestorableTime")]
        public Input<bool>? UseLatestRestorableTime { get; set; }

        public ClusterRestoreToPointInTimeArgs()
        {
        }
    }
}