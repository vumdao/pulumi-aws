// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Acmpca
{
    /// <summary>
    /// Attaches a resource based policy to a private CA.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Acmpca.Policy("example", new()
    ///     {
    ///         ResourceArn = aws_acmpca_certificate_authority.Example.Arn,
    ///         PolicyDetails = @$"{{                        
    ///    ""Version"":""2012-10-17"",
    ///    ""Statement"":[
    ///       {{    
    ///          ""Sid"":""1"",
    ///          ""Effect"":""Allow"",         
    ///          ""Principal"":{{                                                                                                                                               
    ///             ""AWS"":""{data.Aws_caller_identity.Current.Account_id}""                                                                                
    ///          }},
    ///          ""Action"":[
    ///             ""acm-pca:DescribeCertificateAuthority"",
    ///             ""acm-pca:GetCertificate"",
    ///             ""acm-pca:GetCertificateAuthorityCertificate"",
    ///             ""acm-pca:ListPermissions"",
    ///             ""acm-pca:ListTags""                                                                                   
    ///          ],                                                                                              
    ///          ""Resource"":""{aws_acmpca_certificate_authority.Example.Arn}""
    ///       }},
    ///       {{
    ///          ""Sid"":""1"",  
    ///          ""Effect"":""Allow"",
    ///          ""Principal"":{{
    ///             ""AWS"":""{data.Aws_caller_identity.Current.Account_id}""
    ///          }},
    ///          ""Action"":[
    ///             ""acm-pca:IssueCertificate""
    ///          ],
    ///          ""Resource"":""{aws_acmpca_certificate_authority.Example.Arn}"",
    ///          ""Condition"":{{
    ///             ""StringEquals"":{{
    ///                ""acm-pca:TemplateArn"":""arn:aws:acm-pca:::template/EndEntityCertificate/V1""
    ///             }}
    ///          }}
    ///       }}
    ///    ]
    /// }}
    /// ",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// `aws_acmpca_policy` can be imported using the `resource_arn` value.
    /// 
    /// ```sh
    ///  $ pulumi import aws:acmpca/policy:Policy example arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012
    /// ```
    /// </summary>
    [AwsResourceType("aws:acmpca/policy:Policy")]
    public partial class Policy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// JSON-formatted IAM policy to attach to the specified private CA resource.
        /// </summary>
        [Output("policy")]
        public Output<string> PolicyDetails { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the private CA to associate with the policy.
        /// </summary>
        [Output("resourceArn")]
        public Output<string> ResourceArn { get; private set; } = null!;


        /// <summary>
        /// Create a Policy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Policy(string name, PolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:acmpca/policy:Policy", name, args ?? new PolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Policy(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:acmpca/policy:Policy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Policy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Policy Get(string name, Input<string> id, PolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new Policy(name, id, state, options);
        }
    }

    public sealed class PolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON-formatted IAM policy to attach to the specified private CA resource.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> PolicyDetails { get; set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the private CA to associate with the policy.
        /// </summary>
        [Input("resourceArn", required: true)]
        public Input<string> ResourceArn { get; set; } = null!;

        public PolicyArgs()
        {
        }
        public static new PolicyArgs Empty => new PolicyArgs();
    }

    public sealed class PolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// JSON-formatted IAM policy to attach to the specified private CA resource.
        /// </summary>
        [Input("policy")]
        public Input<string>? PolicyDetails { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the private CA to associate with the policy.
        /// </summary>
        [Input("resourceArn")]
        public Input<string>? ResourceArn { get; set; }

        public PolicyState()
        {
        }
        public static new PolicyState Empty => new PolicyState();
    }
}