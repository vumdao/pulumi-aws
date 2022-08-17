// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleActionBlockCustomResponseResponseHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleActionBlockCustomResponse {
    /**
     * @return References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    private final @Nullable String customResponseBodyKey;
    /**
     * @return The HTTP status code to return to the client.
     * 
     */
    private final Integer responseCode;
    /**
     * @return The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleActionBlockCustomResponseResponseHeader> responseHeaders;

    @CustomType.Constructor
    private RuleGroupRuleActionBlockCustomResponse(
        @CustomType.Parameter("customResponseBodyKey") @Nullable String customResponseBodyKey,
        @CustomType.Parameter("responseCode") Integer responseCode,
        @CustomType.Parameter("responseHeaders") @Nullable List<RuleGroupRuleActionBlockCustomResponseResponseHeader> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = responseCode;
        this.responseHeaders = responseHeaders;
    }

    /**
     * @return References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    public Optional<String> customResponseBodyKey() {
        return Optional.ofNullable(this.customResponseBodyKey);
    }
    /**
     * @return The HTTP status code to return to the client.
     * 
     */
    public Integer responseCode() {
        return this.responseCode;
    }
    /**
     * @return The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    public List<RuleGroupRuleActionBlockCustomResponseResponseHeader> responseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customResponseBodyKey;
        private Integer responseCode;
        private @Nullable List<RuleGroupRuleActionBlockCustomResponseResponseHeader> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }
        public Builder responseCode(Integer responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }
        public Builder responseHeaders(@Nullable List<RuleGroupRuleActionBlockCustomResponseResponseHeader> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(RuleGroupRuleActionBlockCustomResponseResponseHeader... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }        public RuleGroupRuleActionBlockCustomResponse build() {
            return new RuleGroupRuleActionBlockCustomResponse(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}