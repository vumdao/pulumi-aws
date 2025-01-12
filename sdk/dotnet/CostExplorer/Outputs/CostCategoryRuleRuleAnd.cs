// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Outputs
{

    [OutputType]
    public sealed class CostCategoryRuleRuleAnd
    {
        public readonly ImmutableArray<Outputs.CostCategoryRuleRuleAndAnd> Ands;
        public readonly Outputs.CostCategoryRuleRuleAndCostCategory? CostCategory;
        public readonly Outputs.CostCategoryRuleRuleAndDimension? Dimension;
        public readonly Outputs.CostCategoryRuleRuleAndNot? Not;
        public readonly ImmutableArray<Outputs.CostCategoryRuleRuleAndOr> Ors;
        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public readonly Outputs.CostCategoryRuleRuleAndTags? Tags;

        [OutputConstructor]
        private CostCategoryRuleRuleAnd(
            ImmutableArray<Outputs.CostCategoryRuleRuleAndAnd> ands,

            Outputs.CostCategoryRuleRuleAndCostCategory? costCategory,

            Outputs.CostCategoryRuleRuleAndDimension? dimension,

            Outputs.CostCategoryRuleRuleAndNot? not,

            ImmutableArray<Outputs.CostCategoryRuleRuleAndOr> ors,

            Outputs.CostCategoryRuleRuleAndTags? tags)
        {
            Ands = ands;
            CostCategory = costCategory;
            Dimension = dimension;
            Not = not;
            Ors = ors;
            Tags = tags;
        }
    }
}
