// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    /**
     * Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    @Import(name="ipSetForwardedIpConfig")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig;

    /**
     * @return Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs>> ipSetForwardedIpConfig() {
        return Optional.ofNullable(this.ipSetForwardedIpConfig);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.ipSetForwardedIpConfig = $.ipSetForwardedIpConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IP Set that this statement references.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the IP Set that this statement references.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetForwardedIpConfig(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs> ipSetForwardedIpConfig) {
            $.ipSetForwardedIpConfig = ipSetForwardedIpConfig;
            return this;
        }

        /**
         * @param ipSetForwardedIpConfig Configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that&#39;s reported by the web request origin. See IPSet Forwarded IP Config below for more details.
         * 
         * @return builder
         * 
         */
        public Builder ipSetForwardedIpConfig(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfigArgs ipSetForwardedIpConfig) {
            return ipSetForwardedIpConfig(Output.of(ipSetForwardedIpConfig));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}