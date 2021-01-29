// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fms.Outputs
{

    [OutputType]
    public sealed class PolicyExcludeMap
    {
        /// <summary>
        /// A list of AWS Organization member Accounts that you want to include for this AWS FMS Policy.
        /// </summary>
        public readonly ImmutableArray<string> Accounts;
        public readonly ImmutableArray<string> Orgunits;

        [OutputConstructor]
        private PolicyExcludeMap(
            ImmutableArray<string> accounts,

            ImmutableArray<string> orgunits)
        {
            Accounts = accounts;
            Orgunits = orgunits;
        }
    }
}