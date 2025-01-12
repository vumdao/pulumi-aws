// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Inputs
{

    public sealed class GroupMixedInstancesPolicyLaunchTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("launchTemplateSpecification", required: true)]
        public Input<Inputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecificationGetArgs> LaunchTemplateSpecification { get; set; } = null!;

        [Input("overrides")]
        private InputList<Inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>? _overrides;
        public InputList<Inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.GroupMixedInstancesPolicyLaunchTemplateOverrideGetArgs>());
            set => _overrides = value;
        }

        public GroupMixedInstancesPolicyLaunchTemplateGetArgs()
        {
        }
        public static new GroupMixedInstancesPolicyLaunchTemplateGetArgs Empty => new GroupMixedInstancesPolicyLaunchTemplateGetArgs();
    }
}
