// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class DataSourceOpensearchserviceConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("endpoint", required: true)]
        public Input<string> Endpoint { get; set; } = null!;

        [Input("region")]
        public Input<string>? Region { get; set; }

        public DataSourceOpensearchserviceConfigGetArgs()
        {
        }
        public static new DataSourceOpensearchserviceConfigGetArgs Empty => new DataSourceOpensearchserviceConfigGetArgs();
    }
}
