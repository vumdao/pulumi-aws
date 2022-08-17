// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationSslConfiguration {
    /**
     * @return The contents of the certificate&#39;s domain.crt file.
     * 
     */
    private final String certificate;
    /**
     * @return Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    private final @Nullable String chain;
    /**
     * @return The private key; the contents of the certificate&#39;s domain.key file.
     * 
     */
    private final String privateKey;

    @CustomType.Constructor
    private ApplicationSslConfiguration(
        @CustomType.Parameter("certificate") String certificate,
        @CustomType.Parameter("chain") @Nullable String chain,
        @CustomType.Parameter("privateKey") String privateKey) {
        this.certificate = certificate;
        this.chain = chain;
        this.privateKey = privateKey;
    }

    /**
     * @return The contents of the certificate&#39;s domain.crt file.
     * 
     */
    public String certificate() {
        return this.certificate;
    }
    /**
     * @return Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    public Optional<String> chain() {
        return Optional.ofNullable(this.chain);
    }
    /**
     * @return The private key; the contents of the certificate&#39;s domain.key file.
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSslConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private @Nullable String chain;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSslConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.chain = defaults.chain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder chain(@Nullable String chain) {
            this.chain = chain;
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }        public ApplicationSslConfiguration build() {
            return new ApplicationSslConfiguration(certificate, chain, privateKey);
        }
    }
}