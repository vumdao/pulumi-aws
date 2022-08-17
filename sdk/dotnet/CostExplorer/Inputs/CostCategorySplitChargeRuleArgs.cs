// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Inputs
{

    public sealed class CostCategorySplitChargeRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Method that's used to define how to split your source costs across your targets. Valid values are `FIXED`, `PROPORTIONAL`, `EVEN`
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        [Input("parameters")]
        private InputList<Inputs.CostCategorySplitChargeRuleParameterArgs>? _parameters;

        /// <summary>
        /// Configuration block for the parameters for a split charge method. This is only required for the `FIXED` method. See below.
        /// </summary>
        public InputList<Inputs.CostCategorySplitChargeRuleParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.CostCategorySplitChargeRuleParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// Cost Category value that you want to split.
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        [Input("targets", required: true)]
        private InputList<string>? _targets;

        /// <summary>
        /// Cost Category values that you want to split costs across. These values can't be used as a source in other split charge rules.
        /// </summary>
        public InputList<string> Targets
        {
            get => _targets ?? (_targets = new InputList<string>());
            set => _targets = value;
        }

        public CostCategorySplitChargeRuleArgs()
        {
        }
        public static new CostCategorySplitChargeRuleArgs Empty => new CostCategorySplitChargeRuleArgs();
    }
}