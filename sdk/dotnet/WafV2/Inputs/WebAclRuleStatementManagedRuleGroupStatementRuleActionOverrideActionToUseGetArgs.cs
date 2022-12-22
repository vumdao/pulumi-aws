// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies that AWS WAF should allow requests by default. See Allow below for details.
        /// </summary>
        [Input("allow")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseAllowGetArgs>? Allow { get; set; }

        /// <summary>
        /// Specifies that AWS WAF should block requests by default. See Block below for details.
        /// </summary>
        [Input("block")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseBlockGetArgs>? Block { get; set; }

        /// <summary>
        /// Instructs AWS WAF to run a Captcha check against the web request. See Captcha below for details.
        /// </summary>
        [Input("captcha")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCaptchaGetArgs>? Captcha { get; set; }

        /// <summary>
        /// Instructs AWS WAF to count the web request and allow it. See Count below for details.
        /// </summary>
        [Input("count")]
        public Input<Inputs.WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseCountGetArgs>? Count { get; set; }

        public WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs()
        {
        }
        public static new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs Empty => new WebAclRuleStatementManagedRuleGroupStatementRuleActionOverrideActionToUseGetArgs();
    }
}