// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs();

    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs> all;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="includedPaths")
    private @Nullable Output<List<String>> includedPaths;

    public Optional<Output<List<String>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs $) {
        this.all = $.all;
        this.includedPaths = $.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        public Builder all(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        public Builder includedPaths(@Nullable Output<List<String>> includedPaths) {
            $.includedPaths = includedPaths;
            return this;
        }

        public Builder includedPaths(List<String> includedPaths) {
            return includedPaths(Output.of(includedPaths));
        }

        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementRegexMatchStatementFieldToMatchJsonBodyMatchPatternArgs build() {
            return $;
        }
    }

}
