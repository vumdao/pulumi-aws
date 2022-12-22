// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        [Input("allQueryArguments")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchAllQueryArgumentsGetArgs>? AllQueryArguments { get; set; }

        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        [Input("body")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchBodyGetArgs>? Body { get; set; }

        /// <summary>
        /// Inspect the cookies in the web request. See Cookies below for details.
        /// </summary>
        [Input("cookies")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchCookiesGetArgs>? Cookies { get; set; }

        [Input("headers")]
        private InputList<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs>? _headers;

        /// <summary>
        /// Inspect the request headers. See Headers below for details.
        /// </summary>
        public InputList<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        [Input("jsonBody")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchJsonBodyGetArgs>? JsonBody { get; set; }

        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        [Input("method")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchMethodGetArgs>? Method { get; set; }

        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        [Input("queryString")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchQueryStringGetArgs>? QueryString { get; set; }

        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        [Input("singleHeader")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleHeaderGetArgs>? SingleHeader { get; set; }

        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        [Input("singleQueryArgument")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchSingleQueryArgumentGetArgs>? SingleQueryArgument { get; set; }

        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        [Input("uriPath")]
        public Input<Inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchUriPathGetArgs>? UriPath { get; set; }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchGetArgs()
        {
        }
        public static new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchGetArgs Empty => new WebAclRuleStatementAndStatementStatementNotStatementStatementAndStatementStatementRegexMatchStatementFieldToMatchGetArgs();
    }
}