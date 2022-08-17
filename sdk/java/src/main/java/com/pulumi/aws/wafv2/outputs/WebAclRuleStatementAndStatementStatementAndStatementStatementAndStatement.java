// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement {
    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement> statements;

    @CustomType.Constructor
    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement(@CustomType.Parameter("statements") List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement> statements) {
        this.statements = statements;
    }

    /**
     * @return Statements to combine with `AND` logic. You can use any statements that can be nested. See Statement above for details.
     * 
     */
    public List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement> statements() {
        return this.statements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder statements(List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatement... statements) {
            return statements(List.of(statements));
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatement(statements);
        }
    }
}