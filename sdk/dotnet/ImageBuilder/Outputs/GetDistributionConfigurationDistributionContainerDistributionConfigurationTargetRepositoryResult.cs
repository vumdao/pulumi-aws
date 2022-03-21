// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder.Outputs
{

    [OutputType]
    public sealed class GetDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryResult
    {
        /// <summary>
        /// Name of the container repository where the output container image is stored.
        /// </summary>
        public readonly string RepositoryName;
        /// <summary>
        /// Service in which the image is registered.
        /// </summary>
        public readonly string Service;

        [OutputConstructor]
        private GetDistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryResult(
            string repositoryName,

            string service)
        {
            RepositoryName = repositoryName;
            Service = service;
        }
    }
}