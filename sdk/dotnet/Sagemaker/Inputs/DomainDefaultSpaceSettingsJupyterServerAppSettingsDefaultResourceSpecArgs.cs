// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance type that the image version runs on.. For valid values see [SageMaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
        /// </summary>
        [Input("lifecycleConfigArn")]
        public Input<string>? LifecycleConfigArn { get; set; }

        /// <summary>
        /// The ARN of the SageMaker image that the image version belongs to.
        /// </summary>
        [Input("sagemakerImageArn")]
        public Input<string>? SagemakerImageArn { get; set; }

        /// <summary>
        /// The ARN of the image version created on the instance.
        /// </summary>
        [Input("sagemakerImageVersionArn")]
        public Input<string>? SagemakerImageVersionArn { get; set; }

        public DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs()
        {
        }
        public static new DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs Empty => new DomainDefaultSpaceSettingsJupyterServerAppSettingsDefaultResourceSpecArgs();
    }
}