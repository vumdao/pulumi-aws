// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAmazonElasticsearchArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAmazonElasticsearchArgs Empty = new DataSourceParametersAmazonElasticsearchArgs();

    /**
     * The OpenSearch domain.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The OpenSearch domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    private DataSourceParametersAmazonElasticsearchArgs() {}

    private DataSourceParametersAmazonElasticsearchArgs(DataSourceParametersAmazonElasticsearchArgs $) {
        this.domain = $.domain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceParametersAmazonElasticsearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceParametersAmazonElasticsearchArgs $;

        public Builder() {
            $ = new DataSourceParametersAmazonElasticsearchArgs();
        }

        public Builder(DataSourceParametersAmazonElasticsearchArgs defaults) {
            $ = new DataSourceParametersAmazonElasticsearchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The OpenSearch domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The OpenSearch domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public DataSourceParametersAmazonElasticsearchArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            return $;
        }
    }

}