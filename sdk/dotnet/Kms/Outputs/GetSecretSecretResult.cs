// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kms.Outputs
{

    [OutputType]
    public sealed class GetSecretSecretResult
    {
        public readonly ImmutableDictionary<string, string>? Context;
        public readonly ImmutableArray<string> GrantTokens;
        public readonly string Name;
        public readonly string Payload;

        [OutputConstructor]
        private GetSecretSecretResult(
            ImmutableDictionary<string, string>? context,

            ImmutableArray<string> grantTokens,

            string name,

            string payload)
        {
            Context = context;
            GrantTokens = grantTokens;
            Name = name;
            Payload = payload;
        }
    }
}