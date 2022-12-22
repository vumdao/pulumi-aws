// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Outputs
{

    [OutputType]
    public sealed class SpaceSpaceSettings
    {
        /// <summary>
        /// The Jupyter server's app settings. See Jupyter Server App Settings below.
        /// </summary>
        public readonly Outputs.SpaceSpaceSettingsJupyterServerAppSettings? JupyterServerAppSettings;
        /// <summary>
        /// The kernel gateway app settings. See Kernel Gateway App Settings below.
        /// </summary>
        public readonly Outputs.SpaceSpaceSettingsKernelGatewayAppSettings? KernelGatewayAppSettings;

        [OutputConstructor]
        private SpaceSpaceSettings(
            Outputs.SpaceSpaceSettingsJupyterServerAppSettings? jupyterServerAppSettings,

            Outputs.SpaceSpaceSettingsKernelGatewayAppSettings? kernelGatewayAppSettings)
        {
            JupyterServerAppSettings = jupyterServerAppSettings;
            KernelGatewayAppSettings = kernelGatewayAppSettings;
        }
    }
}