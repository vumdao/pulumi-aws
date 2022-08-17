// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInfrastructureConfigurationInstanceMetadataOption {
    /**
     * @return Number of hops that an instance can traverse to reach its destonation.
     * 
     */
    private final Integer httpPutResponseHopLimit;
    /**
     * @return Whether a signed token is required for instance metadata retrieval requests.
     * 
     */
    private final String httpTokens;

    @CustomType.Constructor
    private GetInfrastructureConfigurationInstanceMetadataOption(
        @CustomType.Parameter("httpPutResponseHopLimit") Integer httpPutResponseHopLimit,
        @CustomType.Parameter("httpTokens") String httpTokens) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    /**
     * @return Number of hops that an instance can traverse to reach its destonation.
     * 
     */
    public Integer httpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }
    /**
     * @return Whether a signed token is required for instance metadata retrieval requests.
     * 
     */
    public String httpTokens() {
        return this.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationInstanceMetadataOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer httpPutResponseHopLimit;
        private String httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationInstanceMetadataOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Objects.requireNonNull(httpPutResponseHopLimit);
            return this;
        }
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = Objects.requireNonNull(httpTokens);
            return this;
        }        public GetInfrastructureConfigurationInstanceMetadataOption build() {
            return new GetInfrastructureConfigurationInstanceMetadataOption(httpPutResponseHopLimit, httpTokens);
        }
    }
}