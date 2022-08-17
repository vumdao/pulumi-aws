// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.IndexUserTokenConfigurationsJsonTokenTypeConfiguration;
import com.pulumi.aws.kendra.outputs.IndexUserTokenConfigurationsJwtTokenTypeConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IndexUserTokenConfigurations {
    /**
     * @return A block that specifies the information about the JSON token type configuration.
     * 
     */
    private final @Nullable IndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
    /**
     * @return A block that specifies the information about the JWT token type configuration.
     * 
     */
    private final @Nullable IndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

    @CustomType.Constructor
    private IndexUserTokenConfigurations(
        @CustomType.Parameter("jsonTokenTypeConfiguration") @Nullable IndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration,
        @CustomType.Parameter("jwtTokenTypeConfiguration") @Nullable IndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration) {
        this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
        this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
    }

    /**
     * @return A block that specifies the information about the JSON token type configuration.
     * 
     */
    public Optional<IndexUserTokenConfigurationsJsonTokenTypeConfiguration> jsonTokenTypeConfiguration() {
        return Optional.ofNullable(this.jsonTokenTypeConfiguration);
    }
    /**
     * @return A block that specifies the information about the JWT token type configuration.
     * 
     */
    public Optional<IndexUserTokenConfigurationsJwtTokenTypeConfiguration> jwtTokenTypeConfiguration() {
        return Optional.ofNullable(this.jwtTokenTypeConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexUserTokenConfigurations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration;
        private @Nullable IndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexUserTokenConfigurations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonTokenTypeConfiguration = defaults.jsonTokenTypeConfiguration;
    	      this.jwtTokenTypeConfiguration = defaults.jwtTokenTypeConfiguration;
        }

        public Builder jsonTokenTypeConfiguration(@Nullable IndexUserTokenConfigurationsJsonTokenTypeConfiguration jsonTokenTypeConfiguration) {
            this.jsonTokenTypeConfiguration = jsonTokenTypeConfiguration;
            return this;
        }
        public Builder jwtTokenTypeConfiguration(@Nullable IndexUserTokenConfigurationsJwtTokenTypeConfiguration jwtTokenTypeConfiguration) {
            this.jwtTokenTypeConfiguration = jwtTokenTypeConfiguration;
            return this;
        }        public IndexUserTokenConfigurations build() {
            return new IndexUserTokenConfigurations(jsonTokenTypeConfiguration, jwtTokenTypeConfiguration);
        }
    }
}