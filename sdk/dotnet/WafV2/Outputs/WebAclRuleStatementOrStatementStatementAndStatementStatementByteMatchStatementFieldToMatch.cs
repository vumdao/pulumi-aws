// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementOrStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPath? uriPath)
        {
            AllQueryArguments = allQueryArguments;
            Body = body;
            Method = method;
            QueryString = queryString;
            SingleHeader = singleHeader;
            SingleQueryArgument = singleQueryArgument;
            UriPath = uriPath;
        }
    }
}