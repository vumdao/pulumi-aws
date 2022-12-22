// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The URL of the Git repository.
        /// </summary>
        [Input("repositoryUrl", required: true)]
        public Input<string> RepositoryUrl { get; set; } = null!;

        public DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs()
        {
        }
        public static new DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs Empty => new DomainDefaultSpaceSettingsJupyterServerAppSettingsCodeRepositoryArgs();
    }
}