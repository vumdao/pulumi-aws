// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.aws.ecs.outputs.ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthority;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceServiceConnectConfigurationServiceTls {
    /**
     * @return The details of the certificate authority which will issue the certificate.
     * 
     */
    private ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthority issuerCertAuthority;
    /**
     * @return The KMS key used to encrypt the private key in Secrets Manager.
     * 
     */
    private @Nullable String kmsKey;
    /**
     * @return The ARN of the IAM Role that&#39;s associated with the Service Connect TLS.
     * 
     */
    private @Nullable String roleArn;

    private ServiceServiceConnectConfigurationServiceTls() {}
    /**
     * @return The details of the certificate authority which will issue the certificate.
     * 
     */
    public ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthority issuerCertAuthority() {
        return this.issuerCertAuthority;
    }
    /**
     * @return The KMS key used to encrypt the private key in Secrets Manager.
     * 
     */
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    /**
     * @return The ARN of the IAM Role that&#39;s associated with the Service Connect TLS.
     * 
     */
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceServiceConnectConfigurationServiceTls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthority issuerCertAuthority;
        private @Nullable String kmsKey;
        private @Nullable String roleArn;
        public Builder() {}
        public Builder(ServiceServiceConnectConfigurationServiceTls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuerCertAuthority = defaults.issuerCertAuthority;
    	      this.kmsKey = defaults.kmsKey;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder issuerCertAuthority(ServiceServiceConnectConfigurationServiceTlsIssuerCertAuthority issuerCertAuthority) {
            if (issuerCertAuthority == null) {
              throw new MissingRequiredPropertyException("ServiceServiceConnectConfigurationServiceTls", "issuerCertAuthority");
            }
            this.issuerCertAuthority = issuerCertAuthority;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {

            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(@Nullable String roleArn) {

            this.roleArn = roleArn;
            return this;
        }
        public ServiceServiceConnectConfigurationServiceTls build() {
            final var _resultValue = new ServiceServiceConnectConfigurationServiceTls();
            _resultValue.issuerCertAuthority = issuerCertAuthority;
            _resultValue.kmsKey = kmsKey;
            _resultValue.roleArn = roleArn;
            return _resultValue;
        }
    }
}
