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
    public sealed class PhoneNumberStatus
    {
        /// <summary>
        /// The status message.
        /// </summary>
        public readonly string? Message;
        /// <summary>
        /// The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        /// </summary>
        public readonly string? Status;

        [OutputConstructor]
        private PhoneNumberStatus(
            string? message,

            string? status)
        {
            Message = message;
            Status = status;
        }
    }
}